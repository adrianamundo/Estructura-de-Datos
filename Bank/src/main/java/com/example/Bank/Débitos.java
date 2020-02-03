package com.example.Bank;

import java.util.Arrays;
import java.util.Scanner;

public class Débitos {

    int contadord = 0;
    int max;

    Scanner input = new Scanner(System.in);


    Operaciones operaciond = new Operaciones();
    Operaciones[] debitosarr = new Operaciones[10];


    //Ingresar un debito
    public void montoD(){
        System.out.println("Ingrese monto \n");
        int montod = input.nextInt();
        operaciond.setSuma(montod);
        debitosarr[contadord] = operaciond;
        contadord++;
    }

    //Calcular total de debito
    public int totalD()
    {
        int totald = 0;
        for (int d = 0; d < contadord; d++) {
            totald = debitosarr[d].getSuma();
        }
        System.out.println(totald);
        return totald;
    }

    //Promedio de débitos
    public int calculoPromedio(){
        return (totalD()/contadord);
    }

    //Mostrar el monto de débitos más grande
    /*public int mayorD(){
        int max = debitosarr[0];
        for (int d1=0; d1<debitosarr.length; d1++){
            if(<debitosarr[d1]){

            }
        }
        return ;
    }*/

    //Imprimir elementos
    public void imprimirD(){
        System.out.println(Arrays.toString(debitosarr));
    }


//para sacar total, base: https://aprenderaprogramar.com/foros/index.php?topic=6774.0


}
