package com.axsos.many.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsos.many.Models.Categories;
import com.axsos.many.Models.Products;
import com.axsos.many.Reposeitory.ProductsRepo;
import com.axsos.many.Servesies.Servesies;



@Controller
public class Controllers2 {
	private final Servesies dnsevesies;

	 public Controllers2(Servesies dnsevesies) {
	      this.dnsevesies = dnsevesies;
	  }
	 
	 
	 
	 @RequestMapping("/")
		public String home(Model model) {
		 List<Products> prode=dnsevesies.allproducts();
		 List<Categories> catee=dnsevesies.allcategory();
		 model.addAttribute("cate", catee);
		 model.addAttribute("prod", prode);
			return "Homepage.jsp";
		}
	 @RequestMapping("/Newproduct")
	 public String addproducts(@Valid @ModelAttribute("pro") Products product, BindingResult result) {
		 
		 return "addproduct.jsp";
	 }
	
	 
	 @PostMapping("/Newproduct2")
	 public String newproduct(@Valid @ModelAttribute("pro") Products product, BindingResult result) {
		 dnsevesies.createproduct(product);
		 return "redirect:/";
	 }
	 @RequestMapping("/Newcategory")
	 public String addcategory(@Valid @ModelAttribute("newcate") Categories category, BindingResult result) {
		 
		 return "addcategory.jsp";
	 }
	
	 @PostMapping("/Newcategory")
	 public String newcategory(@Valid @ModelAttribute("newcate") Categories category, BindingResult result) {
		 dnsevesies.createcategory(category);
		 return "redirect:/";
	 }
	 @RequestMapping("/productpage/{id}")
	 public String productpage(@PathVariable("id") Long id,Model model) {
		 model.addAttribute("showproduct",dnsevesies.findproduct(id) );
		 model.addAttribute("allproduct",dnsevesies.notallcategories(dnsevesies.findproduct(id)) );
		 
		 return "productpage.jsp";
	 }
	 @RequestMapping("/categorypage/{id}")
	 public String categorypage(@Valid @ModelAttribute("newca") Categories cate, BindingResult result, @PathVariable("id") Long id,Model model) {
		 model.addAttribute("showcategory",dnsevesies.findcategory(id) );
		 model.addAttribute("allcatgoreis",dnsevesies.notallproducts(dnsevesies.findcategory(id)) );
		 
		 return "categorypage.jsp";
	 }
	 
	 @PostMapping("/cattopro/{id}")
	 public String categorypagesd( @PathVariable("id") Long id,@RequestParam("category")Long id1,Model model) {
//		 model.addAttribute("showcategory",dnsevesies.findcategory(id) );
		 Products thisProduct =dnsevesies.findproduct(id);
		 Categories thiscate =dnsevesies.findcategory(id1);
		 
		 List<Categories> cc =  thisProduct.getCategories();
		 cc.add(thiscate);
		 dnsevesies.updatepro(thisProduct);
//		 ProductsRepo.save(thisProduct);
		 
		 return "redirect:/productpage/{id}";
	 }
	 //-------------------------------------------------------------------------------
	 @PostMapping("/protocat/{id}")
	 public String categorypagesdd( @PathVariable("id") Long id,@RequestParam("product")Long id1,Model model) {
//		 model.addAttribute("showcategory",dnsevesies.findcategory(id) );
		 Products thisProduct =dnsevesies.findproduct(id1);
		 Categories thiscate =dnsevesies.findcategory(id);
		 
		 List<Products> cc =  thiscate.getProducts();
		 cc.add(thisProduct);
		 dnsevesies.updatecat(thiscate);
//		 ProductsRepo.save(thisProduct);
		 
		 return "redirect:/categorypage/{id}";
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
//	@RequestMapping("/")
//	public String dojo(@Valid @ModelAttribute("dojo") Models dojo, BindingResult result) {
//		return "Dojo.jsp";
//	}
//	
//	  @PostMapping("/Newdojo")
//	    public String create(@Valid @ModelAttribute("dojo") Models dojo, BindingResult result) {
//	    	  if (result.hasErrors()) {
//	    	
//	              return "Dojo.jsp";
//	          } else {
//	        	  dnsevesies.createmodel(dojo);
//	              return "redirect:/";
//	          }
//	    }
//
//	    @RequestMapping("/ninjapage")
//		public String ninja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result,Model model) {
//	    	model.addAttribute("alldojo", dnsevesies.allmodel()); 
//			return "Ninja.jsp";
//		}
//	    
//	   
//	    @PostMapping("/Newninja")
//	    public String createninja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
//	    	  if (result.hasErrors()) {
//	    	
//	              return "Ninja.jsp";
//	          } else {
//	        	  dnsevesies.createnija(ninja);
//	              return "redirect:/ninjapage";
//	          }
//	    }
//	    @RequestMapping("/dojos/{id}")
//		public String dojo( @PathVariable("id") Long id,Model model) {
//			Models ds=dnsevesies.findmodel(id);
//			
//			model.addAttribute("allninja",ds);
//	    	
//	    	return "show.jsp";
//		}
//


	    














}
