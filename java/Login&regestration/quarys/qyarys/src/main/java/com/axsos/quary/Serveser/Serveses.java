package com.axsos.quary.Serveser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axsos.quary.Models.Country;
import com.axsos.quary.Repositories.wordRepo;

@Service
public class Serveses {

	
	 @Autowired
	    private wordRepo worldRepo;
	 
	 
//	 public List<Object[]>  getallcountries(){
////		 List<Object[]> allcountries=worldRepo.getallcountries();
//		 return worldRepo.getallcountries();
//	 }
	 public List<Object[]> allCountries(){
			
			return worldRepo.getallcountries();
		}  
		
		public List<Object[]> displayTotalCities(){
			
			return worldRepo.displayTotalCities();
		}  
		
		
		public List<Object[]> q3(){
			
			return worldRepo.q3();
		}  
		
		public List<Object[]> q4(){
			
			return worldRepo.q4();
	}
		
		public List<Object[]> q5(){
			
			return worldRepo.q6();
	}
		public List<Object[]> q6(){
			
			return worldRepo.q6();
	}
		
		public List<Object[]> q7(){
			
			return worldRepo.q7();
	}
		public List<Object[]> q8(){
			
			return worldRepo.q8();
	}
		
	 
}
