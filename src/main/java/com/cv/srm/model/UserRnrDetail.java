package com.cv.srm.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRnrDetail extends AbstractModel {

    @Column
    private String userId;

    @Column
    private String rnrItemId;

    @Column
    private String priority;

    @Column
    private String actionItem;

    @Column
    private String actionItemStatus;

    @Column
    private String handsOnExposure;

    @Column
    private Integer selfRating;

    @Column
    private String selfReviewComments;

    @Column
    private Integer managerRating;

    @Column
    private Integer managerReviewComments;
}
