package com.example.Strings;

import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args){

        Lectura lectura = new Lectura();
        Palindrome palindrome = new Palindrome();

        //List<String> lista = Arrays.asList()
        String CSVList = "NANNAN, NAURRUAN, NBN, NEN, NEVEN, NGN, NIN, NISIN, NMN, NN, NON, NOON, NRN, NSN, NUN, O, OBO, OGO, OGOPOOGO, OHO, ONO, OO, OOO, OPPO, OSO, OTO, OTTO, OWO, OXO, P, PAP, PBP, PCP, PDP, PEEP, PEP, PGP, PHP, PIP, PIPIPIP, PNP, POOP, POP, PP, PPP, PRP, PSP, PULLUP, PUP, PVP, PWP, PZP, Q, QAANAAQ, QAZAQ, QOQ, QQ, R, RACECARS, RADAR, RAR, REDDER, REDIVIDER, REER, REFER";
        //base: https://howtodoinjava.com/java/string/java-split-csv-string-to-list/

        lectura.csvLista();
        lectura.separarCSV(CSVList);


        System.out.println("Los palindromes de la lista son: \n");
        palindrome.printP(lectura.separatedCSV);




    }


}
