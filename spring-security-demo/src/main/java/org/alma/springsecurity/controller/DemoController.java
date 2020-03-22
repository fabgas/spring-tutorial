package org.alma.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	// show home
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
}
