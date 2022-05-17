package com.softura.softclinicapp.models;

import lombok.Data;

@Data
public class Vehicle {

	private String regNo;



	public void vehicleMessage(String vehicleNo)
	{
		System.out.print("Thread executes="+Thread.currentThread().getName()+"Vehicle No="+vehicleNo);
		new Bridge().bridgeMessage();
		new TollBooth().tollMessage();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n");
	}
	
	
}
