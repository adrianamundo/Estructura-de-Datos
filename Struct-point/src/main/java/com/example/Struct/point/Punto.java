package com.example.Struct.point;

import java.util.Scanner;

public class Punto {

    int coordenadasx;
    int coordenadasy;
    public int getCoordenadasx(){
        return coordenadasx;
    }

    public void setCoordenadasx(int coordenadasx){
        this.coordenadasx = coordenadasx;
    }


    public int getCoordenadasy(){
        return coordenadasy;
    }
    public void setCoordenadasy(int coordenadasy){
        this.coordenadasy=coordenadasy;
    }

    /*public void Establecer(){
        Scanner input = new Scanner(System.in);
        coordenadasx = input.nextInt();
        coordenadasy = input.nextInt();

    }

    public void Imprimircoord(){
        System.out.println("Coordenadas del punto son: "+coordenadasx+" en x y "+coordenadasy+" en y.\n");
    }*/

}
