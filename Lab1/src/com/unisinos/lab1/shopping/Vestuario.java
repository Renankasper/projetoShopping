package com.unisinos.lab1.shopping;

public class Vestuario extends Loja {
	
	private boolean produtosImportados;

	public Vestuario(String nome, int quantidadeFuncionario, double salarioBaseFuncionario, Endereco endereco, Data data) {
		super(nome, quantidadeFuncionario, salarioBaseFuncionario, endereco, data);
		
	}

	public boolean getProdutosImportados() {
		return produtosImportados;
	}

	public void setProdutosImportados(boolean produtosImportados) {
		this.produtosImportados = produtosImportados;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nLoja de Roupas Importadas? " + getProdutosImportados();
	}

}
