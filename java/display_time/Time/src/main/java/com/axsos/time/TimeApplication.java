package com.axsos.time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class TimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeApplication.class, args);
	}
	// ...
	@RequestMapping("/")
	public String index(Model model) {

		return "index.jsp";
	}
	// ...
	@RequestMapping("/date")
	public String index1(Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("EEEE, 'The ' dd 'of' MMMM yyyy ");
        model.addAttribute("date" , dateFormat.format(date));
		
		
		return "index1.jsp";
	}
	// ...
	// ...
	@RequestMapping("/time")
	public String index2(Model model) {
		
		DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
		Date date = new Date();
		
		model.addAttribute("time", dateFormat.format(date) );
		return "index2.jsp";
	}
	// ...

	// ...

}
