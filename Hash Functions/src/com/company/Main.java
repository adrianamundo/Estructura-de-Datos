package com.company;

public class Main {

    public static void main(String[] args) {

        Table table_hash = new Table();
        Hashash h= new Hashash();




        for(Integer i =-50; i <= 50; i++){
            table_hash.llenar(i%20,i);
        }
    }
}
