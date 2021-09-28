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
public class Literature {
    
    public String title;
    protected String author;

    public Literature() {
    }
    
    public String toString(){
         String s = "Insntance of Literature\n"+
                  "Title: %s\n"
                + "Author: %s,\n";
        return String.format(s, title,author);
    }
    
}
