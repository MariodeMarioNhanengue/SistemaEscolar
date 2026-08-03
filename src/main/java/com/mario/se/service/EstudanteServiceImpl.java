package com.mario.se.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mario.se.dao.EstudanteDao;
import com.mario.se.model.Estudante;


@Service
@Transactional(readOnly = false)
public class EstudanteServiceImpl implements EstudanteService {

	@Autowired
	private EstudanteDao estudanteDao;
	
	
	@Override
	public void salvar(Estudante estudante) {
		estudanteDao.save(estudante);
		
	}

	@Override
	public void editar(Estudante estudante) {
		estudanteDao.update(estudante);
		
	}

	@Override
	public void excluir(Long id) {
		estudanteDao.delete(id);
		
	}

	@Override @Transactional(readOnly = true)
	public void buscarPorId(Long id) {
		estudanteDao.findById(id);
		
	}

	@Override @Transactional(readOnly = true)
	public List<Estudante> BuscarTodos() {
	
		return estudanteDao.findAll();
	}
	

}
