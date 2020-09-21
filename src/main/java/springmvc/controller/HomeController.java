package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping( path="/home" , method = RequestMethod.GET )
	public String home(Model model) {
		model.addAttribute("name", "Shubham Nigam");
		model.addAttribute("age", 21);
		List<String> friend = new ArrayList<String>();
		friend.add("shubhanshu");
		friend.add("sakshi");	
		friend.add("kshitij");
		model.addAttribute("friends",friend);
		return "index";
	}

	@RequestMapping("/about")
	public ModelAndView about() {
		// creating ModelAndView object
		ModelAndView modelAndView = new ModelAndView();
		// adding data to model and view object
		modelAndView.addObject("name", "Shubhanshu");
		modelAndView.addObject("age", 20);
		// adding view page
		modelAndView.setViewName("about");
		LocalDateTime localDateTime = LocalDateTime.now();
		modelAndView.addObject("date",localDateTime);
		return modelAndView;
	}

 
}
