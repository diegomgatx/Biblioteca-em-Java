package br.com.hugovieira.trabalho.unifcv;

import java.util.Scanner;

public class Menu {

	public static void main (String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		Scanner sc = new Scanner(System.in);
		
		Integer opcao = 0;
		do {
			System.out.println("\n\n### Sistema de Controle de Biblioteca ###");
			System.out.println("\n                  ====================================");
			System.out.println("                  |     1 - Cadastrar Livro            |");
			System.out.println("                  |     2 - Alugar um livro            |");
			System.out.println("                  |     3 - Remover um livro           |");
			System.out.println("                  |     4 - Devolver um livro          |");
			System.out.println("                  |     5 - Apresentar todos os livros |");
			System.out.println("                  |     6 - Fechar o sistema           |");
			System.out.println("                   ====================================\n");
			sc.nextInt(opcao);
			System.out.print("\n");
			switch (opcao) {
			case 1:
				biblioteca.adicionarLivro();
				break;
			case 2:
				biblioteca.alugarLivro();
				break;
			case 3:
				biblioteca.removerLivro();
				break;
			case 4:
				biblioteca.devolverLivro();
				break;
			case 5:
				biblioteca.apresentarLivro();
				break;
			case 0:
				break;
			default:
				System.out.println("Op��o Inv�lida!");
				break;
				
			}
		} while (opcao != 0);
		sc.close();
	}
	
}
