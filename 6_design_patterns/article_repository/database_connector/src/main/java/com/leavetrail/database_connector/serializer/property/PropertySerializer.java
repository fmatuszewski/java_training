/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leavetrail.database_connector.serializer.property;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Set;

/**
 *
 * @author user
 */
public class PropertySerializer {
    
   PropertiesSerializable serializable; 
   
   
   
   
   
   public void serialize(PropertiesSerializable value){
   
   
   }
   public PropertiesSerializable deSerialize(){
   
       return null;
   }
   public void saveConfiguration(){
       
         try (OutputStream output = new FileOutputStream("/Users/user/Desktop/Testowy/config2.properties")) {

            Properties prop = new Properties();

            // set the properties value
            prop.setProperty("db.url", "localhost");
            prop.setProperty("db.user", "fmatusze");
            prop.setProperty("db.password", "password");
            prop.setProperty("db.status", "active");
            prop.setProperty("db.performance", "good");
            prop.setProperty("db.type", "relational");
            

            // save properties to project root folder
            prop.store(output, null);

            System.out.println(prop);

        } catch (IOException io) {
            io.printStackTrace();
        }

         
   }
   public void loadConfiguration(){
          try (InputStream input = new FileInputStream("/Users/user/Desktop/Testowy/config.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            System.out.println(prop.getProperty("db.url"));
            System.out.println(prop.getProperty("db.user"));
            System.out.println(prop.getProperty("db.password"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
   }
   
   public void loadConfigurationFromResource(){
   
     try (InputStream input = PropertySerializer.class.getClassLoader().getResourceAsStream("config.properties")) {

            Properties prop = new Properties();

            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }

            //load a properties file from class path, inside static method
            prop.load(input);

            //get the property value and print it out
            System.out.println(prop.getProperty("db.url"));
            System.out.println(prop.getProperty("db.user"));
            System.out.println(prop.getProperty("db.password"));
            
            

        } catch (IOException ex) {
            ex.printStackTrace();
        }

   
   }
    
    
   
   private void printAll(String filename) {

        try (InputStream input = getClass().getClassLoader().getResourceAsStream(filename)) {

            Properties prop = new Properties();

            if (input == null) {
                System.out.println("Sorry, unable to find " + filename);
                return;
            }

            prop.load(input);

            // Java 8 , print key and values
            prop.forEach((key, value) -> System.out.println("Key : " + key + ", Value : " + value));

            // Get all keys
            prop.keySet().forEach(x -> System.out.println(x));

            Set<Object> objects = prop.keySet();

            /*Enumeration e = prop.propertyNames();
            while (e.hasMoreElements()) {
                String key = (String) e.nextElement();
                String value = prop.getProperty(key);
                System.out.println("Key : " + key + ", Value : " + value);
            }*/

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    
}
