package com.unisinos.lab1.shopping;

public class Cosmetico extends Loja{

	private double taxaComercializacao;
		
	public Cosmetico(String nome, int quantidadeFuncionario, double salarioBaseFuncionario, Endereco endereco, Data data, Double taxaComercializacao) {
		super(nome, quantidadeFuncionario, salarioBaseFuncionario, endereco, data);
		this.taxaComercializacao = taxaComercializacao;
	}

	public double getTaxaComercializacao() {
		return taxaComercializacao;
	}

	public void setTaxaComercializacao(double taxaComercializacao) {
		this.taxaComercializacao = taxaComercializacao;
	}

	@Override
	public String toString() {
		return super.toString() + "\n Esta loja de costético tem taxa de: " +getTaxaComercializacao()+"%";
	}

	
}
