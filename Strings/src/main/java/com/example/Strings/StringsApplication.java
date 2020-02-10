package com.example.Strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class StringsApplication {

	Palindrome palindrome = new Palindrome();
	Lectura lectura = new Lectura();

	@RequestMapping ("/esPalindrome")
	public void esPalindrome(){
		Palindrome tester1 =  new Palindrome();
		String testertester1 = "SOS";
		System.out.println(tester1.esPalindrome(testertester1));
	}

	@RequestMapping ("/separarCSV")
	public void separarCSV(){
		Lectura tester2 = new Lectura();
		Palindrome testertester2 = new Palindrome();


		String csvLISTA = "RAR, REDDER, REDIVIDER, REER, REFER";
		tester2.csvLista();
		tester2.separarCSV(csvLISTA);

		palindrome.printP(lectura.separatedCSV);



	}








	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}

}
