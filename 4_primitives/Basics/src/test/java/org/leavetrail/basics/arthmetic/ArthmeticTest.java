/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.leavetrail.basics.arthmetic;

import com.leavetrail.basics.Start;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author user
 */
public class ArthmeticTest {
    
    public ArthmeticTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    //Typy danych
    //Zmienne
    @Test public void shouldCreateVariables(){
        String firstName;
        String lastName;
        int hour, minute;
        
        firstName = "Hello!";  // give message the value "Hello!"
//        firstName = 123;   //Not legal
        hour = 11;           // assign the value 11 to hour
        minute = 59;         // set minute to 59
        
        
    }
    
    @Test public void shouldPrintVariables(){
        String text = "First Line";
        System.out.println(text);
        
        int hour = 11;
        int minute = 59;
        System.out.print("The current time is "); 
        System.out.print(hour);
        System.out.print(":"); 
        System.out.print(minute); 
        System.out.println(".");
    
    }
    //Zakres widoczności zmiennych
    //Operatory matematyczne i logiczne
    @Test public void shouldMakeCalculations(){
        
        System.out.format("2+2 = %d\n",2+2);
        System.out.format("2-2 = %d\n",2-2);
        System.out.format("2/2 = %d\n",2/2);
        System.out.format("10/2 = %d\n",10/2);
        System.out.format("10/3 = %d\n",10/3);
    
        assertEquals(2+2, 4 );
        assertEquals(2-2, 0);
        assertEquals(2/2, 1);
        assertEquals(10/2, 5);
        assertEquals(10/3, 3);
        
    }
    
    @Test public void shouldCreateFloatingPointVariables(){
    
        int x = 10;
        double y = 10.1;
        double z = 10.1d;
        float r = 10.2f;
        System.out.format("%d, %f, %f", x,y,z);
        
        Start.policzpoletrojkata();
      
    }
    
    //byte 1 byte -128 to 127.
    //short 2 bytes -32,768 to 32,767.
    //int 4 bytes -2,147,483,648 to 2,147,483,647.
    //long 8 bytes -9,223,372,036,854,775,808 to 9,223,372,036,854,775,80.
    //float 4 bytes 7 decimal digits.
    //double 8 bytes 16 decimal digits.
    @Test public void shouldAssignMaxMinValues(){
    
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        
        
        System.out.format("%d %d %d %d", ++a,++b,++c);
        
        assertEquals(-128,a);
        assertEquals(-32768,b);
        assertEquals(-2147483648,c);
       
    
    
    
    }
    @Test public void shouldPresentNumericConventions(){
//    Numeric conventions
//    int a = 1.1; // compiler error
        double b = 1;  // legal, but bad style
        double c = 1 / 3;  // common mistake
        double d = 1.0 / 3.0; // correct

        assertEquals(1,b);
        assertEquals(0,c);
        assertEquals(0.3333333333333333,d);
        
 
    }
    
    @Test public void shouldDisplayRoundingError(){
        
        double x = 0.1 * 10;
        System.out.println(x); 
        
        double y = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println(y);
    
        assertEquals(1.0,x);
        assertEquals(0.9999999999999999,y);
        
//        But if you need absolute precision, use integers instead.
//        double balance = 123.45; // potential rounding error
//        int balance = 12345; // total number of cents
    }



    //Compiler Error Messages
    //compile-time errors
    //run-time errors
    //logic errors
    //Funkcje matematyczne i wielkie liczby
    @Test public void shouldCreateFunction(){}
    //Konwersja i rzutowanie typów
    @Test public void shouldTruncateInteger(){}
    @Test public void shouldThrowInvalidDatatypeError(){}
    @Test public void shouldCastVariable(){}
        
        
        

}
