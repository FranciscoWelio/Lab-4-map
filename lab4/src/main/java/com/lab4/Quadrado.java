package com.lab4;

public class Quadrado {
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
    public double areaQuadrado(double lado){
        double area;
        area = lado *2;
        return area;
    }
    public double periQuadrado(double lado){
        double peri;
        peri = lado *4;
        return peri;
    }
   
}
