package com.example.exercicios.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exercicios.model.entities.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@GetMapping("/qualquer")
	public Cliente obterCLiente() {
		return new Cliente(1, "teste", "19618762178261");
	}

	@GetMapping("/{id}")
	public Cliente obterCLientePorId1(@PathVariable int id) {
		return new Cliente(id, "cliente por id 1", "19618762178261");
	}
	
	@GetMapping
	public Cliente obterCLientePorId2(@RequestParam(name = "id") int id) {
		return new Cliente(id, "cliente por id 2", "19618762178261");
	}
	
}
