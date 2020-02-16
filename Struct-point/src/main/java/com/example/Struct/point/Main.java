package com.example.Struct.point;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Punto punto = new Punto();
        //Quadrant quadrante = new Quadrant();

        Scanner input = new Scanner(System.in);
        System.out.println("Por favor ingrese punto x y luego el y\n");
        punto.coordenadasx = input.nextInt();
        punto.setCoordenadasx(punto.coordenadasx);
        punto.coordenadasy = input.nextInt();
        punto.setCoordenadasy(punto.coordenadasy);
        System.out.println("Punto en x: " + punto.coordenadasx + " y en y: " + punto.coordenadasy);

        System.out.println("A continuación se presentará el cuadrante: \n ");

        if (punto.coordenadasx > 0 && punto.coordenadasy > 0) {
            System.out.println("Primer cuadrante");
        } else if (punto.coordenadasx < 0 && punto.coordenadasy > 0) {
            System.out.println("Segundo cuadrante");
        } else if (punto.coordenadasx < 0 && punto.coordenadasy < 0) {
            System.out.println("Tercer cuadrante");
        } else if (punto.coordenadasx > 0 && punto.coordenadasy < 0) {
            System.out.println("Cuarto cuadrante");
        } else {
            System.out.println("No se encontró en ningún cuadrante");
        }

    }
}

