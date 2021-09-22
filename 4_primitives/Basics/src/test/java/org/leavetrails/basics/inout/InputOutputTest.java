/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.leavetrails.basics.inout;

import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class InputOutputTest {
    
    public InputOutputTest() {
    }
    
    
    @Test public void shouldShowTypeOfSystemIn(){
    
    
        for(int i = 0;  i <= "".length(); i++ ){
            
        }
        assertTrue( System.out instanceof OutputStream);
        assertTrue( System.out instanceof PrintStream);
        assertTrue( System.out instanceof FilterOutputStream);
        
        assertTrue( System.in instanceof InputStream);
        
    }
}
