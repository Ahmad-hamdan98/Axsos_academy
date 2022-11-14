package com.axsos.quary.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axsos.quary.Serveser.Serveses;

@RestController
public class Controllers {

	
	 @Autowired
		public final Serveses worldServ;
	 
//	 @RequestMapping("/")
//	    public String index(Model model) {
//		 	
////	        model.addAttribute("newUser",worldServ.getallcountries() );
//	        return "index.jsp";
//	    }


//		@RequestMapping("/api/selvone")
//		public List<Object[]> allCountrys() {
//			List<Object[]> all = worldServ.allCountries();
//			
//			return all;
		@RequestMapping("/api/selvone")
		public List<Object[]> allCountry() {
			List<Object[]> all = worldServ.allCountries();
			
			return all;
		}
		@RequestMapping("/api/q2")
		public List<Object[]> displayTotalCities() {
			List<Object[]> all = worldServ.displayTotalCities();
			
			return all;
		}
		
		@RequestMapping("/api/q3")
		public List<Object[]> q3() {
			List<Object[]> all = worldServ.q3();
			
			return all;
		}
		
		
		@RequestMapping("/api/q4")
		public List<Object[]> q4() {
			List<Object[]> all = worldServ.q4();
			
			return all;
		}
		
		@RequestMapping("/api/q5")
		public List<Object[]> q5() {
			List<Object[]> all = worldServ.q5();
			
			return all;
		}
		@RequestMapping("/api/q6")
		public List<Object[]> q6() {
			List<Object[]> all = worldServ.q6();
			
			return all;
		}
		@RequestMapping("/api/q7")
		public List<Object[]> q7() {
			List<Object[]> all = worldServ.q7();
			
			return all;
		}
		@RequestMapping("/api/q8")
		public List<Object[]> q8() {
			List<Object[]> all = worldServ.q8();
			
			return all;
		}
	public Controllers(Serveses worldServ) {
		
		this.worldServ = worldServ;
	}
	 
}
