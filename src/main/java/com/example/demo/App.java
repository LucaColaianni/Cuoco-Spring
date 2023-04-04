package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*import com.example.model.Cuoco;
import com.example.model.CuocoMobile;*/
import com.example.services.CuocoService;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		/*Cuoco cuoco  = context.getBean("cuoco" , Cuoco.class);
		CuocoMobile cuocoMobile = context.getBean("cuocoMobile" , CuocoMobile.class);
		System.out.println(cuoco);
		System.out.println(cuoco.getCuocoMobile());
		System.out.println(cuocoMobile);*/
		
		 CuocoService service = context.getBean("cuocoService" , CuocoService.class);
		 
		 service.cucina();
		 service.pulisce();
	}
	
}
