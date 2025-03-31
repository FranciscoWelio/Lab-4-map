package com.lab4;

import java.text.DecimalFormat;

public class Circulo implements MetodosComuns{
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

    @Override
    public String area() {
        double area;
        area = 2 *3.14* getRaio();
        DecimalFormat df = new DecimalFormat("#.###");
        return df.format(area);

    }

    @Override
    public String perimetro() {
        double peri;
        peri = 3.14 * raio;
        DecimalFormat df = new DecimalFormat("#.###");
        return df.format(peri);

    }

    @Override
    public String formaToString() {
        return "O círculo tem raio de: " + getRaio();
    }

}
