package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {
	
	@GetMapping("/")
	public String getForm(Model model){
		Person person = new Person();
		Education edu = new Education();
		
		model.addAttribute("person", person);
		model.addAttribute("education",edu);
		return "person";
	}
	
	@RequestMapping("/user")
	public String saveName(@ModelAttribute Person person, Education edu){
	
		return "education";
	}
	
	

}
