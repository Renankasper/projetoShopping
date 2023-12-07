package com.unisinos.lab1.shopping;

public class Alimentacao extends Loja {

	private Data dataAlvara;

	public Alimentacao(String nome, int quantidadeFuncionario, double salarioBaseFuncionario, Endereco endereco,
			Data data) {
		super(nome, quantidadeFuncionario, salarioBaseFuncionario, endereco, data);

	}

	public Data getDataAlvara() {
		return dataAlvara;
	}

	public void setDataAlvara(Data dataAlvara) {
		this.dataAlvara = dataAlvara;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Data do Alvara: " + getDataAlvara();
	}

}
