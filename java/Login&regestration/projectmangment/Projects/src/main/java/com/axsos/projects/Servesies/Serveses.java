package com.axsos.projects.Servesies;




import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.axsos.projects.Models.Login;
import com.axsos.projects.Models.Projects;
import com.axsos.projects.Models.Task;
import com.axsos.projects.Models.User;
import com.axsos.projects.Repositories.TaskRepo;
import com.axsos.projects.Repositories.projectRepo;
import com.axsos.projects.Repositories.userRepo;





@Service
public class Serveses {
    
    @Autowired
    private userRepo userRepo;
    @Autowired
    projectRepo projectRepo;
    @Autowired
    TaskRepo taskRepo;
    
    
    // TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {
    	
    	Optional<User> opuser = userRepo.findByEmail(newUser.getEmail());
    	if(opuser.isPresent()) {
    		result.rejectValue("email", "Matches", "An account with that email already exists!");
    	}
    	if(!newUser.getPassword().equals(newUser.getConfirm())) {
    		result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");

    	}
    	
    	if(result.hasErrors()) {
    		return null;
    	}
    	String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
    	newUser.setPassword(hashed);
    	return userRepo.save(newUser);
    	
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
    public User findUser(Long id) {
		Optional<User> user = userRepo.findById(id);
		if(user.isPresent()) {
			return user.get();
		}
		else {
			return null;
		}
	}
    
    public Projects findProject(Long id) {
		Optional<Projects> book = projectRepo.findById(id);
		if(book.isPresent()) {
			return book.get();
		}
		else {
			return null;
		}
    }
	
    public List<Projects> findAll(){
		return projectRepo.findAll();
	}
	public Projects createProject(Projects project) {
		return projectRepo.save(project);
	}
	
	 public void deleteProject(Long id) {
	  	   Optional<Projects> ex = projectRepo.findById(id);
	         if(ex.isPresent()) {
	        	 projectRepo.deleteById(id);
	         }
	  }
	 public List<Projects> allP(Long id) {
		 return projectRepo.findAllByUserId(id);
	 }
//	 public List<Object[]> allpro(Long id) {
//		 return projectRepo.joinPojectsAndUsers(id);
//	 }
	 public List<Projects> allos(User user) {
		 return projectRepo.findByusersNotContains(user);
	 }
	 public Task createTask(Task task) {
			return taskRepo.save(task);
		}
    
	 
	 public List<Task> findAllTask(){
			return taskRepo.findAll();
		}
}