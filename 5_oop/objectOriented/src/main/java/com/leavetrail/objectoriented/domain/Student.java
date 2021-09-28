/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leavetrail.objectoriented.domain;

/**
 *
 * @author user
 */
public class Student {
    
    public final String name;
    public String pesel;
    public final double height;
    public double weight;
    public int semester;
    
    public Student(){
        this.name = "Unknown";
        this.height = 0;
    }
    public Student(String fName, double hHeight){
        this.name = fName;
        this.height = hHeight;
    }
    
    public void printParameters(){
        System.out.printf("Imie: %s \n",   this.name );
        System.out.printf("Wzrost: %.2f \n",this.height);
        System.out.printf("Waga: %.2f\n", this.weight);
        System.out.printf("Pesel: %s\n", this.pesel);
    }
    
}
