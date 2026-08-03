package com.mario.se.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mario.se.model.Estudante;


@Service
public interface EstudanteService {
	
void salvar(Estudante estudante);
void editar(Estudante estudante);
void excluir(Long id);
void buscarPorId(Long id);

List<Estudante>BuscarTodos();
}
