package com.lab4;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double areaCirculo(double raio){
        double area;
        area = 2 *3.14* raio;
        return area;
    }
    public double periCiruclo(double raio){
        double peri;
        peri = 3.14 * raio;
        return peri;
    }

}
