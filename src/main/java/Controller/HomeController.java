package Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Shubham Nigam");
		model.addAttribute("age", 21);
		List<String> friend = new ArrayList<String>();
		friend.add("shubhanshu");
		friend.add("sakshi");	
		model.addAttribute("friends",friend);
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		return "about";
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
