package com.axsos.languades.repository;




import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.languades.models.model;



//...
@Repository
public interface repository extends CrudRepository<model, Long>{
 // this method retrieves all the books from the database
 List<model> findAll();
 // this method finds books with descriptions containing the search string
 // this method counts how many titles contain a certain string
// Long countByTitleContaining(String search);
 // this method deletes a book that starts with a specific title
// Long deleteByTitleStartingWith(String search);
}