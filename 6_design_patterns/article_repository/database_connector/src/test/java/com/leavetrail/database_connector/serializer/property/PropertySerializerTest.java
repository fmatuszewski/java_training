/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leavetrail.database_connector.serializer.property;

import com.leavetrail.database_connector.domain.Article;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author user
 */
public class PropertySerializerTest {
    
    public PropertySerializerTest() {
    }
    
    final String flatFileContents = 
"deleted;id;title;subtitle;imageUrl\n" +
"0;start;Getting Started;First steps to join this program You must Login & Register;/img/business-schedule.svg\n" +
"0;product;Mastering Product;First steps to join this program You must Login & Register;/img/delivery-services.svg\n" +
"0;integrations;Integrations;First steps to join this program You must Login & Register;/img/finance.svg\n" +
"0;community;Community;First steps to join this program You must Login & Register;/img/presentation.svg\n" +
"0;addons;Add ons;First steps to join this program You must Login & Register;/img/team-work.svg\n" +
"0;api;A P I;First steps to join this program You must Login & Register;/img/social-media-marketing.svg\n" +
"0;news;News & Update;First steps to join this program You must Login & Register;/img/ecommerce.svg\n" +
"0;tutorials;Tutorials;First steps to join this program You must Login & Register;/img/data-analytic.svg";
    
    final String expectedArticleLine = 
"0;start;Getting Started;First steps to join this program You must Login & Register;/img/business-schedule.svg\n";

    InputStream inputStream;
    Article expectedArticle;
    
    
    public void initializeInputStream(){
       inputStream  = new ByteArrayInputStream(flatFileContents.getBytes());
    }
    public void closeInputStream() throws IOException{
        inputStream.close();
    }
    
    @BeforeEach
    public void initializeArticle(){
        String[] values = expectedArticleLine.split(";");
        
        expectedArticle = Article.builder(values[1])
                .isDeleted(values[0])
                .withTitle(values[2])
                .withSubtitle(values[3])
                .withImageUrl(values[4])
                .build();
    }
    
    
    
    
    @Test
    public void shouldParseArtileLine() throws PropertySerializerException, IllegalArgumentException, IllegalAccessException{
        //  Given

        PropertySerializer serializer = new PropertySerializer(Article.class);

        //  When
        
        Article article = serializer.parse(expectedArticleLine);
        
        //  Then
        
        assertTrue(expectedArticle.equals(article));
    }
    
    @Test
    public void shouldFormatArticle() throws PropertySerializerException, IllegalAccessException{
          //  Given

        PropertySerializer serializer = new PropertySerializer(Article.class);

        //  When
        
        String line = serializer.format(expectedArticle);
        
        //  Then
        
        assertTrue(expectedArticleLine.equals(line));
    }
    
    @Test
    public void shouldSerializeArtile() throws PropertySerializerException{
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PropertySerializer serializer = new PropertySerializer(Article.class);
        
        //  When
        serializer.serialize(expectedArticle,out);
        
//  Then
        String output = out.toString();
        
        assertEquals(expectedArticleLine, output);
        
        
    }
    
    @Test
    public void shouldDeserializeArticle(){
        
    }
    
    
    @Test
    public void shouldReadPropertiesFile() throws PropertySerializerException{
//  Given

    PropertySerializer serializer = new PropertySerializer(Article.class);

//  When
    serializer.loadConfigurationFromResource();
    


//  Then
    }
    
    @Test
    public void shouldReadPropertyFileFromFileSystem() throws PropertySerializerException{
//        Given
        PropertySerializer serializer = new PropertySerializer(Article.class);
//  When
        serializer.loadConfiguration();
//  Then
        
        
        
    }
    
        @Test
    public void shouldWritePropertyFileFromFileSystem() throws PropertySerializerException{
//        Given
        PropertySerializer serializer = new PropertySerializer(Article.class);
//  When
        serializer.saveConfiguration();
//  Then
        
        
        
    }
    
}
