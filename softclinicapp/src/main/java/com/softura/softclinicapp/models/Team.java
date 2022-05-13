package com.softura.softclinicapp.models;

import com.softura.softclinicapp.facades.TestInterface;
import lombok.Data;

//outer class
public class Team {

    private long teamSize;
    private static String clinicName;

    private boolean active;



//kind of lazy loading
    public void PreTestsICU(){
        //local inner class

        //no need of access specifiers
        @Data
        class ICUTest{

             double bp;
             int pulse;
             String bloodGroup;
             boolean concious;
        }

      ICUTest icuTest=new ICUTest();
        icuTest.setBloodGroup("O+");
      System.out.println("Blood Group"+icuTest.getBloodGroup());
    }

    //static inner class

   public class Surgeon  implements TestInterface {

       private boolean active;
       public Surgeon(){
           //Team.this.teamSize=10;
          //Team.this.active=true;
           System.out.println("Inner class Active Status"+active);
         //  System.out.println("outer class Active Status"+Team.this.active);

           //teamSize=100L;
           clinicName="Global Hospital";
       }

       @Override
       public void test() {

       }
   }
}
