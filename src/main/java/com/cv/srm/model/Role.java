package com.cv.srm.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "Role")
@EqualsAndHashCode(callSuper=true)
public class Role extends AbstractModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5035020240175652744L;

	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String desc;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "roles")
    private Set<User> users = new HashSet<>();

}
