package com.example.Bank;

public class Saldo {
Débitos debitos = new Débitos();
Créditos creditos = new Créditos();

public int calculoSaldo(){
    return ((creditos.totalC())-(debitos.totalD()));
}
}
