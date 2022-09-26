package com.cv.srm.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "Category")
@EqualsAndHashCode(callSuper=true)
public class Category extends AbstractModel {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3837704817920758030L;

	@Column
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
    private List<FocusArea> focusAreas;

}
