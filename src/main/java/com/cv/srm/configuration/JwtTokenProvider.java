package com.cv.srm.configuration;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import com.cv.srm.constants.AppConstants;
import com.cv.srm.enums.ExceptionCodes;
import com.cv.srm.exception.RnRTrackerException;
import com.cv.srm.model.Role;
import com.cv.srm.model.User;
import com.cv.srm.util.AppUtils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtTokenProvider {

	/**
	 * THIS IS NOT A SECURE PRACTICE! For simplicity, we are storing a static key here. Ideally, in a microservices
	 * environment, this key would be kept on a config-server.
	 */
	@Value("${security.jwt.token.secret-key:secret-key}")
	private String secretKey;

	@Value("${security.jwt.token.expire-length:3600000}")
	private long validityInMilliseconds = 3600000; // 1h

//	@Autowired
//	private UserDetailServiceImpl myUserDetails;

	@PostConstruct
	protected void init() {
		secretKey = Base64.getEncoder().encodeToString(secretKey.getBytes());
	}

	public String createToken(User appUser) { // List<GrantedAuthority> roles) {

		Set<Role> userRoles = appUser.getRoles();

		Claims claims = Jwts.claims().setSubject(appUser.getEmail());
		claims.put(AppConstants.CLAIM_TOKEN_AUTHORITIES, getGrantedAuthorities(userRoles));
		claims.put(AppConstants.CLAIM_TOKEN_USER_ID, appUser.getId());
		//claims.put(AppConstants.CLAIM_TOKEN_CLIENT_ID, appUser.getClient().getClientId());

		Date now = new Date();
		//Date validity = new Date(now.getTime() + validityInMilliseconds);

		return Jwts.builder()//
				.setClaims(claims)//
				.setIssuedAt(now)//
				//.setExpiration(validity)// Setting no expiration will keep the session forever.
				.signWith(SignatureAlgorithm.HS256, secretKey)//
				.compact();
	}

	@SuppressWarnings("unchecked")
	public Authentication getAuthentication(String authToken) {

		if (AppUtils.isNotBlankOrNullString(authToken)) {
			Claims tokenClaims = getClaimsFromToken(authToken);
			if (tokenClaims != null) {
				String userEmail = tokenClaims.getSubject();
				List<String> userRoles = (List<String>) tokenClaims.get(AppConstants.CLAIM_TOKEN_AUTHORITIES);
				return new UsernamePasswordAuthenticationToken(userEmail, "",
						userRoles.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList()));
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	public String getEmail(String token) {
		return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody().getSubject();
	}

	public Claims getClaimsFromToken(String authToken) {
		return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(authToken).getBody();// .get(attributeKey);
	}

	public boolean validateToken(String token) throws RnRTrackerException {
		try {
			Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token);
			return true;
		} catch (JwtException | IllegalArgumentException ex) {
			throw new RnRTrackerException(ExceptionCodes.INVALID_EXPIRED_TOKEN, ex, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public List<String> getGrantedAuthorities(Set<Role> userRoles) {
		List<String> userAuthorities = new ArrayList<>();
		if (AppUtils.isNotBlankOrNullCol(userRoles)) {
			for (Role role : userRoles) {
				userAuthorities.add(role.getName());
			}
		}
		return userAuthorities;
	}
}
