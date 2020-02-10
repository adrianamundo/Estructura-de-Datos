package com.example.Strings;

public class Palindrome {

     /*String originalword = "hola que tal sos";
        StringBuilder sb= new StringBuilder(originalword);

        String reversedword = new String(sb.reverse());
        System.out.println("Original "+originalword);
        System.out.println("Reverso "+reversedword);

        if(originalword.toLowerCase().equals(reversedword)){
            System.out.println("Palabra es palindrome ");
        }
        else{
            System.out.println("Palabra no es palindrome");
        }*/


    public boolean esPalindrome(String palabras){
        int num = palabras.length();
        for (int i = 0; i<(num/2); i++){
            if(palabras.charAt(i) != palabras.charAt(num-i-1)){
                return true;
            }
        }
        return false;
    }

    //base: https://www.geeksforgeeks.org/palindrome-pair-in-an-array-of-words-or-strings/

    public void printP(String []CSV){
        //ir contando cada palabra del arreglo de palabras de CSV
        for (int a=0; a<CSV.length;a++){
            if(!esPalindrome(CSV[a])){
                System.out.println(CSV[a]+"\n");
            }
        }
    }



}
