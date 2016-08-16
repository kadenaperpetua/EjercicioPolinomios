package com.eli.polinomios;

public class Polinomio {

    private double[] coeficientes;

    public Polinomio(double[] coeficientes) {
        this.coeficientes = coeficientes;
    }

    public Polinomio sumarPolinomios(Polinomio sumador) {
        return sumador;
    }

    /*
    public Polinomio multiplicarCoeficienteNumerico(double multiplicador) {
        for (double coeficiente : coeficientes) {
            coeficiente *= multiplicador ;
        }
        this.visualizarPolinomio();
        return this;
    }*/

    public Polinomio multiplicarCoeficienteNumerico(double multiplicador) {
        for (int i = 0; i < coeficientes.length; i++) {
            this.coeficientes[i] *= multiplicador;
        }
        this.visualizarPolinomio();
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


