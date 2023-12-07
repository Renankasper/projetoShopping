package com.unisinos.lab1.shopping;

public class Shopping {

	public String nome;
	public Endereco endereco;
	public Loja loja;

	public Shopping(String nome, Endereco endereco, Loja loja) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.loja = loja;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}
	
	public boolean insereLoja(Loja loja) {
//		if()
		
		return false; // metodo errado
		
	}

	@Override
	public String toString() {
		return "Shopping [nome=" + nome + ", endereco=" + endereco + ", loja=" + loja + "]";
	}
}
