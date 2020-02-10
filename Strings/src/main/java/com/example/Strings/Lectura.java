package com.example.Strings;

import java.io.BufferedReader;
import java.io.FileReader;

public class Lectura {
    String [] separatedCSV;

    /*public String leer(String Texto){

        String text="";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(Texto));
            String save = "";
            separatedCSV = new String[100];
            while((separatedCSV[100] = bf.readLine())!= null){
                save = save + separatedCSV[100];
                System.out.println(save);
            }
            text=save;

        }catch (Exception e){
            System.out.println("No se encontro el archivo");
        }
        return text;
    }*/


    public void csvLista(){
        separatedCSV =new String[100];
    }

    public void separarCSV(String CSV){
        separatedCSV=CSV.split(",");
    }

}
