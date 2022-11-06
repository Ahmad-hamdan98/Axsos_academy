package com.axsos.savetravel.repositories;

//import java.awt.print.Book;

//public class TravelRepositries {
//
//}



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.savetravel.models.Travel;

//...
@Repository
public interface TravelRepositries extends CrudRepository<Travel, Long>{
 // this method retrieves all the books from the database
 List<Travel> findAll();
 // this method finds books with descriptions containing the search string
 // this method counts how many titles contain a certain string
// Long countByTitleContaining(String search);
 // this method deletes a book that starts with a specific title
// Long deleteByTitleStartingWith(String search);
}
