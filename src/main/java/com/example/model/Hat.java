package com.example.model;

public class Hat {

	private String colore;

	public Hat(String colore) {
		super();
		System.out.println("Creazione cappello!");
		this.colore = colore;
	}

	public Hat() {
		super();
	}

	//getter & setter
	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}
}
