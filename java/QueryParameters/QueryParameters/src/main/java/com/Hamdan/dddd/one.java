package com.Hamdan.dddd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class one {
	 @RequestMapping("/")
	    public String index(@RequestParam(value="name" , required=false) String searchQuery,@RequestParam(value="name2" , required=false) String searchQuer,@RequestParam(value="num" , required=false,defaultValue="1") int x){
	        if ((searchQuery!=null &searchQuer!=null ) ){
	        	  String s=""; 
	   	       
	  	        for (int i=0;i<x;i++) {
	  	        	s+="Hello " + searchQuery +" "+searchQuer;
	  	        	
	  	        }
	  	        return (s);
	  	        
	  	    }
	        else   {
	        	return "URL input is (/?name='first_name'&name2='last_name'&num=integer)";
//	        			
	        }
	     
	   
	        
	    }

	
	}
	 

