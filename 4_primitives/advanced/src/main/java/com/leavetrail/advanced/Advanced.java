/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leavetrail.advanced;

/**
 *
 * @author user
 */
public class Advanced {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//     i++
      
        int i = 0;
        print( Integer.valueOf(i++).toString() );
        print( Integer.valueOf(++i).toString() );
        
//     i+=
        print( Integer.valueOf(i+=2).toString() );
        
//     i/=
        print( Integer.valueOf(i/=4).toString() );
        
        i = i / 4;
        
        int j = 4 + 5 + (i/=6);
        {
            i =  i / 6;
            j = 4 + 5 + i;
        }
        
        
//     i/j
//     i%j
       j = 4 / 2;
       j = 5 / 2;
       j = (4+1)/2;
       
       j = 5 % 2;
            
//     operator ?
//     For Statement
       
       
       
       

//     toUpperCase
//     toLowerCase
//     replace
//     format
//     concat
//     getCharAt
//     indexOf
//     ==
//     .equals()

//     print,println,printf

//JavaMath
//     max
//     pow
//     sqrt
//     random
//     min


//java.util
//.   Calendar
//    GregorianCalendar
//    now.get(Calendar.MONTH_NAME)+1
//    getTimeMillis()
//    Calendar.getInstance()
    }
    
    private static void print(String text){
        System.out.println(text);
    }
    
}
