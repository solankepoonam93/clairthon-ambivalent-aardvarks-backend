package com.cv.srm.api.response.base;

import java.io.Serializable;

public class ApiResponse<E> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -348091195996700745L;

	private E payload;

	public E getPayload() {
		return payload;
	}
	public void setPayload(E payload) {
		this.payload = payload;
	}

}
