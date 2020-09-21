package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReController {

	@RequestMapping("/one")
	public String one() {
		System.out.println("one");
		return "redirect:/two";
	}

	@RequestMapping("/two")
	public String second() {
		System.out.println("two");
		return "contact";
	}
}
