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
public class User extends AbstractModel {

    @Column
    private String name;

    @Column
    private String emailId;

    @Column
    private String designationId;

    @Column
    private String isManager;

    @Column
    private String managerId = "Admin";

}
