package Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
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
