package com.cv.srm.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
//@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ActionItem extends AbstractModel {

    @Column
    private String description;

    @Column
    private String status;
}
