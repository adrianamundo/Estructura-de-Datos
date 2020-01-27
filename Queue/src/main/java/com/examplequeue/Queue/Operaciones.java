package com.examplequeue.Queue;

import java.util.Queue;


public class Operaciones{
    int tamaño;
    int array[];
    int frente;
    int capacidad;
    int cola;


    public Operaciones(int capacidad ){
        this.capacidad = capacidad;
        frente = this.tamaño = 0;
        cola = capacidad-1;
        array = new int[this.capacidad];
    }
    //cuando esta vacio
    public boolean Vacio(){
        if (tamaño == 0){
            return true;
        }
        return false;
    }

    //cuando esta lleno
    public boolean Lleno(){
        if (tamaño == capacidad){
            return true;
        }
        return false;
    }

    //enqueue
    public void enqueue(int acola) {
        if (Lleno()) {
            System.out.println("Espacios llenos, no se puede agregar.");
        } else {
            cola = cola++;
            if (cola == capacidad-1) {
                cola = 0;
            }
            array[cola] = acola;
            tamaño = tamaño++;
            System.out.println(acola + "se ha agregado a la lista");
        }
    }

    //dequeue
    public void dequeue(){
        if(Vacio()){
            System.out.println("Espacios vacíos, no se puede eliminar/retirar.");
        }
        else{
            int noencola = this.array[this.frente];
            this.frente = this.frente+1;
            this.tamaño = this.tamaño-1;
        }
    }

    //base:https://www.geeksforgeeks.org/queue-set-1introduction-and-array-implementation/







}
