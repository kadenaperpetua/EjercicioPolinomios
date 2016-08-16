package com.eli.polinomios;

public class Main {

    public static void main(String[] args) {

        double[] entradaEli ={0,1,2,3};
        double[] entradaLuisa ={1,1,1,1,1};

        Polinomio eli = new Polinomio(entradaEli);
        Polinomio luisa = new Polinomio(entradaLuisa);
        eli.visualizarPolinomio();
        luisa.visualizarPolinomio();


        System.out.println();


        eli.sumarPolinomios(luisa);
        luisa.multiplicarCoeficienteNumerico(5);
        System.out.println(luisa.evaluarPolinomio(1));

    }
}
