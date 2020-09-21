package springmvc.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
/*
	@RequestMapping("/one")
	public String one() {
		System.out.println("one");
		return "redirect:/two"; // this is relative url
	}*/

	// second way to redirect by using redirectView
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("one");
		 
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://www.youtube.com");
		return redirectView; // this is relative url
	}
	@RequestMapping("/two")
	public String second() {
		System.out.println("two");
		return "contact";
	}
}
