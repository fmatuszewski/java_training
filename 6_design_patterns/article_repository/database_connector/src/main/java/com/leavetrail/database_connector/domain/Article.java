/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leavetrail.database_connector.domain;

import com.leavetrail.database_connector.annotations.FlatFileElement;
import com.leavetrail.database_connector.annotations.FlatFileSerializable;

/**
 *
 * @author user
 */
@FlatFileSerializable(
        connection="/Volumes/Magazine SSHD/Projects/JavaTraining/java_training/6_design_patterns/article_repository/data/data.csv",
        schema="article.properties",
        sequence="deleted,id,title,subtitle,imageUrl"
)
public class Article {
    @FlatFileElement()
    String id;	
    @FlatFileElement()
    String title;	
    @FlatFileElement()
    String subtitle;	
    @FlatFileElement()
    String imageUrl;
    @FlatFileElement()
    String deleted;
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return id.equals(article.id) 
          && title.equals(article.title) 
          && subtitle.equals(article.subtitle)
          && imageUrl.equals(article.imageUrl)
          && deleted.equals(article.deleted)
                ;
    }
    
    public static Builder builder(String id){
      return new Builder(id);
    }
    
    public static class Builder{
        Article article = new Article();
        
        public  Builder(String id){
            article.id = id;
        }
        
        public Builder withTitle(String title){
            article.title = title;
            return this;
        }
        public Builder withSubtitle(String value){
            article.subtitle = value;
            return this;
        }
        public Builder withImageUrl(String value){
            article.imageUrl = value;
            return this;
        }
        
        public Builder isDeleted(String value){
            article.deleted = value;
            return this;
        }
        
        public Article build(){
            return article;
        }
    
    }
}


