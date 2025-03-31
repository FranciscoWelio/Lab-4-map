package com.lab4;

import java.text.DecimalFormat;

public class Retangulo implements MetodosComuns {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        if (altura <= 0 || largura <= 0) {
            throw new IllegalArgumentException("A altura e a largura do retângulo devem ser positivas.");
        }
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("A altura do retângulo deve ser positiva.");
        }
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura <= 0) {
            throw new IllegalArgumentException("A largura do retângulo deve ser positiva.");
        }
        this.largura = largura;
    }

    @Override
    public String area() {
        double area;
        if (getAltura() <= 0 || getLargura() <= 0) {
            throw new IllegalArgumentException("A altura e a largura devem ser positivas.");
        }
        area = altura * largura;
        DecimalFormat df = new DecimalFormat("#.#");
        return df.format(area);
    }

    @Override
    public String perimetro() {
        double peri;
        if (getAltura() <= 0 || getLargura() <= 0) {
            throw new IllegalArgumentException("A altura e a largura devem ser positivas.");
        }
        peri = (2* altura) + (2* largura);
        DecimalFormat df = new DecimalFormat("#.#");
        return df.format(peri);
    }

    @Override
    public String formaToString() {
        if (getAltura() <= 0 || getLargura() <= 0) {
            throw new IllegalArgumentException("A altura e a largura devem ser positivas.");
        }
        return "A altura do retângulo é: " + getAltura() + " E a largura é: " + getLargura();
    }

}
