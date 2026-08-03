package com.mario.se.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table (name="Curso")
public class Curso extends AbstractEntity<Long> {
	
	@Column(name="nome",length = 50,nullable = false)
	private String nome;
	
	@Column(name ="carga")
	private Integer Carga;
	
	@OneToMany(mappedBy ="curso")
	private List<Estudante> estudante;

	public Curso(String nome, Integer carga, List<Estudante> estudante) {
		super();
		this.nome = nome;
		Carga = carga;
		this.estudante = estudante;
	}

	public List<Estudante> getEstudante() {
		return estudante;
	}

	public void setEstudante(List<Estudante> estudante) {
		this.estudante = estudante;
	}



	public Curso(String nome, Integer carga) {
		super();
		this.nome = nome;
		Carga = carga;
	}
      
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCarga() {
		return Carga;
	}

	public void setCarga(Integer carga) {
		Carga = carga;
	}
	
	
	

}
