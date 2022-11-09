package com.axsos.login1.Controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.login1.Serves.Serveses;
import com.axsos.login1.models.Login;
import com.axsos.login1.models.User;

@Controller
//@Autowired
public class Controllers {
	 @Autowired
	private final Serveses userServ;

	public Controllers(Serveses userServ) {
		super();
		this.userServ = userServ;
	}
	@GetMapping("/home")
    public String home(Model model, HttpSession session) {
        if (session.getAttribute("user_id") != null) {
        Long user_id = (Long) session.getAttribute("user_id");
        User thisUser = userServ.findUserById(user_id);
        model.addAttribute("thisUser", thisUser);
        return "login.jsp";
    }
        else {
            return "redirect:/";
        }
    }
			
			
		    
		
	
			    @GetMapping("/")
			    public String index(Model model) {
			        model.addAttribute("newUser", new User());
			        model.addAttribute("newLogin", new Login());
			        return "index.jsp";
			    }
			    
			    @PostMapping("/register")
			    public String register(@Valid @ModelAttribute("newUser") User newUser, 
			            BindingResult result, Model model, HttpSession session) {
			        userServ.register(newUser, result);
			        if(result.hasErrors()) {
			            model.addAttribute("newLogin", new Login());
			            return "index.jsp";
			        }
			        session.setAttribute("user_id", newUser.getId());
			        return "redirect:/home";
			    }
			    
			    @PostMapping("/login")
			    public String login(@Valid @ModelAttribute("newLogin") Login newLogin, 
			            BindingResult result, Model model, HttpSession session) {
			        User user = userServ.login(newLogin, result);
			        if(result.hasErrors()) {
			            model.addAttribute("newUser", new User());
			            return "index.jsp";
			        }
			        session.setAttribute("user_id", user.getId());
			        return "redirect:/home";
			    }
			    @GetMapping("/logout")
			    public String logout(HttpSession session) { 
			            session.invalidate();
			            return "redirect:/";

			    }
			
			// .. don't forget to inlcude all your imports! ..
		    
			
			    
//			     Add once service is implemented:
			    
//			     private UserService userServ;
			    
//			    @GetMapping("/")
//			    public String index(Model model) {
//			    
//			        // Bind empty User and LoginUser objects to the JSP
//			        // to capture the form input
//			        model.addAttribute("newUser", new User());
//			        model.addAttribute("newLogin", new LoginUser());
//			        return "index.jsp";
//			    }
			    
//			    @PostMapping("/register")
//			    public String register(@Valid @ModelAttribute("newUser") User newUser, 
//			            BindingResult result, Model model, HttpSession session) {
//			        
//			        // TO-DO Later -- call a register method in the service 
//			        // to do some extra validations and create a new user!
//			        
//			        if(result.hasErrors()) {
//			            // Be sure to send in the empty LoginUser before 
//			            // re-rendering the page.
//			            model.addAttribute("newLogin", new LoginUser());
//			            return "index.jsp";
//			        }
//			        
			        // No errors! 
			        // TO-DO Later: Store their ID from the DB in session, 
			        // in other words, log them in.
			    
//			        return "redirect:/home";
//			    }
			    
//			    @PostMapping("/login")
//			    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
//			            BindingResult result, Model model, HttpSession session) {
//			        
//			        // Add once service is implemented:
//			        // User user = userServ.login(newLogin, result);
//			    
//			        if(result.hasErrors()) {
//			            model.addAttribute("newUser", new User());
//			            return "index.jsp";
//			        }
//			    
//			        // No errors! 
//			        // TO-DO Later: Store their ID from the DB in session, 
//			        // in other words, log them in.
//			    
//			        return "redirect:/home";
//			    }
			    
			

			
	
	
}
