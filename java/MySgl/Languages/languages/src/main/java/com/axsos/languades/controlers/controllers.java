package com.axsos.languades.controlers;

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

import com.axsos.languades.models.model;
import com.axsos.languades.serveces.serves;

//import com.example.demo.models.Travel;



@Controller
public class controllers {

private final serves travelService;

  public controllers(serves modelService) {
      this.travelService = modelService;
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
	    public String show(@ModelAttribute("travel") model travel,Model model) {
	    	List<model> travel1 =travelService.allmodel();
	        model.addAttribute("travel1", travel1);
	        return "index.jsp";
	    }
	    
	    @PostMapping("/travel")
	    public String create(@Valid @ModelAttribute("travel") model travel, BindingResult result,Model model) {
	    	  if (result.hasErrors()) {
	    		  List<model> travel1 =travelService.allmodel();
	  	        	model.addAttribute("travel1", travel1);
	              return "index.jsp";
	          } else {
	              travelService.createmodel(travel);
	              return "redirect:/";
	          }
	    }
	    @GetMapping("/edit/{id}")
	    public String create1( @ModelAttribute("edit") model edit, @PathVariable("id") Long id,Model model) {
	    	model travel7 = travelService.findmodel(id);
	    	model.addAttribute("travel", travel7);
	    	System.out.println(travel7);
	    	return "edit.jsp";
	    }
	    @PutMapping("/update/{id}")
	    public String create3(@Valid @ModelAttribute("edit") model edit, BindingResult result,@PathVariable("id") Long id,Model model) {
	    	if (result.hasErrors()) {
	    		model travel7 = travelService.findmodel(id);
		  	     model.addAttribute("travel", travel7);
	              return "edit.jsp";
	          } else {
	        	 
	        	  travelService.updateTravel2(edit);
	        	  
	              return "redirect:/";
	          }
	    	
	    }
	    @DeleteMapping("/delete/{id}")
	    public String delet(@PathVariable("id") Long id ) {
	    	travelService.deletemodel(id);
	    	
	    	return "redirect:/";
	    }
	    @RequestMapping("/show/{id}")
	    public String Shoetravel(Model model ,@PathVariable("id") Long id) {
	    	model tww = travelService.findmodel(id);
	    	model.addAttribute("shit",tww);
	    	return "showLanguage.jsp";
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

	
	


