package com.mario.se.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mario.se.model.Curso;

@Service
public interface CursoService {
	void salvar(Curso curso);
	void editar(Curso curso);
	void excluir(Long id);
	void buscarPorId(Long id);
	List<Curso>BuscarTodos();
	void salvarTodos(List<Curso> curso);

}
