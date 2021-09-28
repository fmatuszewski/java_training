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
public class Poem extends Literature{

    String style;
    
        public Poem(String title,String author,String style){
        super.title = title;
        super.author = author;
        this.style = style;
    }
//    Tutaj przykład przeciążania metod
//    Klasa nadrzędna Literature ma zdefiniowaną metodę toString 
//    Metoda ta jest automatycznie dziedziczona.
//    Jeżeli zdefniniujemy metodę o tej samej nazwie tutaj.
//    metoda ta zasłoni poprzednią implementację i fakt ten
//    nazywamy przeciążeniem metody.
//    Przeciążone metody zazwyczj powinniśmy oznaczać annotacją @Override
    @Override
    public String toString(){
        String s = "Insntance of Poem\n"+
                  "Title: %s\n"
                + "Author: %s,\n"
                + "Style: %s\n";
        return String.format(s, title,author,style);
    }
}
