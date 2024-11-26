package com.helloworld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorld {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping ("/bsm")
	public String listaBsmGeneration() {
		return "Persistência\n"
			    +"Comunicação\n"
				+"Oreintação aos Detalhes\n" 
			    +"Trabalho em Equipe\n" 
				+"Orientação ao Futuro\n";
	}
	
	@GetMapping ("/objetivos")
	public String listaObjetivos() {
		return "Estudar mais sobre Spring Boot\n" 
	          +"Estudar mais sobre HTTP\n"
			  +"Revisar sobre banco de dados\n" 
	          +"Entender melhor o que é servidor\n"
			  +"Praticar tudo o que aprendi";
	}

}
