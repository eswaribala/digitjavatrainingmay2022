package com.softura.softclinic.appointments.utility;

import com.softura.softclinic.appointments.models.Appointment;
import lombok.extern.slf4j.Slf4j;


import java.time.LocalDate;
import java.util.Scanner;

public class AppointmentApp {

    public static  void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //read the values
        System.out.println("Enter number of appointments....");
        int appts=scanner.nextInt();
        scanner.nextLine();
        //array of appointments
        Appointment[] appointments=new Appointment[appts];
        //ref variable
        Appointment appointment=null;
        //loop with variables
        for(int i=0;i<appointments.length;i++) {

            //appointment object
             appointment = new Appointment();
             System.out.println("Enter Patient Mobile No");
             appointment.setPatientMobileNo(scanner.nextLong());
             scanner.nextLine();
             System.out.println("Enter Date of appointment yyyy-mm-dd");
             appointment.setDoa(LocalDate.parse(scanner.nextLine()));
             System.out.println("Enter Time of appointment HH:MM");
             appointment.setTime(scanner.nextLine());
             System.out.println("Enter Doctor Name");
             appointment.setDoctorName(scanner.nextLine());

            //add object to array
             appointments[i]=appointment;

         }

          //view the appointment list
        //enhanced for loop
        for(Appointment appointmentObj : appointments)
            System.out.println(appointmentObj);

       //compare the appointment status

        LocalDate currentDate=LocalDate.now();
         //conditional statement
        if((currentDate.equals(appointments[0].getDoa()))||(currentDate.isBefore(appointments[0].getDoa()))) {
            System.out.println("Result.....");
            System.out.println("Valid Appointment");
        }
        else {
            System.out.println("Result.....");
            System.out.println("Invalid Appointment...");
        }

    }
}
