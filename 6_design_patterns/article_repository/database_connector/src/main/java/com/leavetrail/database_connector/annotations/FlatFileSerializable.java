/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leavetrail.database_connector.annotations;

import static java.lang.annotation.ElementType.TYPE;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;

/**
 *
 * @author user
 */
@Retention(RUNTIME)
@Target(TYPE)
public @interface FlatFileSerializable {
   public String connection() default ""; 
   public String schema() default "";
   public String sequence() ;
}
