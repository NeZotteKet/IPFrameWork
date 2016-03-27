/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.swing1.mavenspringwebapplication;

import com.mycompany.myfirstmavenproject.domain.AbstractModel;
import com.mycompany.myfirstmavenproject.domain.Bier;
import com.mycompany.myfirstmavenproject.domain.BierCategorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author thomas
 */
@Controller
@RequestMapping(value="/categorie")
public class CategorieController {
    
    @Autowired
    private AbstractModel domain;
    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getCountries(){
        // TODO FIX VOOR DE JUISTE SOORT
        ModelAndView mav = new ModelAndView("categorie","categorie",domain.getSoorten());
       
        
        return mav;
        
        
    }
    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public ModelAndView getNewForm(){
        
        return new ModelAndView("categorieform","categorie",new BierCategorie());
        
    }
    @RequestMapping(method = RequestMethod.POST)
    public String saveBier(@ModelAttribute ("BierCategorie") BierCategorie categorie,BindingResult result){
        if(result.hasErrors()){
            
            return "catgeorieform";
        }
        else{
        this.domain.createBierCategorie(categorie.getNaam());
        return "redirect:/categorie.htm";
        }
    }
  
    
    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public ModelAndView getEditForm(@PathVariable String id){
        return new ModelAndView("categorieform","categorie",this.domain.getBierCategorie(Long.parseLong(id)));
    }
    
     @RequestMapping(value="/{id}/edit",method=RequestMethod.POST)
    public String changeBier(@PathVariable String id,@ModelAttribute ("BierCategorie") BierCategorie cat){
      BierCategorie categorie = this.domain.getBierCategorie(Long.parseLong(id));
      categorie.setNaam(cat.getNaam());
      return "redirect:/categorie.htm";
      
    }
   
}
