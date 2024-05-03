package br.com.fiap.bean;

public class Quadrado {

	//atributo
	private float lado;
	//construtor vazio
	public Quadrado() {}
	//construtor com passagem de parametro
	public Quadrado(float lado) {
		this.lado = lado;
	}
	//getters e setter
	public float getLado() {
		return lado;
	}
	public void setLado(float lado) {
		this.lado = lado;
	}
	//metodo da classe
	public float calcularArea() {
		return lado * lado;
	}
}
