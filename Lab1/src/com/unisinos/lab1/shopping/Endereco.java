package com.unisinos.lab1.shopping;

public class Endereco {
	public String nomeDaRua;
	public String cidade;
	public String estado;
	public String pais;
	public String cep;
	public String numero;
	public String complemento;

	public Endereco(String nomeDaRua, String cidade, String estado, String pais, String cep, String numero,	String complemento) {
		this.nomeDaRua = nomeDaRua;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
	}

	
	public String getNomeDaRua() {
		return nomeDaRua;
	}

	public void setNomeDaRua(String nomeDaRua) {
		this.nomeDaRua = nomeDaRua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String toString(){
        return "Nome da Rua: " + this.getNomeDaRua() + "Cidade: " + this.getCidade() + "Estado: " + this.getEstado() + "País: " + this.getPais() + "CEP: " + this.getCep() + "Número: " + this.getNumero() + "Complemento: " + this.getComplemento();
    }
	

	   
}
