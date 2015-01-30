package com.bluehorn.primefaces;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PrimeFaces implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7008300049283389606L;

	
	private String name;

	private boolean onOff; 
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isOnOff() {
		return onOff;
	}


	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}
	
	
}
