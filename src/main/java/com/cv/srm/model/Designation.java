package com.cv.srm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "Designation")
@EqualsAndHashCode(callSuper=true)
public class Designation extends AbstractModel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4840235535115282806L;

	@Column
    private String name;

    @Column
    private String band;

}
