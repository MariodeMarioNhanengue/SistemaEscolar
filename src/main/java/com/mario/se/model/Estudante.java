package com.mario.se.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name="Estudante")
public class Estudante extends AbstractEntity<Long> {

	
	
	@Column(length = 50)
	   private String nome;
	
	@Column(length = 50)
   private String email;

	
	
	public Estudante(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
   
	
	   
}
