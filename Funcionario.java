package br.com.fiap.bean;

public class Funcionario {
	
	//atributo
	private String nome;
	private float valorHoraTrabalho;
	//construtor vazio
	public Funcionario() {}
	//construtor com passagem de parametro
	public Funcionario(String nome, float valorHoraTrabalho) {
		this.nome = nome;
		this.valorHoraTrabalho = valorHoraTrabalho;
	}
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValorHoraTrabalho() {
		return valorHoraTrabalho;
	}
	public void setValorHoraTrabalho(float valorHoraTrabalho) {
		this.valorHoraTrabalho = valorHoraTrabalho;
	}
	//metodo da classe
	public float calculaSalario() {
		return ((valorHoraTrabalho * 40) * 4);
	}
}
