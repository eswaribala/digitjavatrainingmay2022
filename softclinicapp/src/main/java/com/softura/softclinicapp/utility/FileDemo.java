package com.softura.softclinicapp.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args )  {

        File dir=new File("logs");
        File file=new File("logs","softclinicapp.log");
        try {
            if (dir.exists())
                System.out.println("Directory Available");
            else {
                if (!dir.isDirectory()) {
                    dir.mkdir();
                    if (file.exists()) {
                        System.out.println("Found file....");

                    } else {
                        file.createNewFile();
                    }

                }


            }
        }
        catch(IOException ex){

        }


    }
}
