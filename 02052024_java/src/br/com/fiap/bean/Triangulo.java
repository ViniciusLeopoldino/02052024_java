package br.com.fiap.bean;

public class Triangulo extends Quadrado {

	//atributos
	private float altura;
	//construtor vazio
	public Triangulo() {}
	//construtor com passagem de parametros
	public Triangulo(float lado, float altura) {
		super.setLado(lado);
		this.altura = altura;
	}
	//getters e setters
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	//metodo da classe
	public float calcularArea() {
		return super.getLado() * altura / 2;
	}
	
	
}
