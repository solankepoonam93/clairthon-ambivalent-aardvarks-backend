package com.cv.srm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "UserRnrDetail")
@EqualsAndHashCode(callSuper=true)
public class UserRnrDetail extends AbstractModel {

    /**
	 * 
	 */
	private static final long serialVersionUID = -9093989982354805453L;

	@JsonIgnore
    @ManyToOne
    @JoinColumn(name="userId")
    private User user;

	@JsonIgnore
    @ManyToOne
    @JoinColumn(name="rnrItemId")
    private RnrItem rnrItem;

    @Column(name = "status")
    private String status;

    @Column(name = "handsOnExposure")
    private String handsOnExposure;

    @Column(name = "selfRating")
    private Integer selfRating;

    @Column(name = "selfReviewComments")
    private String selfReviewComments;

    @Column(name = "managerRating")
    private Integer managerRating;

    @Column(name = "managerReviewComments")
    private Integer managerReviewComments;
    
}
