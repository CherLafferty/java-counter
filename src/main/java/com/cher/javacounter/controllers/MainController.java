package com.cher.javacounter.controllers;

import javax.servlet.http.HttpSession;
//like Model model-we use HttpSession session
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/home")
	// setting sessions to store visits to count variable
	public String index(HttpSession session) {
		// if the count variable is not already in session:
		if (session.getAttribute("count") == null) {
			// setAttribute to initialize count in session
			session.setAttribute("count", 0);
		} else {
			// casting Object value 0 from above to Integer
			Integer currentCount = (Integer) session.getAttribute("count");
			// increment count by 1 using getAttribute and setAttribute
			currentCount++;
			// To update the count you can also use setAttribute in the same way. If an
			// attribute with that key does not exist it will create one
			session.setAttribute("count", currentCount);
		}
		return "index.jsp";
	}

	@RequestMapping("/home/counter")
	public String showCount(HttpSession session, Model model) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			Integer currentCount = (Integer) session.getAttribute("count");
			model.addAttribute("countToShow", currentCount);
		}
		return "counter.jsp";
	}

	@RequestMapping("/home/reset")
	public String reset(HttpSession session) {
		session.removeAttribute("count");
		return "redirect:/home";
	}
}
