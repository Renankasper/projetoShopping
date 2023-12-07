package com.unisinos.lab1.shopping;

public class Data {
	public int dia;
	public int mes;
	public int ano;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		if(!isDataCorreta()) {
			dataPadrao();
			System.out.println("Data não confere, foi ajustada para: " + this.toString());
		}
	}

	public void dataPadrao() {
		setDia(1);
		setMes(1);
		setAno(2000);
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String toString() {
		return getDia() + "/" + getMes() + "/" + getAno();
	}
	
	public boolean verificaAnoBissexto() {
	    return (getAno() % 4 == 0) && (getAno() % 100 != 0 || getAno() % 400 == 0);
	}
	
	private boolean isDataCorreta() {
		if(verificaAnoBissexto()) {
			if(getMes() == 2 && (getDia() < 30 )) {
				return true;
			}
		}else if(getMes() == 2 && (getDia() < 29)) {
			return true;
		}
		return false;
	}
}
