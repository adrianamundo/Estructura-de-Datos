package com.example.Bank;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int choice = 0;

        Créditos credito = new Créditos();
        Débitos debito = new Débitos();
        Saldo saldo = new Saldo();

        do{
            System.out.println("Por favor elija entre las siguientes opciones: \n");
            System.out.println("1.Ingrese un débito \n");
            System.out.println("2. Ingrese un crédito \n");
            System.out.println("3. Mostrar total de débitos \n");
            System.out.println("4. Mostrar promedio de débitos \n");
            System.out.println("5. Mostrar el débito más grande \n");
            System.out.println("6. Mostrar total de créditos \n");
            System.out.println("7. Mostrar saldo \n");
            System.out.println("8. Conteo de créditos y débitos \n");
            System.out.println("9. Mostrar elementos en arreglos \n");
            System.out.println("10. Eliminar créditos \n");

            switch(choice){
                case 1:
                    debito.montoD();
                    break;
                case 2:
                    credito.montoC();
                    break;
                case 3:
                    System.out.println("El total es "+debito.totalD());
                    break;
                case 4:
                    System.out.println("El promedio es "+debito.calculoPromedio());
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("El total es: "+credito.totalC());
                    break;
                case 7:
                    System.out.println("El saldo es "+saldo.calculoSaldo());
                    break;
                case 8:
                    System.out.println("El total de operaciones es: "+(credito.contadorc+debito.contadord));
                    break;
                case 9:
                        System.out.println(Arrays.toString(credito.creditosarr));
                        System.out.println(Arrays.toString(debito.debitosarr));
                    break;
                case 10:
                    credito.eliminarC(3);
                    credito.eliminarC(5);
                    credito.eliminarC(7);
                    System.out.println("Nuevamente total de débitos "+ debito.totalD());
                    System.out.println("Nuevamente total de créditos "+credito.totalC());
                    System.out.println("Nuevamente calculo de saldo "+ saldo.calculoSaldo());
                    System.out.println("Nuevamente promedio: "+debito.calculoPromedio());
                    System.out.println("Nuevamente conteo de operaciones "+(credito.contadorc+debito.contadord));
                    break;
            }
        }while(choice != 11);








    }
}
