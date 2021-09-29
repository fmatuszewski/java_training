/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leavetrail.io;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner



    
    
//       BufferedReader reader = 
//  new BufferedReader(new FileReader("src/main/resources/input.txt"));
        
        
        
        
    }
    
    
    private void runScanner(){
        
         String input = "hello\n"
                + "hello1\n"
                + "hello2\n"
                + "hello3\n"
                + "hello4\n"
                + "hello5\n";
        
        InputStream stream = System.in;
        
        
        Scanner scanner = new Scanner(stream);
        System.out.println("Type crtl + c to finish ");
        
        do{
            
            System.out.println("Please write your name: ");
            String name = scanner.next();
            System.out.printf("Please write your name: \n" );
            Integer age = scanner.nextInt();
            
            System.out.printf("Name: %s, Age: %d\n", name,age);
           
        }while(scanner.hasNext());
        
    }
    
}
