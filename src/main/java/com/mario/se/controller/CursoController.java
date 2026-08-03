package com.mario.se.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mario.se.service.CursoService;
import com.mario.se.model.*;

@RestController
@RequestMapping("/curso")
public class CursoController {
	
	private CursoService cursoService;
	
	CursoController(CursoService cursoService){
		this.cursoService=cursoService;
	}

	//Listar os cursos
	@GetMapping
	List<Curso> listar(){
		return cursoService.BuscarTodos();	
	}
	
	@PostMapping
	void cadastrar(@RequestBody Curso curso) {
		cursoService.salvar(curso);
	}
	
	@PostMapping("/todos")
	void cadastrartodos(@RequestBody List<Curso> curso) {
		cursoService.salvarTodos(curso);
		
	}
	
}
