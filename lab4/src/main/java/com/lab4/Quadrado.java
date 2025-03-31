package com.lab4;

import java.text.DecimalFormat;

public class Quadrado implements MetodosComuns {
    private double lado;

    public Quadrado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("O lado do quadrado deve ser positivo.");
        }
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("O lado do quadrado deve ser positivo.");
        }
        this.lado = lado;
    }
    @Override
    public String area() {
        double area;
        if (getLado() <= 0) {
            throw new IllegalArgumentException("O lado do quadrado deve ser positivo.");
        }
        area = getLado() *getLado();
        DecimalFormat df = new DecimalFormat("#.###");
        return df.format(area);
    }

    @Override
    public String perimetro() {
        double peri;
        if (getLado() <= 0) {
            throw new IllegalArgumentException("O lado do quadrado deve ser positivo.");
        }
        peri = getLado() *4;
        DecimalFormat df = new DecimalFormat("#.###");
        return df.format(peri);
    }

    @Override
    public String formaToString() {
        if (getLado() <= 0) {
            throw new IllegalArgumentException("O lado do quadrado deve ser positivo.");
        }
        return "O tamanho dos lados do quadrado é: " + getLado();
    }
   
}
