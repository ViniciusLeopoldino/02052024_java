package br.com.fiap.bean;

public class VigiaNoturno extends Funcionario {

	//atributo
	private float adicionalNoturno;
	//construtor vazio
	public VigiaNoturno() {}
	//construtor com passagem de parametro
	public VigiaNoturno(float valorHoraTrabalho, float adicionalNoturno) {
		super.setValorHoraTrabalho(valorHoraTrabalho);
		this.adicionalNoturno = adicionalNoturno;
	}
	//getters e setters
	public float getAdicionalNoturno() {
		return adicionalNoturno;
	}
	public void setAdicionalNoturno(float adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}
	//metodo da classe
	public float calculaSalario() {
		return super.getValorHoraTrabalho() * 40 * 4 + adicionalNoturno;
	}
	
}
