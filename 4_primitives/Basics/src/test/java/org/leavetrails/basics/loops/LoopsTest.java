/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.leavetrails.basics.loops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class LoopsTest {
    
    public LoopsTest() {
    }
    
    
    @Test public void shouldPresentStringOperators(){
        System.out.println("Hello"+"World"); // the output is 3Hello
        System.out.println(1 + 2 + "Hello"); // the output is 3Hello
        System.out.println("Hello" + 1 + 2); // the output is Hello12
        
        assertEquals("HelloWorld","Hello"+"World");
        assertEquals("3Hello",1 + 2 + "Hello");
        assertEquals("Hello12","Hello" + 1 + 2);
        
    
    }
    
}
