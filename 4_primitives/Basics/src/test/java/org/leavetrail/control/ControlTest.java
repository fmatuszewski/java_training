/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.leavetrail.control;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author user
 */
public class ControlTest {

    public ControlTest() {
    }

//x == y          // x is equal to y
//x != y          // x is not equal to y 
//x > y           // x is greater than y
//x < y           // x is less than y 
//x >= y          // x is greater than or equal to y 
//x <= y          // x is less than or equal to y 
    //Instrukcje sterujące
    //     if-else
    //     chaining and nesting
    //     Switch statement  
    @Test
    public void shouldPresentIfElseStatement() {
        int x = 1;

        if (x > 0) {
            System.out.println("x is positive");
        }
        if (x % 2 == 0) {
            System.out.println("x is even");
        } else {
            System.out.println("x is odd");
        }

        if (x % 2 == 0) {
            System.out.println("x is even");
        } else {
            System.out.println("x is odd");
        }

        if (x > 0) {
            System.out.println("x is positive");
        }
        System.out.println("x is not zero");

        if (x > 0) {
            System.out.println("x is positive");
        }
        System.out.println("x is not zero");

        if (x % 2 == 0);
        {  // incorrect semicolon
            System.out.println("x is even");
        }

        if (x % 2 == 0)
    ;  // empty statement
        {
            System.out.println("x is even");
        }

        if (x > 0) {
            System.out.println("x is positive");
        } else if (x < 0) {
            System.out.println("x is negative");
        } else {
            System.out.println("x is zero");
        }

        if (x > 0) {
            System.out.println("x is positive");
        } else {
            if (x < 0) {
                System.out.println("x is negative");
            } else {
                System.out.println("x is zero");
            }
        }
    }

    @Test
    public void shouldPresentSwitchStatement(int number) {

        String word;

        if (number == 1) {
            word = "one";
        } else if (number == 2) {
            word = "two";
        } else if (number == 3) {
            word = "three";
        } else {
            word = "unknown";
        }

        switch (number) {
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
        }

    }

    //Pętle
    //     While Statement
    //     For Statement
    //Tablice jednowymiarowe
    //     Charasters
    //     Strings Iteration
    //Tablice wielowymiarowe
    @Test
    public void shouldCreateAnArray() {
        int[] counts;
        double[] values;
        counts = new int[4];
        int size = 5;
        values = new double[size];

    }

    @Test
    public void shouldInitializeAnArray() {

        int[] a = {1, 2, 3, 4};
        
        assertEquals(4,a.length, "Length is not equal");

    }

    @Test
    public void shouldAccessAnArray() {
        int[] counts = new int[4];
        counts[0] = 7;
        counts[1] = counts[0] * 2;
        counts[2]++;
        counts[3] -= 60;

        int i = 0;
        while (i < 4) {
            System.out.println(counts[i]);
            i++;
        }

        System.out.println(counts);
        
        int [] expect = {7,14,1,-60};
        assertArrayEquals(expect,counts);
    }

    public static void printArray(double[] a) {
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }

    @Test
    public void shouldCopyAnArray() {
        double[] a = {1,2,3,4,5};

        double[] b = new double[3];
        for (int i = 0; i < 3; i++) {
            b[i] = a[i];
        }

        double[] c = Arrays.copyOf(a, 3);
        
        printArray(a);
        printArray(b);
        printArray(c);
        
        double[] expectedA = {1,2,3,4,5};
        double[] expectedB = {1,2,3};
        double[] expectedC = {1,2,3};
        
        assertArrayEquals(expectedA,a);
        assertArrayEquals(expectedB,b);
        assertArrayEquals(expectedC,c);
        
    }
    //Pętla for each
//        
//        shouldRoundValues
//shouldRoundValues
//shouldRoundValues
}
