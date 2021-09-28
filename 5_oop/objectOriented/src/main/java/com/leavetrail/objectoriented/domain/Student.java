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
//Słowo kluczowe class definiuje nam klasę
//słowo kluczowe public zmienia widoczność klasy. Klasa będzie widoczna także poza pakietem.
public class Student {
//    tutaj definiujemy zmienne klasy Student.
//    zmienne klasy grupują pewne cechy charakterystyczne klasy
//    można na tej liście umieścić zmienne różnych typów zarówno typy proste (primitive) jak i klasy.
    public final String name;
    public String pesel;
    public final double height;
    public double weight;
    public int semester;
//    Definicja konstruktora klasy Student
//    Konstruktor jest funkcją która uruchamiana jest w momencie tworzenia klasy operatoren new
//    w konstruktorze możemy inicjalizować różne zmienne klasy.
    public Student(){
        this.name = "Unknown";
        this.height = 0;
    }
//    można tworzyć wiele konstruktorów. Muszą one mieć taką samą nazwę ale
//    muszą różnić się listą argumentów.
//    w konstruktorze można inicjalizować także atrybuty z modyfikatorem final
    public Student(String fName, double hHeight){
        this.name = fName;
        this.height = hHeight;
    }
//    Klasy mogą posiadać także metody które wykonują operacje na atrybutach klasy
//    w celu dostępu do atrybutów wykorzystujemy słowo kluczowe this
    public void printParameters(){
        System.out.printf("Imie: %s \n",   this.name );
        System.out.printf("Wzrost: %.2f \n",this.height);
        System.out.printf("Waga: %.2f\n", this.weight);
        System.out.printf("Pesel: %s\n", this.pesel);
    }
    
}
