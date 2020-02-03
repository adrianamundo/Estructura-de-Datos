package com.example.Bank;

import java.util.Arrays;
import java.util.Scanner;

public class Créditos {


    Operaciones[] creditosarr = new Operaciones[10];

    int contadorc = 0;

    Scanner input = new Scanner(System.in);
    //double []creditos = new double[10];

    Operaciones operacion = new Operaciones();

    //Ingresar monto de crédito
    public void montoC(){
        System.out.println("Ingrese monto \n");
        int montoc = input.nextInt();
        operacion.setSuma(montoc);
        creditosarr[contadorc] = operacion;
        contadorc++;
        System.out.println("Se ha agregado "+montoc);
    }

    //total de creditos
    public int totalC(){
        int totalc = 0;
        for(int i =0; i<contadorc; i++){
            totalc = creditosarr[i].getSuma();
        }
        System.out.println(totalc);
        return totalc;
    }

    //eliminar creditos
    public void eliminarC(int posicionc){
        for(int i = posicionc -1; i< creditosarr.length-1; i++ ){
            creditosarr[i] = creditosarr[i+1];
        }
        contadorc--;
        //menos dos por el mas uno de arriba
        creditosarr[creditosarr.length-2]=creditosarr[creditosarr.length-1];
    }

    //Imprimir elementos
    public void imprimirC(){
        System.out.println(Arrays.toString(creditosarr));

    }









    //Ingresar mínimo 5 créditos

    // Mostrar total de créditos
    // Hacer el conteo y mostrar cuantas operaciones de crédito y débito se tienen durante la ejecución*/
}
