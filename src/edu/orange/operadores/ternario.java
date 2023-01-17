package edu.orange.operadores;

public class ternario {
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 7;

        /*   if (a==b){
            String resultado = "verdadeiro";
            System.out.println(resultado);
        } else{
            String resultado = "Falso";
            System.out.println(resultado);
        }*/
      
        String resultado = a==b ? "verdadeiro":"falso"; // expressão tem que ser boleana sempre
        System.out.println(resultado);
    }
}
