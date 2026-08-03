package com.mario.se.dao;

import java.util.List;

import com.mario.se.model.Curso;


public interface CursoDao {

	  void save(Curso estudante);
	   void update(Curso estudante);
	   void delete(Long id);
	   Curso findById(Long id);
	   List<Curso> findAll();
	   void saveAll(List<Curso> curso);
}
