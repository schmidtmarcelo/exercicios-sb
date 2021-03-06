package com.example.exercicios.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	@GetMapping("/somar/{num1}/{num2}")
	public int somar(@PathVariable int num1, @PathVariable int num2) {
		return num1 + num2;
	}
	
	@GetMapping("/subtrair")
	public int subtrair(@RequestParam(name = "num1") int num1, 
			@RequestParam(name = "num2")int num2) {
		return num1 - num2;
	}
	
}
