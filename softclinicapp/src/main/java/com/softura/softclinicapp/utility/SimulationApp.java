package com.softura.softclinicapp.utility;

import com.softura.softclinicapp.models.SimulationThread;
import com.softura.softclinicapp.models.Vehicle;

import java.util.Random;



public class SimulationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle vehicle =new Vehicle();
		
		SimulationThread[] simulations=new SimulationThread[5];
		
		for(int i=0;i<simulations.length;i++)
		{			
			simulations[i]=new SimulationThread(vehicle,"Thread-"
			+i,"TN-32-Ak"+new Random().nextInt(10000));
			
		}
		
		
		
	}

}
