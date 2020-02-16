package com.example.Struct.point;

public class Quadrant {

   int determinarQuadrant() {
        Punto punto = new Punto();
        if (punto.coordenadasx > 0 && punto.coordenadasy > 0) {
            return 1;
        } else if (punto.coordenadasx < 0 && punto.coordenadasy > 0) {
            return 2;
        } else if (punto.coordenadasx < 0 && punto.coordenadasy < 0) {
            return 3;
        } else if (punto.coordenadasx > 0 && punto.coordenadasy < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public void imprimirQuadrante(){
        Punto punto = new Punto();
        System.out.println("El punto está en x: "+punto.coordenadasx+" y en y: "+punto.coordenadasy+ " en el cuadrante "+determinarQuadrant());
    }
}
