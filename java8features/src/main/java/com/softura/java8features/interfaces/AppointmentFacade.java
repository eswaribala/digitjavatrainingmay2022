package com.softura.java8features.interfaces;

import com.softura.java8features.models.Appointment;

@FunctionalInterface
public interface AppointmentFacade {

    void create(Appointment appointment);
}
