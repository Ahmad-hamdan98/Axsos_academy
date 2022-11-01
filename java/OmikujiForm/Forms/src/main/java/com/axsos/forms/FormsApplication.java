package com.axsos.forms;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class FormsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormsApplication.class, args);
	}
	

	
	// ...
	@RequestMapping("/")
	public String defult() {
		
		return "index.jsp";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(
		@RequestParam(value="pick") int pick,
	    @RequestParam(value="city") String city,
	    @RequestParam(value="person") String person,
		@RequestParam(value="living") String living, 
		@RequestParam(value="mass") String mass,HttpSession session){
		
		session.setAttribute("pick",pick);
		session.setAttribute("city",city);
		session.setAttribute("person",person);
		session.setAttribute("living",living);
		session.setAttribute("mass",mass);
		
		return  "redirect:/show";
	}
	
		@RequestMapping("/show")
		public String show(Model model ,HttpSession session ){
			
			model.addAttribute("pick" , session.getAttribute("pick"));
			model.addAttribute("city" , session.getAttribute("city"));
			model.addAttribute("person" , session.getAttribute("person"));
			model.addAttribute("living" , session.getAttribute("living"));
			model.addAttribute("mass" , session.getAttribute("mass"));
			
			
			
		return "show.jsp";
		}
	}
	// ...



