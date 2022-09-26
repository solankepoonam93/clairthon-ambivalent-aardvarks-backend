package com.cv.srm.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "FocusArea")
@EqualsAndHashCode(callSuper=true)
public class FocusArea extends AbstractModel{

    /**
	 * 
	 */
	private static final long serialVersionUID = -1514481343823573828L;

	@JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="categoryId", nullable = false)
    private Category category;
	
	@Column(name = "description")
    private String description;
	
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "focusArea")
    private List<RnrItem> rnrItems;

}
