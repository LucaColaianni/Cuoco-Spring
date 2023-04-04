package com.example.demo;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.model.Cuoco;
import com.example.model.CuocoMobile;
import com.example.model.Hat;
import com.example.model.Mestolo;
import com.example.model.Uniforma;

@Configuration
@ComponentScan({"com.example.repository","com.example.services"})
public class AppConfig {

	
	@Bean(name = "cuoco")
	@Scope(BeanDefinition.SCOPE_SINGLETON)
	public Cuoco getCuoco() {
		return new Cuoco(getUniforma(), getCuocoMobile());
		
	}
	
	@Bean(name = "cuocoMobile")
	public CuocoMobile getCuocoMobile() {
		return new CuocoMobile("#000000");
		
	}
	
	@Bean(name = "hat")
	public Hat getHat() {
		return new Hat("#FFFFFF");
		
	}
	
	@Bean(name = "mestolo")
	public Mestolo getMestolo() {
		return new Mestolo(20);
		
	}
	
	@Bean(name = "uniforma")
	public Uniforma getUniforma() {
		return new Uniforma("#FFFFFF" , getHat() , getMestolo());
		
	}
	
	

}
