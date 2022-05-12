package com.softura.softclinicapp.facades;

import java.util.List;

//multiple inheritance

public class LocationService extends LocationFacade implements Runnable,TestInterface{
    @Override
    public List<String> findHospitalNearTome(long pincode) {
        return null;
    }

    @Override
    public List<String> findOrganDonors(long pincode) {
        return null;
    }

    @Override
    public List<String> findAmbulance(long pincode) {
        return null;
    }

    @Override
    public void run() {

    }
}
