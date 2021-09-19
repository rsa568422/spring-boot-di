package com.bolsadeideas.springboot.di.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.models.services.MiServicio;

@Controller
public class IndexController {
	
	private MiServicio miServicio = new MiServicio();
	
	@GetMapping({ "", "/", "/index" })
	public String index(Model model) {
		model.addAttribute("objeto", miServicio.operacion());
		return "index";
	}

}
