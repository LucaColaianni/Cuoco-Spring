package com.example.model;

public class Mestolo {
	
	private Integer lunghezza;
	
	public Mestolo() {
		
	}
	
	public Mestolo(Integer lunghezza) {
		super();
		System.out.println("Creazione mestolo!");
		this.lunghezza = lunghezza;
	}

	public Integer getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(Integer lunghezza) {
		this.lunghezza = lunghezza;
	}
	
	
}
