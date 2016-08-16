package com.eli.polinomios;

public class Main {

    public static void main(String[] args) {

        double[] entrada ={0,1,2,3};
        Polinomio eli = new Polinomio(entrada);
        eli.visualizarPolinomio();
        System.out.println(eli.evaluarPolinomio(1));

        eli.multiplicarCoeficienteNumerico(5);
    }
}
