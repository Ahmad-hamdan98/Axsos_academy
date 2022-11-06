package com.axsos.savetravel.services;

import java.util.List;
import java.util.Optional;

//import javax.validation.Valid;

//...
import org.springframework.stereotype.Service;

import com.axsos.savetravel.models.Travel;
import com.axsos.savetravel.repositories.TravelRepositries;


@Service
public class Trevelservices {
// private static final Travel ;
// adding the book repository as a dependency
	private final TravelRepositries travelRepository;
 
 public Trevelservices(TravelRepositries travelRepository) {
     this.travelRepository = travelRepository;
 }
 // returns all the books
 public List<Travel> allTravel() {
     return travelRepository.findAll();
 }
 // creates a book
 public Travel createTravel(Travel b) {
     return travelRepository.save(b);
 }
 // retrieves a book
 public Travel findTravel1(Long id) {
     Optional<Travel> optionalTravel = travelRepository.findById(id);
     if(optionalTravel.isPresent()) {
         return optionalTravel.get();
     } else {
         return null;
     }
 }
public void deleteTravel(Long id) {
	// TODO Auto-generated method stub
	  Optional<Travel> optionalTravel = travelRepository.findById(id);
	     if(optionalTravel.isPresent()) {
	    	 travelRepository.delete(optionalTravel.get());
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
public Travel updateTravel2(Travel travel) {
	// TODO Auto-generated method stub
	 return travelRepository.save(travel);
}



}

