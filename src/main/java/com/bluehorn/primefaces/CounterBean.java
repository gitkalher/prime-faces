package com.bluehorn.primefaces;

import java.awt.event.ActionEvent;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CounterBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3139451801051378981L;

	public CounterBean() {
	}

	private int counter;

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public void increment(ActionEvent actionEvent) {
		this.counter++;
	}
	
}
