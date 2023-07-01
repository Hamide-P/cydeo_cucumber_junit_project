package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1- Create the Properties object (create object)
    //make it "private" so we are limiting access to the object
    //"static" is to make sure its created and loaded before everything else.

    // By making it static, it ensures that the object is created and loaded only once, regardless of how many instances of the class are created.
    private static Properties properties = new Properties();


    // a static block is being used to open a file using FileInputStream and load its contents into a Properties object
    //The static block is used to create and initialize the Properties object before everything else.
    static {

        try {
            //2- Open file using FileInputStream (open file)
            FileInputStream file = new FileInputStream("configuration.properties");
            //3- Load the "properties" object with "file" (load properties)
            properties.load(file);


            //close the file in the memory
            file.close();

            // the FileInputStream is created with the file name "configuration.properties". If the file is not found, the exception will be thrown and needs to be handled appropriately.

        } catch (IOException e) {
            System.out.println("FILE NOT FOUND WITH GIVEN PATH!!!");
            e.printStackTrace();
        }
    }

//create a utility method to use the object to read
    //4- Use "properties" object to read from the file (read properties)

    public static String getProperty(String keyword) {
        return properties.getProperty(keyword);
    } // // This getProperty method retrieves a property value based on the given keyword.
}
