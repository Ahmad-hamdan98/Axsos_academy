package com.axsos.savetravel.controllers;


//import java.awt.print.Book;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.savetravel.models.Travel;
import com.axsos.savetravel.services.Trevelservices;



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

	
	


