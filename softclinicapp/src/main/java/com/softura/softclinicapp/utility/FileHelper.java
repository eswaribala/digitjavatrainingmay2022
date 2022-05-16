package com.softura.softclinicapp.utility;

import com.sun.org.apache.xml.internal.utils.res.XResourceBundle;

import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;

public class FileHelper {

    static ResourceBundle resourceBundle;

    public static File generateFile() throws IOException {

        resourceBundle=ResourceBundle.getBundle("healthcare");
        String fileName=resourceBundle.getString("fileName");
        String folderName=resourceBundle.getString("folderName");
        File dir=new File(folderName);
        if(!dir.exists())
            dir.mkdir();
        File file=new File(folderName,fileName);
         if(!file.exists())
             file.createNewFile();

        return new File(folderName,fileName);

    }

}
