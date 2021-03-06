package com.fitness.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value = "/greetings")
	public String sayHello(Model model) {

		model.addAttribute("greeting", "Hello World!!");

		return "hello";
	}

}
