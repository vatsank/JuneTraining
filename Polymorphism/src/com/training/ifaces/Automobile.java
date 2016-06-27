package com.training.ifaces;

/**
 * 
 * @author v_skris4
 *  Top Level Interface for 
 *  representing  Automobile
 *  
 *  @version 1.0
 */
public interface Automobile {
	
	public static final String SHOWROOM_NAME="RAMESH CARS";
	
	
	/*
	 *  All the Methods in the Interface or Implicitly Public and Abstract
	 *  
	 */
	
	
	public abstract double getPrice();
	public String getColor();
	String getModel();
	

}
