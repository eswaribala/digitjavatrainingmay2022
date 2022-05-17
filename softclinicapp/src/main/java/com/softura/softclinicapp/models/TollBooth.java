package com.softura.softclinicapp.models;

public class TollBooth {
	
	public void tollMessage()
	{
		System.out.print("\t crossing toll booth");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
