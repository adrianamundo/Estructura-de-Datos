package com.example.Struct.point;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class StructPointApplication {

	@RequestMapping("/primerQ")
	public void imprimirQ1(){
		Punto testpunto = new Punto();
		Quadrant testquadrante = new Quadrant();
		testpunto.coordenadasx = 1;
		testpunto.coordenadasy= 2;
		testquadrante.imprimirQuadrante();
	}

	@RequestMapping("/segundoQ")
	public void imprimirQ2(){
		Punto testpunto2 = new Punto();
		Quadrant testquadrante2 = new Quadrant();
		testpunto2.coordenadasx = -2;
		testpunto2.coordenadasy= 3;
		testquadrante2.imprimirQuadrante();
	}

	@RequestMapping("/tercerQ")
	public void imprimirQ3(){
		Punto testpunto3 = new Punto();
		Quadrant testquadrante3 = new Quadrant();
		testpunto3.coordenadasx = -3;
		testpunto3.coordenadasy= -4;
		testquadrante3.imprimirQuadrante();
	}

	@RequestMapping("/cuartoQ")
	public void imprimirQ4(){
		Punto testpunto4 = new Punto();
		Quadrant testquadrante4 = new Quadrant();
		testpunto4.coordenadasx = 4;
		testpunto4.coordenadasy= -7;
		testquadrante4.imprimirQuadrante();
	}



	public static void main(String[] args) {
		SpringApplication.run(StructPointApplication.class, args);
	}

}
