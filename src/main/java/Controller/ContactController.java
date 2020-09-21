package Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/online.daadestroyer.com")
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String register(
			@RequestParam(name="uemail", required = false ) String uemail , 
			@RequestParam("uname") String uname , 
			@RequestParam("upswd") String upassword, 
			Model model) {
		 
		 	model.addAttribute("name",uname);
		 	model.addAttribute("email", uemail);
		 	model.addAttribute("password", upassword);
		 	
		return "success";
	}
}
