package com.lab4;

public class Retangulo {
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

    public double areaRetangulo(double altura, double largura){
        double area;
        area = altura * largura;
        return area;
    }
    public double periRetangulo(double altura, double largura){
        double peri;
        peri = (2* altura) + (2* largura);
        return peri;
    }

}
