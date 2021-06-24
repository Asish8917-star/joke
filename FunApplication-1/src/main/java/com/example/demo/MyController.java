package com.example.demo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class MyController {
	@GetMapping("/")
	public String index(ModelMap m) {
		MyEntity me=new MyEntity();
		m.put("entity", me);
		return "index";
	}
	@PostMapping("/save")
	public String save( @ModelAttribute("entity") @Valid MyEntity mm,BindingResult result) {
		if(result.hasErrors()) {
			return "index";
		}
		String name=mm.getName();
		if(name.equalsIgnoreCase("asish")) {
			return "asish";
		}
		else if(name.equalsIgnoreCase("suri")) {
			return "suri";
		}
		else if(name.equalsIgnoreCase("alisha")) {
			return "alisha";
		}
		return "ali";
	}

}
