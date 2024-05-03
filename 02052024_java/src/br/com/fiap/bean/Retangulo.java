package br.com.fiap.bean;

public class Retangulo extends Quadrado {
	
	//atributo
	private float altura;
	//construtor vazio
	public Retangulo() {}
	//construtor com passagem de parametro
	public Retangulo(float lado, float altura) {
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
		return super.getLado() * altura;
	}
}
