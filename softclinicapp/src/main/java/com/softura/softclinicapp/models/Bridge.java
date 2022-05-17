package com.softura.softclinicapp.models;

public class Bridge {

	public void bridgeMessage()
	{
		System.out.print("\t crossing bridge");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
