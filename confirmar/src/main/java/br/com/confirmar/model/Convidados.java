package br.com.confirmar.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "convidados")
public class Convidados {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int id_Familiares;
	private int id_Pessoas;
	private Date dataCadastro;
	private int status;
	
	public int getId_Convidados() {
		return id;
	}
	public void setId_Convidados(int id) {
		this.id = id;
	}
	public int getId_Familiares() {
		return id_Familiares;
	}
	public void setId_Familiares(int id_Familiares) {
		this.id_Familiares = id_Familiares;
	}
	public int getId_Pessoas() {
		return id_Pessoas;
	}
	public void setId_Pessoas(int id_Pessoas) {
		this.id_Pessoas = id_Pessoas;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
