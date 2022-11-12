package com.axsos.projects.Repositories;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BindingResult;

import com.axsos.projects.Models.User;




@Repository
public interface userRepo extends CrudRepository<User, Long>{

	 // this method retrieves all the books from the database
	 List<User> findAll();
	 Optional<User> findByEmail(String email);
	 
	 
	 
//	 Optional<User> findByEmail(String email);
//	Object findByEmail(String email);
//	 List<Book> findByparowNotContains(Long id);
//	 List<Book> findParowNull(User user);
//	 List<Book> findParowNullorUserid(User user,Long id);s
 
	 // this method finds books with descriptions containing the search string
	 // this method counts how many titles contain a certain string
	// Long countByTitleContaining(String search);
	 // this method deletes a book that starts with a specific title
	// Long deleteByTitleStartingWith(String search);
	// public List<User> findByProductsNotContains(Products product);
	}
