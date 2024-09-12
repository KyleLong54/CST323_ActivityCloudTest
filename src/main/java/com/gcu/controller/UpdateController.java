package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/editOrders")
public class UpdateController {
	
	@GetMapping("/")
	public String display(Model model) {
		model.addAttribute("title", "Edit Orders");
//		model.addAttribute("loginModel", new LoginModel());
		return "editOrders";
	} // end display
	
} // end UpdateController
