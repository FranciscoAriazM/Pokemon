package com.test2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.test2.service.IPokemonService;

@Controller
public class PokemonCrontoller {

	@Autowired
	private IPokemonService service;

	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("pokemones", service.listarPokemon());
		return "index";
	}

}
