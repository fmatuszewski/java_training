/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leavetrail.database_connector.serializer.property;

import org.junit.jupiter.api.Test;

/**
 *
 * @author user
 */
public class PropertySerializerTest {
    
    public PropertySerializerTest() {
    }
    
    @Test
    public void shouldReadPropertiesFile(){
//  Given

    PropertySerializer serializer = new PropertySerializer();

//  When
    serializer.loadConfigurationFromResource();
    


//  Then
    }
    
    @Test
    public void shouldReadPropertyFileFromFileSystem(){
//        Given
        PropertySerializer serializer = new PropertySerializer();
//  When
        serializer.loadConfiguration();
//  Then
        
        
        
    }
    
        @Test
    public void shouldWritePropertyFileFromFileSystem(){
//        Given
        PropertySerializer serializer = new PropertySerializer();
//  When
        serializer.saveConfiguration();
//  Then
        
        
        
    }
    
}
