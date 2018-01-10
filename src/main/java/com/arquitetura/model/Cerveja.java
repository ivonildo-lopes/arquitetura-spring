package com.arquitetura.model;

import org.hibernate.validator.constraints.NotEmpty;

public class Cerveja {

	@NotEmpty
	private String sku;
	private String nome;

	public Cerveja() {	}

	public Cerveja(String sku, String nome) {
		super();
		this.sku = sku;
		this.nome = nome;
	}
	
	//get and set

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
