package com.axsos.Counter;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@Controller
public class CounterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CounterApplication.class, args);
	}
	 @RequestMapping("/")
	 public String index(HttpSession session) {
		
		 if ( session.getAttribute("count")==null) {
			 session.setAttribute("count", 1);}
			 else {
	        Integer x= (Integer)session.getAttribute("count");
			  x++;
			 session.setAttribute("count", x);
			 }
			return "index.jsp";
		}
	 @RequestMapping("/count")
	 public String index1(HttpSession session, Model model) {
		
		 model.addAttribute("counte" , session.getAttribute("count") );
			return "index2.jsp";
		}

}
