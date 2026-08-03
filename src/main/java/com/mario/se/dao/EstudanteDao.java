package com.mario.se.dao;

import java.util.List;

import com.mario.se.model.Estudante;

public interface EstudanteDao {
   void save(Estudante estudante);
   void update(Estudante estudante);
   void delete(Long id);
   Estudante findById(Long id);
   List<Estudante> findAll();
}
