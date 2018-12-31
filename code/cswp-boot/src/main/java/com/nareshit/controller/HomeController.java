package com.nareshit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@Autowired
	private Environment env;
	
	@RequestMapping(value="/")
	public String getHomePage(Model model) {
		System.out.println("********Todays Price Is:\t"+env.getProperty("offer.todays.price"));
		model.addAttribute("greeting", "welcome to customer self care web portal");
		model.addAttribute("tagline", "unique store!!");
		return "home";
	}
}
