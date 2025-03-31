package com.lab4;

import java.text.DecimalFormat;

public class Retangulo implements MetodosComuns {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public String area() {
        double area;
        area = altura * largura;
        DecimalFormat df = new DecimalFormat("#.#");
        return df.format(area);
    }

    @Override
    public String perimetro() {
        double peri;
        peri = (2* altura) + (2* largura);
        DecimalFormat df = new DecimalFormat("#.#");
        return df.format(peri);
    }

    @Override
    public String formaToString() {
        return "A altura do retângulo é: " + getAltura() + " E a largura é: " + getLargura();
    }

}
