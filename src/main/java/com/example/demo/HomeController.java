package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Home Controller
@Controller
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "home";
	}
}
