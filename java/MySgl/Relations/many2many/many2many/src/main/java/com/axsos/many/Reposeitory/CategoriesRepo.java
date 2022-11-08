package com.axsos.many.Reposeitory;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.many.Models.Categories;
import com.axsos.many.Models.Products;



//...
@Repository
public interface CategoriesRepo extends CrudRepository<Categories, Long>{
 // this method retrieves all the books from the database
 List<Categories> findAll();
 // this method finds books with descriptions containing the search string
 // this method counts how many titles contain a certain string
// Long countByTitleContaining(String search);
 // this method deletes a book that starts with a specific title
// Long deleteByTitleStartingWith(String search);
 public List<Categories> findByProductsNotContains(Products product);
 
}
