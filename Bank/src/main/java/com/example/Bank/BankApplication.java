package com.example.Bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@SpringBootApplication
public class BankApplication {

	Créditos creditos = new Créditos();
	Débitos debitos = new Débitos();
	Operaciones operacion = new Operaciones();

	@RequestMapping("/ingresandocredito")
	public int montoCr(){
		creditos.montoC();
		int x = 0;
		 x++;
		 return 1;
	}

	@RequestMapping("/ingresandodebito")
	public int montoDe(){
		int y = 0;
		operacion.setSuma(y);
		y++;
		return 1;
	}


	@RequestMapping("/creditototal")
	public int totalCr(){
		int a = creditos.totalC();
		return a;
	}

	@RequestMapping("/debitototal")
	public int totalDe(){
		int a = debitos.totalD();
		return a;
	}


	@RequestMapping("/mostrarelementoscr")
	public String mostrarCr(){
		//creditos.toString();
		String elementos = creditos.creditosarr.toString();
		String elementosfinal = Arrays.toString(creditos.creditosarr);
		return elementosfinal;
	}
	@RequestMapping("/mostrarelementosde")
	public String mostrarDe(){
		String elementosde = debitos.debitosarr.toString();
		String elementosfinalde = Arrays.toString(debitos.debitosarr);
		return elementosfinalde;
	}


	@RequestMapping("/saldo")
	public int saldo(){
		int c = totalCr();
		int d = totalDe();
		int saldo1 = c-d;
		return saldo1;
	}

	@RequestMapping("/promedio")
	public float promedio(){
		float d1 = totalDe();
		//mínimo 10 transacciones según instrucción
		float prom = (totalDe()/10);
		return prom;
	}

	@RequestMapping("/eliminar")
	public int eliminarCr(int x){
		creditos.eliminarC(x);
		return 1;
	}


	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}
	Créditos cr = new Créditos();
	Débitos deb = new Débitos();
	Operaciones op = new Operaciones();

}
