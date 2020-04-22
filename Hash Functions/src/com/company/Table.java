package com.company;

public class Table {
    private final Integer size = 20;
    Value[] tabla_hash;

    Table(){
        tabla_hash = new Value[size];
        for(int i =0; i <size; i++){
            tabla_hash[i]= null;
        }

    }

    public void llenar(int key, int value) {
        if(value>0){
            int hash = (key % size);
            while (tabla_hash[hash] != null && tabla_hash[hash].getkey() != key)
                hash = (hash) % size;
            tabla_hash[hash] = new Value(key, value);
            System.out.println(tabla_hash[hash].k+"=="+tabla_hash[hash].key);
        }else {
            key = (key*-1);
            int hash = (key % size);
            while (tabla_hash[hash] != null && tabla_hash[hash].getkey() != key)
                hash = (hash) % size;
            tabla_hash[hash] = new Value(key, value);
            System.out.println(tabla_hash[hash].k+ "=="+key);

        }
    }

    public Integer hash (Integer k){
        Integer key =0;
        if(k < 0){
            k =k*-1;
        }else{
            k=k;
        }

        key = k % size;//funcion de hash

        return key;
    }



}
