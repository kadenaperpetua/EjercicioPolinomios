package com.eli.polinomios;

public class Polinomio {

    private double[] coeficientes;

    public Polinomio(double[] coeficientes) {
        this.coeficientes = coeficientes;
    }

    public Polinomio sumarPolinomios(Polinomio sumador) {
        int coeficientesSumando = this.coeficientes.length;
        int coeficientesSumador = sumador.coeficientes.length;
        int coeficientesSuma = Math.max(coeficientesSumando, coeficientesSumador);
        Polinomio suma = new Polinomio(new double[coeficientesSuma]);

        for (int i = 1; i <= coeficientesSuma; i++) {
            if (coeficientesSumando - i < 0) {
                suma.coeficientes[coeficientesSuma - i] += sumador.coeficientes[coeficientesSumador - i];
            } else if (coeficientesSumador - i < 0) {
                suma.coeficientes[coeficientesSuma - i] += this.coeficientes[coeficientesSumando - i];
            } else {
                suma.coeficientes[coeficientesSuma - i] = this.coeficientes[coeficientesSumando - i] + sumador.coeficientes[coeficientesSumador - i];
            }
        }
        return suma;
    }

    public Polinomio derivarPolinomio() {


        int coeficientesPolinomio = this.coeficientes.length;
        if (coeficientesPolinomio > 1) {
            int coeficientesDerivada = coeficientesPolinomio - 1;
            Polinomio derivada = new Polinomio(new double[coeficientesDerivada]);
            for (int i = 1; i < coeficientesPolinomio; i++) {
                derivada.coeficientes[coeficientesDerivada - i] = this.coeficientes[coeficientesPolinomio - i - 1] * i;
            }
            return derivada;
        } else {
            return new Polinomio(new double[1]);
        }
    }


    public Polinomio multiplicarCoeficienteNumerico(double multiplicador) {
        for (int i = 0; i < coeficientes.length; i++) {
            this.coeficientes[i] *= multiplicador;
        }
        visualizarPolinomio();
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


