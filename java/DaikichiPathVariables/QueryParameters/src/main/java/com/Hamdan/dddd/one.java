package com.Hamdan.dddd;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication

@RestController
@RequestMapping("/d")
public class one {
	
		 
	
		 @RequestMapping("/travel/{City}")
		    public String showLesson(@PathVariable("City") String track){
		    	return "Congratulations! You will soon travel to " + track ;
	       
        			
	        }
		 @RequestMapping("/lotto/{C}")
		    public String showLessont(@PathVariable("C") int x){
			 if (x%2==0) {
		    	return "You will take a grand journey in the near future, but be weary of tempting offers"  ;
			 }
			 else if (x%2==1) {
				 return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends " ;
			 }
			 else {
				 return "must be integer input";
			 }
		 }
	    }

	
	
//	        	return "URL input is (/?name='first_name'&name2='last_name'&num=integer)";
	 

