package com.lab4;

import java.text.DecimalFormat;

public class Circulo implements MetodosComuns{
    private double raio;

    public Circulo(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio do círculo deve ser positivo.");
        }
        this.raio = raio;
    }

    public double getRaio() {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio do círculo deve ser positivo.");
        }
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String area() {
        double area;
        if (getRaio() <= 0) {
            throw new IllegalArgumentException("O raio do círculo deve ser positivo.");
        }
        area = 2 *3.14* getRaio();
        DecimalFormat df = new DecimalFormat("#.###");
        return df.format(area);

    }

    @Override
    public String perimetro() {
        double peri;
        if (getRaio() <= 0) {
            throw new IllegalArgumentException("O raio do círculo deve ser positivo.");
        }
        peri = 3.14 * getRaio();
        DecimalFormat df = new DecimalFormat("#.###");
        return df.format(peri);

    }

    @Override
    public String formaToString() {
        if (getRaio() <= 0) {
            throw new IllegalArgumentException("O raio do círculo deve ser positivo.");
        }
        return "O círculo tem raio de: " + getRaio();
    }

}
