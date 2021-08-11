package com.fitzgerald.counter;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CounterController {
	
	
	@GetMapping("/locomotion")
	public String index(HttpSession session, Model model) {
		if(session.getAttribute("visitCounter") == null) {
			session.setAttribute("visitCounter", 1);	
		} else {
			Integer countNow = (Integer)session.getAttribute("visitCounter");
			session.setAttribute("visitCounter", countNow+1);	
		}

		return "index.jsp";
	}
	
	@GetMapping("/plus-count")
	public String addCount(HttpSession session, Model model){
		
		model.addAttribute("visitCounter", session.getAttribute("visitCounter"));
		
		return "counter.jsp";
	}
}