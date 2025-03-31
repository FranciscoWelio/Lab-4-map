package com.lab4;


public class BrincandoComAsFigurasGeometricas {
	static Retangulo retangulo = new Retangulo(0, 50);
	static Circulo circulo = new Circulo(6);
	static Quadrado quadrado = new Quadrado(10);
	public static void main(String[] args) {

		System.out.println(p("Retangulo"));
		System.out.println(p("Quadrado"));
		System.out.println(p("Circulo"));
		System.out.println(p("Todas"));
		System.out.println(p("Esfera"));

		System.out.println(a("Retangulo"));
		System.out.println(a("Quadrado"));
		System.out.println(a("Circulo"));
		System.out.println(a("Todas"));
		System.out.println(a("Pentagono"));
		

		System.out.println(toStringDaFigura("Retangulo"));
		System.out.println(toStringDaFigura("Quadrado"));
		System.out.println(toStringDaFigura("Circulo"));
		System.out.println(toStringDaFigura("Todas"));
		System.out.println(toStringDaFigura("Esfera"));
	}
	public static String a(String tipoDaFigura) {
		try {
			if (tipoDaFigura == null || tipoDaFigura.equals("")) {
				throw new IllegalArgumentException("Tipo de figura não pode ser nulo ou vazio.");
			}

			if (tipoDaFigura.equals("Retangulo")) {
				return "Área do retângulo: " + retangulo.area();
			} else if (tipoDaFigura.equals("Quadrado")) {
				return "Área do quadrado: " + quadrado.area();
			} else if (tipoDaFigura.equals("Circulo")) {
				return "Área do círculo: " + circulo.area();
			} else if (tipoDaFigura.equals("Todas")) {
				return "Área do retângulo: " + retangulo.area() + "\n" +
					"Área do quadrado: " + quadrado.area() + "\n" +
					"Área do círculo: " + circulo.area();
			} else {
				throw new IllegalArgumentException("Tipo de figura '" + tipoDaFigura + "' não existente.");
			}
		} catch (IllegalArgumentException e) {
			return "Erro: " + e.getMessage();
		} catch (Exception e) {
			return "Erro inesperado: " + e.getMessage();
		}
		
	}

	public static String p(String tipoDaFigura) {
		try {
			if (tipoDaFigura == null || tipoDaFigura.equals("")) {
				throw new IllegalArgumentException("Tipo de figura não pode ser nulo ou vazio.");
			}

			if (tipoDaFigura.equals("Retangulo")) {
				return "O perímetro do retângulo é: " + retangulo.perimetro();
			} else if (tipoDaFigura.equals("Quadrado")) {
				return "O perímetro do quadrado é: " + quadrado.perimetro();
			} else if (tipoDaFigura.equals("Circulo")) {
				return "O perímetro do círculo é: " + circulo.perimetro();
			} else if (tipoDaFigura.equals("Todas")) {
				return "O perímetro do retângulo é: " + retangulo.perimetro() + "\n" +
					"O perímetro do quadrado é: " + quadrado.perimetro() + "\n" +
					"O perímetro do círculo é: " + circulo.perimetro();
			} else {
				throw new IllegalArgumentException("Figura '" + tipoDaFigura + "' inexistente.");
			}
		} catch (IllegalArgumentException e) {
			return "Erro: " + e.getMessage();
		} catch (Exception e) {
			return "Erro inesperado: " + e.getMessage();
		}
	}

	public static String toStringDaFigura(String tipoDaFigura) {
		try {
			if (tipoDaFigura == null || tipoDaFigura.equals("")) {
				throw new IllegalArgumentException("Tipo de figura não pode ser nulo ou vazio.");
			}

			if (tipoDaFigura.equals("Retangulo")) {
				return retangulo.formaToString();
			} else if (tipoDaFigura.equals("Quadrado")) {
				return quadrado.formaToString();
			} else if (tipoDaFigura.equals("Circulo")) {
				return circulo.formaToString();
			} else if (tipoDaFigura.equals("Todas")) {
				return retangulo.formaToString() + "\n" +
						quadrado.formaToString() + "\n" +
						circulo.formaToString();
			} else {
				throw new IllegalArgumentException("Figura '" + tipoDaFigura + "' inexistente.");
			}
		} catch (IllegalArgumentException e) {
			return "Erro: " + e.getMessage();
		} catch (Exception e) {
			return "Erro inesperado: " + e.getMessage();
		}
	}

}
