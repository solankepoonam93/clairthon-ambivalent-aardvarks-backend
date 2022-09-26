package com.cv.srm.model;


import static com.cv.srm.util.DateUtil.getUTCZonedDateTime;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@MappedSuperclass
public class AbstractModel implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2018144731445558752L;

	@Id
    @Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @JsonIgnore
	@Column(name = "createdBy", nullable = false, length = 36)
    private String createdBy;

    @JsonIgnore
    @Column(name = "createdDate", nullable = false)
    private ZonedDateTime createdDate;

    @JsonIgnore
    @Column(name = "modifiedBy", length = 36, nullable = false)
    private String modifiedBy;

    @JsonIgnore
    @Column(name = "modifiedDate", nullable = false)
    private ZonedDateTime modifiedDate;

    //@PrePersist
    void onCreate() throws Exception {
        this.setCreatedDate(getUTCZonedDateTime());
        this.setModifiedDate(getUTCZonedDateTime());
        this.setCreatedBy("Admin");
        this.setModifiedBy("Admin");
    }

    //@PreUpdate
    void onPersist() {
        this.setModifiedDate(getUTCZonedDateTime());
        this.setModifiedBy("Admin");
    }
}
