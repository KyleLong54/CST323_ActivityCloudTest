package com.gcu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.business.OrdersBusinessServiceInterface;
import com.gcu.business.SecurityBusinessService;
import com.gcu.model.LoginModel;
import com.gcu.model.OrderModel;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private OrdersBusinessServiceInterface service;

	@Autowired
	private SecurityBusinessService security;

	@GetMapping("/")
	public String display(Model model) {
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", new LoginModel());
		return "login";
	} // end display

	@PostMapping("/doLogin")
	public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("title", "Login Form");
			return "login";
		} // end if

		// Print the form values out
		System.out.println(String.format("Form with a username of %s and a password of %s", loginModel.getUsername(),
				loginModel.getPassword()));

		List<OrderModel> orders = service.getOrders();

		model.addAttribute("title", "My Orders");
		model.addAttribute("orders", orders);

		// OrdersBusinessService test method
		service.test();
		// SecurityBusinessService authenticate method
		security.authenticate("UserTest", "PassTest");

		// Navigate to the orders view
		return "orders";
	} // end doLogin
} // end LoginController
