package org.alma.springdemo.controllers;

import java.util.LinkedHashMap;
import java.util.Map;

import org.alma.springdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/showForm")
	public String showForm(final Model theModel) {
		//create a new student object
		Student student = new Student();
		// add to the model
		theModel.addAttribute("student",student);
		Map<String,String >countryOptions = new  LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");	
		countryOptions.put("US", "United State of America");	
		theModel.addAttribute("countryOptions",countryOptions);
		Map<String,String > favoriteLanguage = new  LinkedHashMap<>();
		favoriteLanguage.put("PHP", "Php");
		favoriteLanguage.put("JAVA", "Java");
		favoriteLanguage.put("RUBY", "Ruby");
		favoriteLanguage.put("C#", "C#");	
		theModel.addAttribute("favoriteLanguage",favoriteLanguage);
		
		Map<String,String > operatingSystems = new  LinkedHashMap<>();
		operatingSystems.put("Linux", "Linux");
		operatingSystems.put("Windows", "Windows");
		operatingSystems.put("MacOs", "Mac os");
		theModel.addAttribute("operatingSystems",operatingSystems);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		return "student-confirmation";
	}
}
