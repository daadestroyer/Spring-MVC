package Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.datetime.joda.LocalDateTimeParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
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

	@RequestMapping("/services")
	public String services() {
		return "services";
	}

	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
}
