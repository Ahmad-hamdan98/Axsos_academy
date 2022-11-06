package com.axsos.languades.serveces;


import java.util.List;
import java.util.Optional;

//import javax.validation.Valid;

//import javax.validation.Valid;

//...
import org.springframework.stereotype.Service;

import com.axsos.languades.models.model;
import com.axsos.languades.repository.repository;


@Service
public class serves {
// private static final Travel ;
// adding the book repository as a dependency
	private final repository repository;
 
 public serves(repository repository) {
     this.repository = repository;
 }
 // returns all the books
 public List<model> allmodel() {
     return repository.findAll();
 }
 // creates a book
 public model createmodel(model b) {
     return repository.save(b);
 }
 // retrieves a book
 public model findmodel(Long id) {
     Optional<model> optionalrepositroy = repository.findById(id);
     if(optionalrepositroy.isPresent()) {
         return optionalrepositroy.get();
     } else {
         return null;
     }
 }
public void deletemodel(Long id) {
	// TODO Auto-generated method stub
	  Optional<model> optionalrepositroy = repository.findById(id);
	     if(optionalrepositroy.isPresent()) {
	    	 repository.delete(optionalrepositroy.get());
	     } 
}
//public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
//	// TODO Auto-generated method stub
//	 Optional<Book> optionalBook = bookRepository.findById(id);
//     if(optionalBook.isPresent()) {
//    	 optionalBook.get().setTitle(title);
//    	 optionalBook.get().setDescription(desc);
//    	 optionalBook.get().setLanguage(lang);
//    	 optionalBook.get().setNumberOfPages(numOfPages);
//    	 return bookRepository.save(optionalBook.get());
//     }else {
//         return null;
//     }
//	
//	
//}
//public Travel updateTravel(Long id, String name, String desc, Integer amount, String vender) {
//	Travel travel = findTravel1(id);
//	if(travel.getId() == id) {
//		travel.setName(name);
//		travel.setDescription(desc);
//		travel.setAmount(amount);
//		travel.setVender(vender);
//		return createTravel(travel);
//	}else {
//		return null;
//	}
//}
public model updateTravel2( model b) {
	// TODO Auto-generated method stub
	return repository.save(b);
}

//public Travel updateTravel(Long id, String name, String desc, String vender, Integer amount) {
//	Travel travel = findTravel(id);
//	if(travel.getId() == id) {
//		travel.setName(name);
//		travel.setDescription(desc);
//		travel.setVender(vender);
//		travel.setAmount(amount);
//		return createTravel(travel);
//	}else {
//		return null;
//	}
//}

}





