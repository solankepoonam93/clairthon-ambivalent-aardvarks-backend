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
public class Designation extends AbstractModel {

    @Column
    private String name;

    @Column
    private String band;

}
