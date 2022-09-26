package com.cv.srm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "RnrItem")
@EqualsAndHashCode(callSuper=true)
public class RnrItem extends AbstractModel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3896454901799763139L;

	@JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="focusAreaId", nullable = false)
    private FocusArea focusArea;
	
	
	@Column(name = "description")
    private String description;
	
	
	@Column(name = "rating")
    private Integer rating;

}
