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
public class RnrItem extends AbstractModel {

    @Column
    private String focusAreaId;

    @Column
    private String itemDesc;

    @Column
    private String url;

}
