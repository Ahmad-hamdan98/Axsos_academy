package com.axsos.hell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class HellApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellApplication.class, args);
	}


//class definition and imports here...
@RequestMapping("/")
public String index(Model model) {
    
    String name = "Grace Hopper";
    String itemName = "Copper wire";
    double price = 5.25;
    String description = "Metal strips, also an illustration of nanoseconds.";
    String vendor = "Little Things Corner Store";

    model.addAttribute("dojoName",name);
    model.addAttribute("dojoName1",itemName);
    model.addAttribute("dojoName2",price);
    model.addAttribute("dojoName3",description);
    model.addAttribute("dojoName4",vendor);
    
	// Your code here! Add values to the view model to be rendered

    return "index.jsp";

//...
}}

