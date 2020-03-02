package org.alma.springdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	/**
	 * Mapping on the path 
	 * Return the view name, method name is flexible
	 * @return
	 */
	@RequestMapping("/")
	public String showPage() {
		return "main-menu"; // jsp add by the resolver
	}
}
