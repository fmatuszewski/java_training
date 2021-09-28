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
public class Book extends Literature {
    public String publisher;
    public String genre;
    
    public Book(
            String title,
            String author,
            String publisher,
            String genre
    ){
        super.title = title;
        super.author = author;
        this.publisher = publisher;
        this.genre = genre;
    }
    
    public String toString(){
        String s = "Insntance of Book\n"+
                  "Title: %s\n"
                + "Author: %s,\n"
                + "Publisher: %s \n,"
                + "Genre: %s\n";
        return String.format(s, title,author,publisher,genre);
    }
}



//Literature      Book            Poem
//title           title           title 
//author          author          author
//                publisher       style
//                genre	