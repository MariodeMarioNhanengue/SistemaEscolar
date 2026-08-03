package com.mario.se.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mario.se.model.Estudante;
import com.mario.se.repository.EstudanteRepository;

@Service
public class EstudanteService {
	
	//Estudante
	private final EstudanteRepository estudanteRepository;
	public EstudanteService(EstudanteRepository estudanteRepository) {
		this.estudanteRepository=estudanteRepository;
	}
	
	//listar
	public List<Estudante> listar() {
	  return estudanteRepository.findAll();
	}

	//salvar ou criar
	public Estudante salvar( Estudante estudante ) {
		return estudanteRepository.save(estudante);
	}
	
	//deletar
	public void deletar ( Long id) {
		estudanteRepository.deleteById(id);
	}
}
