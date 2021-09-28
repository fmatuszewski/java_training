/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leavetrail.objectoriented;

import com.leavetrail.objectoriented.domain.Book;
import com.leavetrail.objectoriented.domain.Literature;
import com.leavetrail.objectoriented.domain.Poem;
import com.leavetrail.objectoriented.domain.Student;

/**
 *
 * @author user
 */
public class ObjectOriented {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student;
        
        student = new Student("Karol",180);
        
//        student.name = "Filip";
//        student.height = 180;
        student.pesel = "838978439433433";
        student.weight = 80;
        student.weight += 2;
        
        
        System.out.println(student.name);
        student.printParameters();
        
//        Tutaj tworzymy nowe obiekty klasy Book i Poem wykorzystując ich konstruktory.
        Book book = new Book("Pan Tadeusz","Adam Mickiewicz","","Powieść");
        Poem poem = new Poem("Pan Tadeusz","Adam Mickiewicz","Wiersz");
        

        System.out.println(book);
        System.out.println(poem.toString());
        
        Book book2;
        
//        Tutaj przykład polimorfizmu.
//        Klasy Book i Poem które dziedziczą po klasie Literature
//        mogą być przechowywane w zmiennych typu Literature.
        Literature[] literature = new Literature[2];
        literature[0] = book;
        literature[1] = poem;
        
        System.out.println("------------------");
        for( Literature l : literature){
//            czy mozna uzyc metody z literature.

            System.out.println(l.toString());
        }
        
        
        
        
        
    }
    

    
}



