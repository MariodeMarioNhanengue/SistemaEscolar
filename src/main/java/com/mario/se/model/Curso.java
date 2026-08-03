package com.mario.se.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	private Integer carga;
	
	@OneToMany(mappedBy = "curso")
	@JsonIgnoreProperties("curso")
	private List<Estudante> estudante;

	public Curso(String nome, Integer carga, List<Estudante> estudante) {
		super();
		this.nome = nome;
		this.carga = carga;
		this.estudante = estudante;
	}

	public List<Estudante> getEstudante() {
		return estudante;
	}

	public void setEstudante(List<Estudante> estudante) {
		this.estudante = estudante;
	}



	public Curso() {
		
	}
      
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCarga() {
		return carga;
	}

	public void setCarga(Integer carga) {
		this.carga = carga;
	}
	
	
	

}
