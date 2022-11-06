package com.axsos.savetravel.controllers;


//import java.awt.print.Book;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.savetravel.models.Travel;
import com.axsos.savetravel.services.Trevelservices;
//import com.example.demo.models.Travel;



@Controller
public class TrevelController {

private final Trevelservices travelService;

    
    public TrevelController(Trevelservices travelService) {
        this.travelService = travelService;
    }

	// ... imports removed for brevity
	@Controller
	public class BooksController {
	    // other methods removed for brevity
//	    @GetMapping("/travel")
//	    public String edit(@Valid @ModelAttribute("book") Travel travel, BindingResult result) {
//	        
//	       
//	        return "show.jsp";
	    }
	    @RequestMapping("/")
	    public String show(@ModelAttribute("travel") Travel travel,Model model) {
	    	List<Travel> travel1 =travelService.allTravel();
	        model.addAttribute("travel1", travel1);
	        return "index.jsp";
	    }
	    
	    @PostMapping("/travel")
	    public String create(@Valid @ModelAttribute("travel") Travel travel, BindingResult result,Model model) {
	    	  if (result.hasErrors()) {
	    		  List<Travel> travel1 =travelService.allTravel();
	  	        	model.addAttribute("travel1", travel1);
	              return "index.jsp";
	          } else {
	              travelService.createTravel(travel);
	              return "redirect:/";
	          }
	    }
	    
	    @GetMapping("/edit/{id}")
	    public String create1( @ModelAttribute("edit") Travel edit, @PathVariable("id") Long id,Model model) {
	    	
	    	
	    	Travel travel7 = travelService.findTravel1(id);
	    	model.addAttribute("travel", travel7);
	    	System.out.println(travel7);
	    	return "edit.jsp";
	    }
	    @PutMapping("/update/{id}")
	    public String create3(@Valid @ModelAttribute("edit") Travel edit, BindingResult result,@PathVariable("id") Long id,Model model) {
	    	if (result.hasErrors()) {
	    		 Travel travel7 = travelService.findTravel1(id);
		  	     model.addAttribute("travel", travel7);
	              return "edit.jsp";
	          } else {
	        	 
	        	  travelService.updateTravel2(edit);
	        	  
	              return "redirect:/";
	          }
	    	
	    }
	    @DeleteMapping("/delete/{id}")
	    public String delet(@PathVariable("id") Long id ) {
	    	travelService.deleteTravel(id);
	    	
	    	return "redirect:/";
	    }
	    
	    
	    @RequestMapping("/show/{id}")
	    public String Shoetravel(Model model ,@PathVariable("id" ) Long id) {
	    	Travel tww = travelService.findTravel1(id);
	    	model.addAttribute("shit",tww);
	    	return "showtravel.jsp";
	    }
//	    @PutMapping("/books/{id}")
//	    public String update(@Valid @ModelAttribute("travel") Travel travel, BindingResult result) {
//	        if (result.hasErrors()) {
//	            return "/books/edit.jsp";
//	        } else {
//	        	travelService.updateTravel(travel);
//	            return "redirect:/books";
//	        }
//	    }
	    }

	
	


