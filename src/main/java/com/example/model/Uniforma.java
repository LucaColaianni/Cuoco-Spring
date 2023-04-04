package com.example.model;

public class Uniforma {
	
	private String colore;
	private Hat hat;
	private Mestolo mestolo; // si l'uniforma di un cuoco ha di default un mestolo
	
	//getter e setter
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public Hat getHat() {
		return hat;
	}
	public void setHat(Hat hat) {
		this.hat = hat;
	}
	public Mestolo getMestolo() {
		return mestolo;
	}
	public void setMestolo(Mestolo mestolo) {
		this.mestolo = mestolo;
	}
	
	public Uniforma(String colore, Hat hat, Mestolo mestolo) {
		super();
		System.out.println("Creazione uniforma!");
		this.colore = colore;
		this.hat = hat;
		this.mestolo = mestolo;
	}
	public Uniforma() {
		super();
	}
	
	
	

}
