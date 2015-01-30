package com.bluehorn.primefaces;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.component.tabview.Tab;
import org.primefaces.event.TabChangeEvent;

@ManagedBean
@SessionScoped
public class AccordionPanel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 404515071619763217L;

	public AccordionPanel() {
		// TODO Auto-generated constructor stub
	}

	private String name = "*********";
	
	private String currentTab = "-";

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCurrentTab() {
		return currentTab;
	}

	public void setCurrentTab(String currentTab) {
		this.currentTab = currentTab;
	}

	public void onChange(TabChangeEvent event) {
		Tab activeTab = event.getTab();
		currentTab = activeTab.getTitle();
		System.out.println("CurrentTab : " + currentTab);
	}

}
