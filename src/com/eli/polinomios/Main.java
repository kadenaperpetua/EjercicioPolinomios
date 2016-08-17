package com.eli.polinomios;

public class Main {

    public static void main(String[] args) {

        double[] tresCoeficientes ={4,4,7,5};
        double[] cincoCoeficientes ={2,0,-2,1,1};
        double[] cero = {0};


        Polinomio tercerGrado = new Polinomio(tresCoeficientes);
        Polinomio quintoGrado = new Polinomio(cincoCoeficientes);
        Polinomio gradoCero =  new Polinomio(cero);

        tercerGrado.visualizarPolinomio();
        quintoGrado.visualizarPolinomio();
        gradoCero.visualizarPolinomio();
        System.out.println();

        Polinomio suma;
        suma = tercerGrado.sumarPolinomios(quintoGrado);
        suma.visualizarPolinomio();
        System.out.println();

        Polinomio derivada = tercerGrado.derivarPolinomio();
        derivada.visualizarPolinomio();

        Polinomio derivadaCero = gradoCero.derivarPolinomio();
        derivadaCero.visualizarPolinomio();


    }
}
