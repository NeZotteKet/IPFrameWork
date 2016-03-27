/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.swing1.mavenspringwebapplication.converters;

import com.mycompany.myfirstmavenproject.domain.Bier;
import org.springframework.core.convert.converter.Converter;

/**
 *
 * @author thomas
 */
public class BierConverter implements Converter<Bier,String>{

    @Override
    public String convert(Bier s) {
        
        return s.getNaam();
        
    }
    
}
