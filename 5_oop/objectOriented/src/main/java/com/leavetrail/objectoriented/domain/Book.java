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
// klasa Book dziedziczy po klasie Literature
// w celu zaznaczenia tego faktu wykorzystujemy słowo kluczowe extends
// Klasa może dziedziczyć tylko po jednej Klasie.
// Klasa może dziedziczyć po wielu interfejsach ale o tym jeszcze nie mówiliścmy
public class Book extends Literature {
    public String publisher;
    public String genre;
    
    public Book(
            String title,
            String author,
            String publisher,
            String genre
    ){
//        w celu dostępu do atrybutów klasy nadrzędnej używamy słowa kluczowego super
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