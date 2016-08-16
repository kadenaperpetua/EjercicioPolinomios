package com.eli.polinomios;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Polinomio {

    private double[] coeficientes;

    public Polinomio(double[] coeficientes) {
        this.coeficientes = coeficientes;
    }

    public Polinomio sumarPolinomios(Polinomio sumador) {
        return sumador;
    }

    public Polinomio multiplicarCoeficiente(double coeficiente) {
        return this;
    }

    public Polinomio derivarPolinomio() {
        return this;
    }

    public double evaluarPolinomio(double valorDeX) {
        double valorNumerico = 0;
        for (double coeficiente : coeficientes) {
            valorNumerico += coeficiente * valorDeX;
        }
        return valorNumerico;
    }

    public void visualizarPolinomio() {

        System.out.print("P(x) = ");
        for (int i = 0; i < coeficientes.length - 1; i++) {
            int indice = coeficientes.length - i - 1;
            if (coeficientes[i] != 0) {
                System.out.print(coeficientes[i] + " x^" + indice + " + ");
            }
        }
        System.out.print(coeficientes[(coeficientes.length - 1)]);
        System.out.println();
    }
}


