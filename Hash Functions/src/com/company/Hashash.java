package com.company;

public class Hashash {
    int dato;
    boolean ocupado = false;

    public  int function(int k, int mod){
        int key = 0;
        if(k < 0){
            k =k*-1;
        }else{
            k=k;
        }

        key = k % mod;//funcion de hash

        return key;
    }

    public void insertar2(Hashash[] h, int mod, int k){
        int operar = function(k, mod);
        do{
            if(h[operar].ocupado= false){
                h[operar].dato =k;
                h[operar].ocupado=true;
            } else{
                operar++;
            }
        }while(operar < mod);

    }
}
