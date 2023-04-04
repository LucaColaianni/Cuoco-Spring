package com.example.model;

public class CuocoMobile {
	private String colore;

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public CuocoMobile(String colore) {
		super();
		System.out.println("Creazione della Cuoco-mobile ");
		this.colore = colore;
	}

	public CuocoMobile() {
		super();
	}
	
	

}
