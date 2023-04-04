package com.example.model;

public class Cuoco {
	
	private Uniforma uniforma;

	private CuocoMobile cuocoMobile;
	
	
	public Cuoco() {
		super();
	}

	public Cuoco(Uniforma uniforma, CuocoMobile cuocoMobile) {
		super();
		System.out.println("Creazione del cuoco!");
		this.uniforma = uniforma;
		this.cuocoMobile = cuocoMobile;
	}

	//getter e setter
	public Uniforma getUniforma() {
		return uniforma;
	}

	public void setUniforma(Uniforma uniforma) {
		this.uniforma = uniforma;
	}

	public CuocoMobile getCuocoMobile() {
		return cuocoMobile;
	}

	public void setCuocoMobile(CuocoMobile cuocoMobile) {
		this.cuocoMobile = cuocoMobile;
	}
	
	

}
