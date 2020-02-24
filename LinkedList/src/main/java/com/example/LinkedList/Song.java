package com.example.LinkedList;

public class Song {
    String nombre;
    int posicion;

    Song next;
    Song previous;


    Song(String nombre, int posicion){
        this.nombre = nombre;
        this.posicion = posicion;
    }
}
