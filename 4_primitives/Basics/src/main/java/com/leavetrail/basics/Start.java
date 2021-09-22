/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leavetrail.basics;


/**
 *
 * @author user
 */
public class Start {
    
    public static void main(String[] args){
     
        
//        Data Type	Size
//        long	8 bytes
//        float	4 bytes
//        double	8 bytes
//        boolean	1 bit
//        float T1a=0 ,T1b=0  ;

        float T2a ,T2b  ;
        float T3 ;
        float S,R1;
        float T1 ;
        
        

        T1 = petlaWhileIf(4f,2f,2);
        
        T2a = obliczPowTrojkata(2f , 1f);
        T2b = obliczPowTrojkata(2f , 1f);
        
        T3 = obliczPowTrojkata(3f , 1f);
        
        S = 2f * 2f;
        
        R1 = 2f * 1f;
            
        
        System.out.println("T1" + "_łączenie stringów");
        System.out.println("T1: " + T1);
        System.out.println("T2: " + T2b);
        System.out.println("T3: " + T3);
        System.out.println("S: " + S);
        System.out.println("R1: " + R1);
        System.out.println("Suma: " + (T1  + T2a + T2b + T3 + S + R1));
        konwersjaTypow();
      
    }
    
    static float obliczeniePowierzchniT1()
       {
           float T1 = 4f * 2f / 2f;
           return T1;
       }

    static float obliczPowTrojkata(float podatawa, float h){
        System.out.println("Pole Trojkata: " + (podatawa * h / 2) );
        return podatawa * h / 2;
    }
    
    static void index(){
                int index = 0;
        
        System.out.println( 2 + 3 );
        index = 0;
        System.out.println("2+index"+ (2 + index));
        index = 0;
        System.out.println("2+(index++)" + (2 + (index++)));
        System.out.println(index);
        index = 0;
        System.out.println("2+(++index)" + (2 + (++index)));
        System.out.println(index);
    }
    
    public static void konwersjaTypow(){
        double x = 100d;
        float y ;
        
        y = (float)x;
        x = (double)y;
        
        String text = String.valueOf(x);
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(text);
    }
    
    public static void typyProste(){
        int x;
        long y;
        float a;
        double b;
        char c = 'd';
        char d = 'd';
        boolean e = true;
        e = false;
        e = 4 < 5;
        
    }
    
    public static float petlaFor(float podstawa, float wysokosc, int krotnosc)  {      
            float T1 = 0;
            for(int index = 0; index < krotnosc; index = index + 1){
                System.out.println("index: " + index);
                T1 = T1 + obliczPowTrojkata(podstawa,wysokosc);  
            }
            return T1;
        }
        
     public static float petlaWhile(float podstawa, float wysokosc, int krotnosc){  
        float T1 = 0;
        {
            int index = 0;
            while(index < krotnosc){
                System.out.println("index: " + index);
                T1 = T1 + obliczPowTrojkata(podstawa, wysokosc);
                
                index = index + 1;
            }
        }
        return T1;
     }
     public static float petlaWhileIf(float podstawa, float wysokosc, int krotnosc){
         float T1 = 0;
         {
            int index = 0;
            while(true){
                if(index < krotnosc){
                    System.out.println("index: " + index);
                    T1 = T1 + obliczPowTrojkata(podstawa, wysokosc);

                    index = index + 1;
                }else{
                    break;
                } 
            }
         }
         return T1;
     }

}
