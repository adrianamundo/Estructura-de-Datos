package com.examplequeue.Queue;

public class OperacionesDeBanco {
    int balance;
    //crear balance por cuentas
    OperacionesDeBanco(int freshBalance){
        balance = freshBalance;
    }

    //depositar a cuenta
    public void depositar(int dinero){
        balance = balance + dinero;
    }

    //sacar de la cuenta
    public boolean retiro(int dinero){
        if (balance < dinero){
            System.out.println("No hay suficiente dinero para sacar de la cuenta.");
            return false;
        }
        else{
            balance = balance-dinero;
            return true;
        }
    }

}
