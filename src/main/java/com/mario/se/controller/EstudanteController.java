package com.mario.se.controller;

import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mario.se.model.Estudante;
import com.mario.se.service.EstudanteService;

@RestController
@RequestMapping("/escola")
public class EstudanteController {

	
	// dados para estudante
	private final EstudanteService estudanteService;
	
	public EstudanteController(EstudanteService estudanteService) {
		this.estudanteService=estudanteService;
	}
	
	//Estudante
	@GetMapping
	public List<Estudante> listar(){
		return estudanteService.listar();
	}

	
	//criar
	@PostMapping
	public Estudante criar(@RequestBody Estudante estudante) {
		return estudanteService.salvar(estudante);
		
	}
	
	//deletar
	@DeleteMapping("{id}")
	public void deletar( @PathVariable Long id) {
		estudanteService.deletar(id);
		
	}
	
}
