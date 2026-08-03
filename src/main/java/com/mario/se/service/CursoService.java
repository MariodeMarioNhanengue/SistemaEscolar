package com.mario.se.service;

import java.util.List;

import com.mario.se.model.Curso;

public interface CursoService {
	void salvar(Curso curso);
	void editar(Curso curso);
	void excluir(Long id);
	void buscarPorId(Long id);

	List<Curso>BuscarTodos();

}
