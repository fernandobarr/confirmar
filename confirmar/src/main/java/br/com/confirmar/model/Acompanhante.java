package br.com.confirmar.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "acompanhante")
public class Acompanhante {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int id_Pessoas;
	private int id_Familiares;
	private Date dataCadastro;
	private int id_Status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_Pessoas() {
		return id_Pessoas;
	}
	public void setId_Pessoas(int id_Pessoas) {
		this.id_Pessoas = id_Pessoas;
	}
	public int getId_Familiares() {
		return id_Familiares;
	}
	public void setId_Familiares(int id_Familiares) {
		this.id_Familiares = id_Familiares;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public int getId_Status() {
		return id_Status;
	}
	public void setId_Status(int id_Status) {
		this.id_Status = id_Status;
	}
}
