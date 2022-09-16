package com.cv.srm.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.ZonedDateTime;

import static com.cv.srm.util.DateUtil.getUTCZonedDateTime;

@MappedSuperclass
@Getter
@Setter
public class AbstractModel implements Serializable {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @NotNull
    @Column(nullable = false, length = 36)
    protected String id;

    @CreatedBy
    @Column(name = "created_by", nullable = false, length = 36, updatable = false)
    @JsonIgnore
    @NotNull
    private String createdBy;

    @CreatedDate
    @Column(name = "created_date", nullable = false)
    @JsonIgnore
    @NotNull
    private ZonedDateTime createdDate;

    @LastModifiedBy
    @Column(name = "modified_by", length = 36, nullable = false)
    @JsonIgnore
    @NotNull
    private String modifiedBy;

    @LastModifiedDate
    @Column(name = "modified_date", nullable = false)
    @JsonIgnore
    @NotNull
    private ZonedDateTime modifiedDate;

    @PrePersist
    void onCreate() throws Exception {
        this.setCreatedDate(getUTCZonedDateTime());
        this.setModifiedDate(getUTCZonedDateTime());
        this.setCreatedBy("Admin");
        this.setModifiedBy("Admin");
    }

    @PreUpdate
    void onPersist() {
        this.setModifiedDate(getUTCZonedDateTime());
        this.setModifiedBy("Admin");
    }
}
