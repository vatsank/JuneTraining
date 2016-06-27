package com.training.domains;

import com.training.ifaces.Automobile;

public class HyundaiCar implements Automobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 800000.00d;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "RED";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "i20";
	}

}
