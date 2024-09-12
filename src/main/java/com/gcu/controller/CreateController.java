package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/addOrder")
public class CreateController {
	
	@GetMapping("/")
	public String display(Model model) {
		model.addAttribute("title", "Add Order");
//		model.addAttribute("loginModel", new LoginModel());
		return "addOrder";
	} // end display
	
} // end CreateController
