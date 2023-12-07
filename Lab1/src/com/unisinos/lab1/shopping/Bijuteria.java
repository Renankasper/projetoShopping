package com.unisinos.lab1.shopping;

public class Bijuteria extends Loja {
	
	private double metaVendas;

	public Bijuteria(String nome, int quantidadeFuncionario, double salarioBaseFuncionario, Endereco endereco, Data data) {
		super(nome, quantidadeFuncionario, salarioBaseFuncionario, endereco, data);
		
	}

	public double getMetaVendas() {
		return metaVendas;
	}

	public void setMetaVendas(double metaVendas) {
		this.metaVendas = metaVendas;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Vendas Mensais: " + getMetaVendas();
	}

}
