package com.axsos.login1.Serves;






import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;

//import javax.validation.Valid;

//import javax.validation.Valid;

//...
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.axsos.login1.Reposotry.Reposetroy;
import com.axsos.login1.models.Login;
import com.axsos.login1.models.User;





@Service
public class Serveses {
// private static final Travel ;
// adding the book repository as a dependency
	@Autowired
	private final Reposetroy userRepo;

public Serveses(Reposetroy user) {
	
	this.userRepo = user;
}
	



// TO-DO: Write register and login methods!
public User register(User newUser, BindingResult result) {
	if(userRepo.findByEmail(newUser.getEmail()).isPresent()) {
        result.rejectValue("email", "Unique", "This email is already in use!");
    }
    if(!newUser.getPassword().equals(newUser.getConfirm())) {
        result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
    }
    if(result.hasErrors()) {
        return null;
    } else {
        String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
        newUser.setPassword(hashed);
        return userRepo.save(newUser);
    }
}
public User login(Login newLogin, BindingResult result) {
	if(result.hasErrors()) {
        return null;
    }
    Optional<User> potentialUser = userRepo.findByEmail(newLogin.getEmail());
    if(!potentialUser.isPresent()) {
        result.rejectValue("email", "Unique", "Unknown email!");
        return null;
    }
    User user = potentialUser.get();
    if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
        result.rejectValue("password", "Matches", "Invalid Password!");
    }
    if(result.hasErrors()) {
        return null;
    } else {
        return user;
    }
}
public User findUserById(Long id) {
    Optional<User> u = userRepo.findById(id);

    if(u.isPresent()) {
        return u.get();
        } else {
        return null;
    }
}

}
 

//public Servesies(ProductsRepo prodect, CategoriesRepo catagory) {
//	
//		this.prodect = prodect;
//		this.catagory = catagory;
//	}
//// returns all the books
// public List<Products> allproducts() {
//     return prodect.findAll();
// }
// // creates a book
// public Products createproduct(Products b) {
//     return prodect.save(b);
// }
// // retrieves a book
// public Products updatepro(Products b) {
//     return prodect.save(b);
// }
// public Products findproduct(Long id) {
//     Optional<Products> optionalrepositroy = prodect.findById(id);
//     if(optionalrepositroy.isPresent()) {
//         return optionalrepositroy.get();
//     } else {
//         return null;
//     }
// }
// //----------------------------------------------------------------------------------
// public List<Categories> allcategory() {
//     return catagory.findAll();
// }
//
// // creates a book
// public Categories createcategory(Categories b) {
//     return catagory.save(b);
// }
// public Categories updatecat(Categories b) {
//	 return catagory.save(b);
// }
// // retrieves a book
// public Categories findcategory(Long id) {
//     Optional<Categories> optionalrepositroy = catagory.findById(id);
//     if(optionalrepositroy.isPresent()) {
//         return optionalrepositroy.get();
//     } else {
//         return null;
//     }
// }
// 
// public List<Products> notallproducts(Categories c){
//	 
//	 return prodect.findByCategoriesNotContains(c);
// }
// public List<Categories> notallcategories(Products c){
//	 
//	 return catagory.findByProductsNotContains(c);
// }
 



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