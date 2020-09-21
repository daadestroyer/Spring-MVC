package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	
	
	// This thing will call automatically before all others handlers
	@ModelAttribute
	public void commonData(Model model) {
		model.addAttribute("Header", "Learn Code with Shubham");
		model.addAttribute("Desc", "Home for Programmer");
	}
	@RequestMapping("/contact")
	public String showForm(Model model) {
		return "contact";
	}

	// Getting Data from View to Controller using @ModelAttriute Annotation
	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String register(@ModelAttribute User user , Model model ) {
		System.out.println(user);
		if(user.getUemail()=="") {
			return "redirect:/contact";
		}
		int createUser = this.userService.createUser(user);
		model.addAttribute("msg", "User Created with Id :"+createUser);
		return "success";
	} 
	
	
	// Getting Data from View to Controller using @RequestParam Annotation
	/*
	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String register(@RequestParam(name = "uemail", required = false) String uemail,
			@RequestParam("uname") String uname, @RequestParam("upswd") String upassword, Model model) {

		User user = new User();
		user.setUemail(uemail);
		user.setUname(uname);
		user.setUpassword(upassword);
		System.out.println(user);
		model.addAttribute("user", user);

		return "success";
	}*/

}
