package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.repository.CuocoRepository;

@Component("cuocoService")
public class CuocoServiceImpl implements CuocoService {

	@Autowired
	private CuocoRepository repository;
	
	@Override
	public void cucina() {
		if(this.repository.getCuoco() != null)
		// TODO Auto-generated method stub
		System.out.println("Sto cucinando");
	}

	@Override
	public void pulisce() {
		if(this.repository.getCuoco() != null)

		// TODO Auto-generated method stub
		System.out.println("Sto pulendo");
		
	}

	@Override
	public void goForwardWithCuocoMobile() {
		if(this.repository.getCuoco() != null)

		// TODO Auto-generated method stub
		System.out.println("Sto andando avanti con la cuoco mobile!");
		
	}

	@Override
	public void goBackwardWithCuocoMobile() {
		if(this.repository.getCuoco() != null)

		// TODO Auto-generated method stub
		System.out.println("Sto andando indietro con la cuoco mobile!");
		
	}

}
