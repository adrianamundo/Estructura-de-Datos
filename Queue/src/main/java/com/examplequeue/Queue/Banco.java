package com.examplequeue.Queue;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args){
        Operaciones q = new Operaciones(100);
        OperacionesDeBanco dinero = new OperacionesDeBanco(1000000);


        int choice = 0;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);

        do {
            System.out.println("Elija entre las siguientes opciones:\n");
            System.out.println("1.Dejar que se agregue a la fila.\n");
            System.out.println("2. No hay espacio existente en la fila.\n");
            System.out.println("3.Salir del sistema.\n");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Espacio disponible para agregar transacción.\n");
                    System.out.println("Ingrese número de ticket para ingresar a la fila:\n");
                    int datos = input2.nextInt();
                    q.enqueue(datos);

                    //Transacciones propias de un banco
                    System.out.println("Elija la opción deseada por el cliente con número de ticket: "+datos+".\n");
                    System.out.println("1.Depósitos");
                    System.out.println("2.Retiros");
                    int opcion = input3.nextInt();
                    if(opcion==1){
                        System.out.println("Ingrese cantidad de dinero a depositar:\n");
                        int dineros = input4.nextInt();
                        dinero.depositar(dineros);
                    }
                    else if(opcion==2) {
                    System.out.println("Ingrese cantidad que desea retirar");
                    int retiros=input4.nextInt();
                             dinero.retiro(retiros);
                    }

                    break;

                case 2:
                    q.dequeue();
            }

        } while (choice != 3) ;


    }
}
