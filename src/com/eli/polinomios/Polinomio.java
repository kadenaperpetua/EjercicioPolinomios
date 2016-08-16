package com.eli.polinomios;

public class Polinomio {

    private double[] coeficientes;

    public Polinomio(double[] coeficientes){
        this.coeficientes=coeficientes;
    }

    public Polinomio sumarPolinomios(Polinomio sumador){
        return sumador;
    }

    public Polinomio multiplicarCoeficiente(double coeficiente){
        return this;
    }

    public Polinomio derivarPolinomio(){
        return this;
    }

    public double evaluarPolinomio(){
        return 0.0;
    }

    public void visualizarPolinomio(){

    }

}
