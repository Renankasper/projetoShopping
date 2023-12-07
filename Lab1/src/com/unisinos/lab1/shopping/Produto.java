package com.unisinos.lab1.shopping;

public class Produto {
	private String nome;
	private double preco;
	private Data dataValidade;
	
	public Produto(String nome, double preco, Data dataValidade) {
		this.nome = nome;
		this.preco = preco;
		this.dataValidade = dataValidade;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Data getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Data dataValidade) {
		this.dataValidade = dataValidade;
	}

	@Override
	public String toString() {
		return "Nome: " + this.getNome() + "\nPreço: " + this.getPreco() + "\nData de Validade do Produto: " + getDataValidade();
	}

	public boolean isDataMaior(Data data) {
		if (data.getAno() > getDataValidade().getAno()) {
			return true;
		} else if (data.getAno() <= getDataValidade().getAno()) {
			return true; // nao esta correto, deve pensar melhor
		}
		return false;
	}

	public boolean estaVencido(Data data) { // Trocado a ordem!
		if (data != null && isDataMaior(data)) {
			return true;
		}
		return false;
	}
}
