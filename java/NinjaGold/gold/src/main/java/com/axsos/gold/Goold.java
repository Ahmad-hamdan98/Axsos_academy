package com.axsos.gold;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Goold {

	
	@RequestMapping("/")
	public String indexx( HttpSession session) {
		if(session.getAttribute("gold")==null) {
			session.setAttribute("gold",0);
		}
		return "index.jsp";
	}
	
	
	@PostMapping("/as" )
	public String gold(@RequestParam(value="which_form")String location ,Model model , HttpSession session) {
		
		Date date=new Date();
		if(session.getAttribute("gol")==null) {
			ArrayList<String> z=new ArrayList<String>();
			session.setAttribute("gol",z);
			}
		if (location.equals("Farm")) {
		Random rand = new Random();
		int upperbound = 11;
		int int_random = rand.nextInt(upperbound)+10; 
		session.setAttribute("color","green");
		Integer go=(Integer)session.getAttribute("gold");
		go+=int_random;
		session.setAttribute("gold",go);
		ArrayList<String> z1=( ArrayList<String>)session.getAttribute("gol");
		z1.add(0,"from "+location+" you Earned "+int_random+" at( "+date+")");
		session.setAttribute("gol",z1);
		}
	
		
		if (location.equals("Cave")) {
			Random rand = new Random();
			int upperbound = 11;
			int int_random = rand.nextInt(upperbound)+10; 
			session.setAttribute("color","green");
			Integer go=(Integer)session.getAttribute("gold");
			go+=int_random;
			session.setAttribute("gold",go);
			ArrayList<String> z1=( ArrayList<String>)session.getAttribute("gol");
			z1.add(0,"from "+location+" you Earned "+int_random+" at( "+date+")");
			session.setAttribute("gol",z1);
			}
		
		if (location.equals("House")) {
			Random rand = new Random();
			int upperbound = 11;
			int int_random = rand.nextInt(upperbound)+10; 
			session.setAttribute("color","green");
			Integer go=(Integer)session.getAttribute("gold");
			go+=int_random;
			session.setAttribute("gold",go);
			ArrayList<String> z1=( ArrayList<String>)session.getAttribute("gol");
			z1.add(0," from "+location+" you Earned "+int_random+" at( "+date+")");
			session.setAttribute("gol",z1);
			}
		
		if (location.equals("Quest")) {
			int [] x = {-1,1};
			Random rand = new Random();
			int upperbound = 50;
			int int_random1 = x[rand.nextInt(2)];
			int int_random = rand.nextInt(upperbound)*int_random1; 
			session.setAttribute("col",int_random);
			Integer go=(Integer)session.getAttribute("gold");
			go+=int_random;
			session.setAttribute("gold",go);
			
			if(int_random>0) {
				session.setAttribute("color","green");
				ArrayList<String> z1=( ArrayList<String>)session.getAttribute("gol");
				z1.add(0,"from "+location+" you Earned "+int_random+" at( "+date+")");
				session.setAttribute("gol",z1);
			}
			else if(int_random<0) {
				session.setAttribute("color","red");
				ArrayList<String> z1=( ArrayList<String>)session.getAttribute("gol");
				z1.add(0," from "+location+" you lose "+int_random+" at "+date);
				session.setAttribute("gol",z1);
				
			}
		}
		//=========================================================================
		
		
		
//		if (location.equals("Quest")) {
//			Integer g=(Integer)session.getAttribute("col");
//			if(g>0) {
//				
//			}
//		}
		

		
		
		return "redirect:/";
	}
	

}
