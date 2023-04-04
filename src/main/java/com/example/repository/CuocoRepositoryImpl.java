package com.example.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.Cuoco;

@Component("cuocoRepository")
public class CuocoRepositoryImpl implements CuocoRepository {

	@Autowired
	private Cuoco cuoco;
	
	@Override
	public Cuoco getCuoco() {
		// TODO Auto-generated method stub
		return this.cuoco; 
	}

	@Override
	public void setCuoco(Cuoco cuoco) {
		// TODO Auto-generated method stub
		this.cuoco = cuoco;
	}

}
