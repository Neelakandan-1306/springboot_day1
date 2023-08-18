package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Color {
	private String a="Black";
	@GetMapping("c")
	public String display()
	{
		return "My favourite color is "+a+".";
	}
}
