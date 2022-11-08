package com.axsos.many.Servesies;



import java.util.List;
import java.util.Optional;

//import javax.validation.Valid;

//import javax.validation.Valid;

//...
import org.springframework.stereotype.Service;

import com.axsos.many.Models.Categories;
import com.axsos.many.Models.Products;
import com.axsos.many.Reposeitory.CategoriesRepo;
import com.axsos.many.Reposeitory.ProductsRepo;



@Service
public class Servesies {
// private static final Travel ;
// adding the book repository as a dependency
	private final ProductsRepo prodect;
	private final CategoriesRepo catagory;
 
 

public Servesies(ProductsRepo prodect, CategoriesRepo catagory) {
	
		this.prodect = prodect;
		this.catagory = catagory;
	}
// returns all the books
 public List<Products> allproducts() {
     return prodect.findAll();
 }
 // creates a book
 public Products createproduct(Products b) {
     return prodect.save(b);
 }
 // retrieves a book
 public Products updatepro(Products b) {
     return prodect.save(b);
 }
 public Products findproduct(Long id) {
     Optional<Products> optionalrepositroy = prodect.findById(id);
     if(optionalrepositroy.isPresent()) {
         return optionalrepositroy.get();
     } else {
         return null;
     }
 }
 //----------------------------------------------------------------------------------
 public List<Categories> allcategory() {
     return catagory.findAll();
 }

 // creates a book
 public Categories createcategory(Categories b) {
     return catagory.save(b);
 }
 public Categories updatecat(Categories b) {
	 return catagory.save(b);
 }
 // retrieves a book
 public Categories findcategory(Long id) {
     Optional<Categories> optionalrepositroy = catagory.findById(id);
     if(optionalrepositroy.isPresent()) {
         return optionalrepositroy.get();
     } else {
         return null;
     }
 }
 
 public List<Products> notallproducts(Categories c){
	 
	 return prodect.findByCategoriesNotContains(c);
 }
 public List<Categories> notallcategories(Products c){
	 
	 return catagory.findByProductsNotContains(c);
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