package com.nareshit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String getHomePage(Model model) {
		model.addAttribute("greeting", "welcome to customer self care web portal");
		model.addAttribute("tagline", "unique store!!");
		return "home";
	}
}
