/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leavetrail.database_connector.serializer.property;

import java.util.Map;

/**
 *
 * @author user
 */
public interface PropertiesSerializable {
    
    
    Map toMap();
    void fromMap(Map value);
    
    
}
