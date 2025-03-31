package com.lab4;


public class FigurasGeometricas {
		Retangulo retangulo = new Retangulo(10, 50);
		Circulo circulo = new Circulo(5.6);
		Quadrado quadrado = new Quadrado(32.1);


	public String a(String tipoDaFigura){
		if(tipoDaFigura == "Retangulo"){
			return "Área do retangulo: "+retangulo.areaRetangulo(retangulo.getAltura(), retangulo.getLargura());
		}else if (tipoDaFigura == "Quadrado") {
			return "Área do quadrado: "+circulo.areaCirculo(circulo.getRaio());
		}else if (tipoDaFigura == "Circulo"){

			return "Área do círculo: "+circulo.areaCirculo(circulo.getRaio());
		}else if(tipoDaFigura == "Todas"){
			return "Área do retangulo: "+retangulo.areaRetangulo(retangulo.getAltura(), retangulo.getLargura()) +"\n"+
			"Área do quadrado: "+quadrado.areaQuadrado(quadrado.getLado()) + "\n"+
			"Área do circulo: "+circulo.areaCirculo(circulo.getRaio());
		}else{
			return "Tipo não existente";
		}
		
	}

	public String p(String tipoDaFigura){

		if (tipoDaFigura == "Retangulo"){
			return "O perímetro do retangulo é: " + retangulo.periRetangulo(retangulo.getAltura(), retangulo.getLargura());
		}else if (tipoDaFigura == "Quadrado"){
			return "O perímetro do quadrado é: " + quadrado.periQuadrado(quadrado.getLado());
		}else if (tipoDaFigura == "Circulo"){
			return "O perímetro do círculo é: " + circulo.periCiruclo(circulo.getRaio());
		}else if (tipoDaFigura == "Todas"){
			return "O perímetro do retangulo é: " + retangulo.periRetangulo(retangulo.getAltura(), retangulo.getLargura())+ "\n"+
			"O perímetro do quadrado é: " + quadrado.periQuadrado(quadrado.getLado()) +"\n"+
			"O perímetro do círculo é: " + circulo.periCiruclo(circulo.getRaio());
		}else{
			return "Figura inexistente";
		}
		
	}
	
	public String toStringDaFigura(String tipoDaFigura){
		if (tipoDaFigura == "Retangulo"){
			return "A altura do retangulo é: " + retangulo.getAltura() + " E a largura é: "+retangulo.getLargura();
		}else if (tipoDaFigura == "Quadrado"){
			return "O tamanho dos quadrado é: " + quadrado.getLado();
		}else if (tipoDaFigura == "Circulo"){
			return "O círculo tem raio de: " + circulo.getRaio();
		}else if (tipoDaFigura == "Todas"){
			return "A altura do retangulo é: " + retangulo.getAltura() + " E a largura é: "+retangulo.getLargura() +"\n"+
			"O tamanho dos quadrado é: " + quadrado.getLado() +"\n"+
			"O círculo tem raio de: " + circulo.getRaio();
		}else{
			return "Figura inexistente";
		}
	}
}

