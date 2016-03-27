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
import wrapper.BierWrapper;
/**
 *
 * @author thomas
 */

@Controller
@RequestMapping(value="/bier")
public class BierController {
    @Autowired
    private AbstractModel domain;
    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getCountries(){
        // WERKT !!!
        return new ModelAndView("bier","bieren",domain.getBieren());
        
    }
    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public ModelAndView getNewForm(){
        ModelAndView mav = new ModelAndView("bierform","bierwrapper",new BierWrapper());
       
        mav.addObject("categorie",this.domain.getSoorten());
        return mav;
        
    }
    @RequestMapping(method = RequestMethod.POST)
    public String saveBier(@ModelAttribute ("BierWrapper") BierWrapper bier,BindingResult result ){
        if(result.hasErrors()){
            
            return "bierform";
        }
        else{
        this.domain.addBier(this.domain.getCategorieByName(bier.getCatNaam()),bier.getBier());
        return "redirect:/bier.htm";
        }
    }
  
    
    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public ModelAndView getEditForm(@PathVariable String id){
        
        Bier b = this.domain.getBier(Long.parseLong(id));
        BierCategorie bc = this.domain.getCategorieByBier(b);
        ModelAndView mav = new ModelAndView("bierchangeform","bierwrapper",new BierWrapper(b,bc));
        mav.addObject("categorie",this.domain.getSoorten());
        return mav;
    }
    
     @RequestMapping(value="/{id}/edit",method=RequestMethod.POST)
    public String changeBier(@PathVariable String id,@ModelAttribute ("BierWrapper") BierWrapper bier){
      BierCategorie bc = this.domain.getCategorieByName(bier.getCatNaam());
      this.domain.deleteBier(bier.getBier().getId());
      this.domain.addBier(bc, bier.getBier());
      
      return "redirect:/bier.htm";
      
    }
    
     @RequestMapping(value="/{id}/delete",method=RequestMethod.GET)
    public String changeBier(@PathVariable String id){
      this.domain.deleteBier(Long.parseLong(id));
      return "redirect:/bier.htm";
    }
   
   
}
