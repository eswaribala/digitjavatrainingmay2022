package com.softura.softclinicapp.models;

public class SimulationThread implements Runnable{

	private Vehicle vehicle;
	private String regNo;
	
	public SimulationThread(Vehicle vehicle, String threadName,String regNo)
	{
		this.vehicle=vehicle;
		this.regNo=regNo;
		new Thread(this,threadName).start();	
	}
		
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized(this.vehicle)
		{
			this.vehicle.vehicleMessage(regNo);
		}
		
		
	}

}
