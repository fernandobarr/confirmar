package br.com.confirmar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "familiares")
public class Familiares {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nome;
	
	public int getId_Familiares() {
		return id;
	}
	public void setId_Familiares(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
