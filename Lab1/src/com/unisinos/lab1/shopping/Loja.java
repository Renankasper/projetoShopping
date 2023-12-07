package com.unisinos.lab1.shopping;

public class Loja {
	private String nome;
	private int quantidadeFuncionario;
	private double salarioBaseFuncionario;
	private Endereco endereco;
	private Data dataCriacao;
	private Produto[] estoqueProdutos;

	public Loja(String nome, int quantidadeFuncionario, double salarioBaseFuncionario, Endereco endereco,
			Data dataCriacao, int quantidadeMaximaEstoque) {
		super();
		this.nome = nome;
		this.quantidadeFuncionario = quantidadeFuncionario;
		this.salarioBaseFuncionario = salarioBaseFuncionario;
		this.endereco = endereco;
		this.dataCriacao = dataCriacao;
		setEstoqueProdutos(new Produto[quantidadeMaximaEstoque]);
	}

	public Loja(String nome, int quantidadeFuncionario) {
		this.nome = nome;
		this.quantidadeFuncionario = quantidadeFuncionario;
		this.salarioBaseFuncionario = -1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidadeFuncionario() {
		return quantidadeFuncionario;
	}

	public void setQuantidadeFuncionario(int quantidadeFuncionario) {
		this.quantidadeFuncionario = quantidadeFuncionario;
	}

	public double getSalarioBaseFuncionario() {
		return salarioBaseFuncionario;
	}

	public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
		this.salarioBaseFuncionario = salarioBaseFuncionario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Data getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Data data) {
		this.dataCriacao = data;
	}

	public Produto[] getEstoqueProdutos() {
		return estoqueProdutos;
	}
	
	public void setEstoqueProdutos(Produto[] estoqueProdutos) {
		this.estoqueProdutos = estoqueProdutos;
	}

	public double gastosComSalario() {
		if (getSalarioBaseFuncionario() > 0) {
			return getSalarioBaseFuncionario() * getQuantidadeFuncionario();
		} else {
			return -1;
		}
	}

	public char tamanhoLoja() {
		if (getQuantidadeFuncionario() > 10 && getQuantidadeFuncionario() < 30) {
			return 'M';
		}

		if (getQuantidadeFuncionario() > 31) {
			return 'G';

		} else {
			return 'P';

		}
	}
	
	public Produto[] imprimeProdutos() {
		return imprimeProdutos();
	}

	public void adicionaProduto(Produto produto) {
		int quantidadeMaxProduto = getEstoqueProdutos().length;
		int count = 0;

		if (count == 0) {
			getEstoqueProdutos()[0] = produto;
			count++;

		} else if (count > 0 && count < quantidadeMaxProduto) {
			getEstoqueProdutos()[count] = produto;
		}
	}

	@Override
	public String toString() {
		String dadosLojas = "Nome: " + getNome() + "\nQuantidade: " + getQuantidadeFuncionario() + "\nSalario: "
				+ getSalarioBaseFuncionario();
		String enderecoLoja = getEndereco().toString();
		String dataCriacao = "Data criacao loja:" + getDataCriacao().toString();
		return dadosLojas + "\n" + enderecoLoja + "\n" + dataCriacao;
	}

}
