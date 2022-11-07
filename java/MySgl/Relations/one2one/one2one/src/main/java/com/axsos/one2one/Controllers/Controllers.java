package com.axsos.one2one.Controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.one2one.Models.Models;
import com.axsos.one2one.Models.Ninja;
import com.axsos.one2one.Servesies.Servesies;

@Controller
public class Controllers {
	private final Servesies dnsevesies;

	 public Controllers(Servesies dnsevesies) {
	      this.dnsevesies = dnsevesies;
	  }
	@RequestMapping("/")
	public String dojo(@Valid @ModelAttribute("dojo") Models dojo, BindingResult result) {
		return "Dojo.jsp";
	}
	
	  @PostMapping("/Newdojo")
	    public String create(@Valid @ModelAttribute("dojo") Models dojo, BindingResult result) {
	    	  if (result.hasErrors()) {
	    	
	              return "Dojo.jsp";
	          } else {
	        	  dnsevesies.createmodel(dojo);
	              return "redirect:/";
	          }
	    }

	    @RequestMapping("/ninjapage")
		public String ninja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result,Model model) {
	    	model.addAttribute("alldojo", dnsevesies.allmodel()); 
			return "Ninja.jsp";
		}
	    
	   
	    @PostMapping("/Newninja")
	    public String createninja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
	    	  if (result.hasErrors()) {
	    	
	              return "Ninja.jsp";
	          } else {
	        	  dnsevesies.createnija(ninja);
	              return "redirect:/ninjapage";
	          }
	    }
	    @RequestMapping("/dojos/{id}")
		public String dojo( @PathVariable("id") Long id,Model model) {
			Models ds=dnsevesies.findmodel(id);
			
			model.addAttribute("allninja",ds);
	    	
	    	return "show.jsp";
		}



	    














}
