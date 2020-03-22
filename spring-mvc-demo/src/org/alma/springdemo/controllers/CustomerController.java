package org.alma.springdemo.controllers;

import java.util.List;

import org.alma.springdemo.entity.Customer;
import org.alma.springdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomer(Model theModel) {
		final List<Customer> customers = customerService.getCustomers();
		theModel.addAttribute("customers", customers);
		return "list-customers";
	}
	
	@GetMapping("showFormForAdd")
	public String showFormForAdd(Model model) {
		return "customer-form";
	}
	
	
}
