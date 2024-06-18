package com.example.barbershop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.barbershop.service.HairStyleService;

@Controller
public class MainController {

	@Autowired
	private HairStyleService hairStyleService;

	@GetMapping("/")
	public String dashboard() {
		return "dashboard";
	}

	@GetMapping("/about")
	public String about() {
		return "about";
	}

	@GetMapping("/hairstyles")
	public String hairstyles(Model model) {
		model.addAttribute("hairstyles", hairStyleService.getAllHairStyles());
		return "hairstyles";
	}

	@GetMapping("/address")
	public String address() {
		return "address";
	}

	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
}
