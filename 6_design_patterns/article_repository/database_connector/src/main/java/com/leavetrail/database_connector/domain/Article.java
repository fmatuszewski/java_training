/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leavetrail.database_connector.domain;

import com.leavetrail.database_connector.annotations.FlatFileSerializable;

/**
 *
 * @author user
 */
@FlatFileSerializable(
        connection="/Volumes/Magazine SSHD/Projects/JavaTraining/java_training/6_design_patterns/article_repository/data/data.csv",
        schema="article.properties"
)
final public class Article {
    String id;	
    String title;	
    String subtitle;	
    String imageUrl;
    String deleted;
    
}
