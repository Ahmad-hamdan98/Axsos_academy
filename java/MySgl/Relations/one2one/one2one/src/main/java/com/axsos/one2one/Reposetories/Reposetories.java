package com.axsos.one2one.Reposetories;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.one2one.Models.Models;





//...
@Repository
public interface Reposetories extends CrudRepository<Models, Long>{
 // this method retrieves all the books from the database
 List<Models> findAll();
 // this method finds books with descriptions containing the search string
 // this method counts how many titles contain a certain string
// Long countByTitleContaining(String search);
 // this method deletes a book that starts with a specific title
// Long deleteByTitleStartingWith(String search);
}