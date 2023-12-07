package com.unisinos.lab1.shopping;

import java.util.Scanner;

public class Principal {

	static Scanner input = new Scanner(System.in);
	static Loja[] lojas = new Loja[20];
	static Teclado teclado = new Teclado();

	public static void main(String[] args) {
		int opcao;
//		Loja[]= loja; 

		operacoes();
		Loja loja = new Loja("Renner", 5);

//		 lojas[0]= loja;

//		 loja.adicionaProduto(criarProduto());

//		 ver exemplo do link que vou te manda no whatsapp

		// do {
//			 System.out.println("------------------------------------------------------");
//				System.out.println("-------------Bem vindos-------------------------------");
//				System.out.println("------------------------------------------------------");
//				System.out.println("***** Selecione uma operação que deseja realizar *****");
//				System.out.println("------------------------------------------------------");
//				System.out.println("|   Opção 1 - Criar uma Loja   |");
//				System.out.println("|   Opção 2 - Criar um Produto |");
//				System.out.println("|   Opção 3 - Sair             |");
//
//				System.out.println("\nDigite a opção desejada:");
//				opcao = Teclado.leInt();
//			 
//		} while (opcao > 1 && opcao < 3); 
//		 
//		 operacoes();
//		

	}

	public static void operacoes() {

		System.out.println("------------------------------------------------------");
		System.out.println("-------------Bem vindos-------------------------------");
		System.out.println("------------------------------------------------------");
		System.out.println("***** Selecione uma operação que deseja realizar *****");
		System.out.println("------------------------------------------------------");
		System.out.println("|   Opção 1 - Criar uma Loja   |");
		System.out.println("|   Opção 2 - Criar um Produto |");
		System.out.println("|   Opção 3 - Sair             |");

		System.out.println("\nDigite a opção desejada:");

		int opcao = Teclado.leInt();

		switch (opcao) {
		case 1:
			// criar a loja e adicionar no array de loja la de cima

			criarLoja();
			break;

		case 2:
//			criar o produto e adicionar na loja

//			criarProduto();
			break;

		case 3:
			System.out.println("Obrigado!");
			System.exit(0); // para o sistema

		default:
			System.out.println("Opção inválida!");
			operacoes();
			break;
		}
	}

	public static Loja criarLoja() {

		String nome = Teclado.leString("\nNome da Loja:");
		int quantidadeFuncionario = Teclado.leInt("\nQuantidade funcionario:");
		double salarioBaseFuncionarios = Teclado.leDouble("\nTotal Salario funcionario:");
		String enderecoLoja = Teclado.leString("\nEndereço: ");

		int dia = Teclado.leInt("\nDia: ");
		int mes = Teclado.leInt("\nMês: ");
		int ano = Teclado.leInt("\nAno: ");

		Data data = new Data(dia, mes, ano);

		System.out.println();

		System.out.println("--- Sua Loja foi criada com sucesso! ---");
		System.out.println("\n\n");

		// so exemplo
		return new Loja(nome, 5);

	}

	public static Produto criarProduto() {

		// Produto
		String nome = Teclado.leString("\nNome do Produto: ");
		double preco = Teclado.leDouble("\nPreço do Produto: ");

		System.out.println("Informe a data validade do produto:");

		// Data
		int dia = Teclado.leInt("\nDia: ");
		int mes = Teclado.leInt("\nMes: ");
		int ano = Teclado.leInt("\nAno: ");

		Produto produto = new Produto(nome, preco, criarData(dia, mes, ano));

		return produto;
	}

	public static Data criarData(int dia, int mes, int ano) {
		return new Data(dia, mes, ano);
	}

}

//===============================================================		

//	Loja e0 = new Loja(nome, quantidadeFuncionario, salarioBaseFuncionarios, enderecoLoja, dataCriacao);
//	loja.add(e0);

//	Loja e1 = new Loja(nome, quantidadeFuncionario, salarioBaseFuncionarios, enderecoLoja, data);
//	loja.add(e1);

//	Loja e2 = new Loja(nome, quantidadeFuncionario, salarioBaseFuncionarios, enderecoLoja, dataE2);
//	loja.add(e2);

//	Loja e3 = new Loja(nome, quantidadeFuncionario, salarioBaseFuncionarios, enderecoLoja, dataE2);
//	loja.add(e3);

//	Loja e4 = new Loja(nome, quantidadeFuncionario, salarioBaseFuncionarios, enderecoLoja, dataE2);
//	loja.add(e4);

//	Loja e5 = new Loja(nome, quantidadeFuncionario, salarioBaseFuncionarios, enderecoLoja, dataE2);
//	loja.add(e5);

//	Loja e6 = new Loja(nome, quantidadeFuncionario, salarioBaseFuncionarios, enderecoLoja, dataE2);
//	loja.add(e6);

//	Loja e7 = new Loja(nome, quantidadeFuncionario, salarioBaseFuncionarios, enderecoLoja, dataE2);
//	loja.add(e7);

//	Loja e8 = new Loja(nome, quantidadeFuncionario, salarioBaseFuncionarios, enderecoLoja, dataE2);
//	loja.add(e8);

//	Loja e9 = new Loja(nome, quantidadeFuncionario, salarioBaseFuncionarios, enderecoLoja, dataE2);
//	loja.add(e9);

//	Loja e10 = new Loja(nome, quantidadeFuncionario, salarioBaseFuncionarios, enderecoLoja, dataE2);
//	loja.add(e10);

//	Loja e11 = new Loja(nome, quantidadeFuncionario, salarioBaseFuncionarios, enderecoLoja, dataE2);
//	loja.add(e11);

//	Loja e12 = new Loja(nome, quantidadeFuncionario, salarioBaseFuncionarios, enderecoLoja, dataE2);
//	loja.add(e12);

//	Loja e13 = new Loja(nome, quantidadeFuncionario, salarioBaseFuncionarios, enderecoLoja, dataE2);
//	loja.add(e13);

//	Loja e14 = new Loja(nome, quantidadeFuncionario, salarioBaseFuncionarios, enderecoLoja, dataE2);
//	loja.add(e14);

//	Loja e15 = new Loja(nome, quantidadeFuncionario, salarioBaseFuncionarios, enderecoLoja, dataE2);
//	loja.add(e15);

//	Loja e16 = new Loja(nome, quantidadeFuncionario, salarioBaseFuncionarios, enderecoLoja, dataE2);
//	loja.add(e16);

//	Loja e17 = new Loja(nome, quantidadeFuncionario, salarioBaseFuncionarios, enderecoLoja, dataE2);
//	loja.add(e17);

//	Loja e18 = new Loja(nome, quantidadeFuncionario, salarioBaseFuncionarios, enderecoLoja, dataE2);
//	loja.add(e18);

//	Loja e19 = new Loja(nome, quantidadeFuncionario, salarioBaseFuncionarios, enderecoLoja, dataE2);
//	loja.add(e19);

//=================================================================================================		

// Year.isLeap(2023);

//	Loja[] lojas = { e0, e1, e2 };

//		System.out.println(e0.toString());

//		System.out.println("Foi gasto tanto com salarios: " + e0.gastosComSalario());

//		System.out.println(e1.toString());

//		System.out.println(e2.toString());

//		System.out.println("\n\n");

//		for (int i = 0; i < lojas.length; i++) {
//			System.out.println(lojas[i]);

//}

//		Endereco enderecoLojaE2 = new Endereco("rua A", "Canoas", "RS", "Brasil", "93615-330", "100", " perto centro");
//		Data dataE2 = new Data(25, 5, 2023);

//		Cosmetico cosmetico = new Cosmetico("Renner", 10, 10000.00, enderecoLojaE2, dataE2, 0.10);

//		System.out.println(cosmetico.toString());

//		Data data = new Data(29, 2, 2028);
//		
//		System.out.println(data.toString());
//			