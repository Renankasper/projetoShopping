package com.unisinos.lab1.shopping;

public class Informatica extends Loja {
	
	private double seguroEletronicos;

	public Informatica(String nome, int quantidadeFuncionario, double salarioBaseFuncionario, Endereco endereco, Data data) {
		super(nome, quantidadeFuncionario, salarioBaseFuncionario, endereco, data);
		
	}

	public double getSeguroEletronicos() {
		return seguroEletronicos;
	}

	public void setSeguroEletronicos(double seguroEletronicos) {
		this.seguroEletronicos = seguroEletronicos;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Seguro dos Apralhos Eletrônicos: " + getSeguroEletronicos();
	}

}
