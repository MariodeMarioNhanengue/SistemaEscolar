package com.mario.se.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mario.se.dao.CursoDao;
import com.mario.se.model.Curso;

@Service
@Transactional(readOnly = false)
public class CursoSeriveImpl implements CursoService {
	

	private final CursoDao cursoDao;
	
	public CursoSeriveImpl(CursoDao cursoDao) {
		this.cursoDao=cursoDao;
	}

	@Override
	@Transactional(readOnly = false)
	public void salvar(Curso curso) {
		cursoDao.save(curso);
		
	}

	@Override
	@Transactional(readOnly = false)
	public void editar(Curso curso) {
		cursoDao.update(curso);
		
	}

	@Override
	@Transactional(readOnly = false)
	public void excluir(Long id) {
	cursoDao.delete(id);
		
	}

	@Override
	@Transactional(readOnly = false)
	public void buscarPorId(Long id) {
		cursoDao.findById(id);
		
	}

	@Override
	@Transactional(readOnly = false)
	public List<Curso> BuscarTodos() {
	
		return cursoDao.findAll();
	}

	

}
