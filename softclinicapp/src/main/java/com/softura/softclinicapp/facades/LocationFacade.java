package com.softura.softclinicapp.facades;

import java.util.List;

public abstract  class LocationFacade {

    abstract List<String> findHospitalNearTome(long pincode);
    abstract List<String> findOrganDonors(long pincode);
    abstract List<String> findAmbulance(long pincode);
}
