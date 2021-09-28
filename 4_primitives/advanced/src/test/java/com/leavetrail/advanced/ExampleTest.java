/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leavetrail.advanced;

import org.junit.jupiter.api.Test;

/**
 *
 * @author user
 */
public class ExampleTest {

    public ExampleTest() {
    }

    @Test 
    public void mathLibrary(){
        //     max
        System.out.println(Math.max(1,2));
        //     pow
        System.out.println(Math.pow(2,3));
        //     sqrt
        System.out.println(Math.sqrt(4));
        //     random
        System.out.println( (100 * Math.random()) );
        System.out.println( Math.random() * 100);
        
        //     min
        System.out.println(Math.min(1,2));
     }
    
    @Test
    public void stringEquality(){
        String a = "Hello";
        String b = "Hello";
        
        System.out.println((a == b)?"Tak":"Nie");
        System.out.println((a.equals(b)?"Tak":"Nie"));
        
        System.out.print("Hello ");
        System.out.println("World");
        System.out.printf("Hello World \t %d %d %d %.2f\n",1,2,3,4.5);
        
    }
    @Test
    public void stringFunctions(){
       String x = "A";
       String y = "B";
       
       System.out.println(x + y);
       System.out.println(x.concat(y));
       System.out.println("Hello".toUpperCase());
       System.out.println("Hello".toLowerCase());
       System.out.println("Hello {x}. how are you".replace("{x}","Filip"));
       String [] tab = "A,B,C,D,E,Filip,Ania,Stefan".split(",");
       for(int i=0;i< tab.length;i++){
           tab[i]+="------";
       }
       System.out.println(String.join(" ; ", tab));
       
       System.out.println("Hello".charAt(3));
       System.out.println("Hello Ala Mxa Kota".indexOf("x"));
       
       
       
    }
    @Test
    public void operatorIf(){
        
        int [] tab1 = {1,2,3,4,5,6,7,8,9,10};
        int [] tab2 = new int[tab1.length];
        
        for(int i = 0; i < tab1.length; i++){
            
//            if(tab1[i] < 5){
//                tab2[i] = 0;
//            }else{
//                tab2[i] = 1;
//            }
            tab2[i] = (tab1[i] < 5 ) ? 0 : 1;
                
        }
        printTable(tab1);
        System.out.println("");
        printTable(tab2);
             
        
        
    }
    private void printTable(int [] tab){
        
//        for(int i= 0 ; i < tab.length ;i++){
//            System.out.printf("%d ,", tab[i]);
//        }
        
        for(int x : tab){
            System.out.printf("%d ,", x);
        }
    }
    
    @Test
    public void moduloExample() {
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 1, 2, 3};

        for (int k = 0; k < tab.length; k++) {
            System.out.println(tab[k]);
        }

        
        System.out.println("--------------");
        for (int k = 0; k < tab.length; k++) {

            
            
            if ( (k + 1) % 3 == 0) {
                System.out.println(tab[k]);
            } else {
                System.out.print("" + tab[k] + " , ");
            }

        }
    }
}
