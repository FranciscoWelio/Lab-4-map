package com.lab4;

import java.text.DecimalFormat;

public class Quadrado implements MetodosComuns {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    @Override
    public String area() {
        double area;
        area = lado *lado;
        DecimalFormat df = new DecimalFormat("#.###");
        return df.format(area);
    }

    @Override
    public String perimetro() {
        double peri;
        peri = lado *4;
        DecimalFormat df = new DecimalFormat("#.###");
        return df.format(peri);
    }

    @Override
    public String formaToString() {
        return "O tamanho dos quadrado é: " + getLado();
    }
   
}
