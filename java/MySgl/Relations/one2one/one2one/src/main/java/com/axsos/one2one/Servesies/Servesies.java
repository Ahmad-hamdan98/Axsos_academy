package com.axsos.one2one.Servesies;

import java.util.List;
import java.util.Optional;

//import javax.validation.Valid;

//import javax.validation.Valid;

//...
import org.springframework.stereotype.Service;

import com.axsos.one2one.Models.Models;
import com.axsos.one2one.Models.Ninja;
import com.axsos.one2one.Reposetories.NinjaRepo;
import com.axsos.one2one.Reposetories.Reposetories;

@Service
public class Servesies {
// private static final Travel ;
// adding the book repository as a dependency
	private final Reposetories repository;
	private final NinjaRepo ninja;
 
 
 public Servesies(Reposetories repository, NinjaRepo ninja) {
		
		this.repository = repository;
		this.ninja = ninja;
	}
// returns all the books
 public List<Ninja> allninja() {
     return ninja.findAll();
 }
 // creates a book
 public Ninja createnija(Ninja b) {
     return ninja.save(b);
 }
 // retrieves a book
 public Ninja findninja(Long id) {
     Optional<Ninja> optionalrepositroy = ninja.findById(id);
     if(optionalrepositroy.isPresent()) {
         return optionalrepositroy.get();
     } else {
         return null;
     }
 }
 //----------------------------------------------------------------------------------
 public List<Models> allmodel() {
     return repository.findAll();
 }
 // creates a book
 public Models createmodel(Models b) {
     return repository.save(b);
 }
 // retrieves a book
 public Models findmodel(Long id) {
     Optional<Models> optionalrepositroy = repository.findById(id);
     if(optionalrepositroy.isPresent()) {
         return optionalrepositroy.get();
     } else {
         return null;
     }
 }


 
}






//public void deletemodel(Long id) {
//	// TODO Auto-generated method stub
//	  Optional<Models> optionalrepositroy = repository.findById(id);
//	     if(optionalrepositroy.isPresent()) {
//	    	 repository.delete(optionalrepositroy.get());
//	     } 
//}
//public Models updateTravel2( Models b) {
//	// TODO Auto-generated method stub
//	return repository.save(b);
//}