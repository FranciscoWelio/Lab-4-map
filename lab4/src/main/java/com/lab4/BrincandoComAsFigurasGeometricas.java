package com.lab4;


public class BrincandoComAsFigurasGeometricas {

	public static void main(String[] args) {

		

		FigurasGeometricas fig = new FigurasGeometricas();
		
		System.out.println(fig.p("Retangulo"));
		System.out.println(fig.p("Quadrado"));
		System.out.println(fig.p("Circulo"));
		System.out.println(fig.p("Todas"));
		System.out.println(fig.p("Esfera"));

		System.out.println(fig.a("Retangulo"));
		System.out.println(fig.a("Quadrado"));
		System.out.println(fig.a("Circulo"));
		System.out.println(fig.a("Todas"));
		System.out.println(fig.a("Pentagono"));
		

		System.out.println(fig.toStringDaFigura("Retangulo"));
		System.out.println(fig.toStringDaFigura("Quadrado"));
		System.out.println(fig.toStringDaFigura("Circulo"));
		System.out.println(fig.toStringDaFigura("Todas"));
		System.out.println(fig.toStringDaFigura("Esfera"));
	}

}
