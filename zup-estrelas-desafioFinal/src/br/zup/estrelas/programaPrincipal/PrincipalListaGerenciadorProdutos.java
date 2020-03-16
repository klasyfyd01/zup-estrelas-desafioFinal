package br.zup.estrelas.programaPrincipal;

import java.util.Scanner;

import br.zup.estrelas.GerenciadorDeEstoque.EstoqueAlimenticio;
import br.zup.estrelas.GerenciadorDeEstoque.EstoqueLimpeza;

public class PrincipalListaGerenciadorProdutos {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int option;

		System.out.println("Bem vindo ao sistema de gerenciador dos nossos produtos");
		System.out.println("Escolhe entre as opçoes para comecar");
		option = 0;
		do {

			System.out.println("1 - Produtos Alimenticios");

			System.out.println("2 - Produtos Limpeza");

			System.out.println("3 - Encerrar o dia");
			option = in.nextInt();

			switch (option) {
			case 1:
				mostraMenuDeProdutosAlimenticios( );
				break;
			case 2:
				mostraMenuDeProdutosDeLimpeza();
				break;
			default:
				System.out.println("opcao invalida");
			}
		} while (option != 0);

		System.out.println("Obrigado e bom descanso");
	}

	private static void mostraMenuDeProdutosDeLimpeza() {
		EstoqueLimpeza estoqueLimpeza = new EstoqueLimpeza();
		int subMenuLimpeza = 0;
		do {
			System.out.println("1 - Cadastrar produtos");
			String nome = in.next();
			System.out.println("Digite a data de fabricaçao do produto");
			String data = in.next();
			System.out.println("Digite o preco");
			double preco = in.nextDouble();

			switch (subMenuLimpeza) {
			case 1:
				extracted();
				break;

			
			}

		} while (subMenuLimpeza >= 8);
		System.out.println("Obrigado e bom descanso");
	}

	private static void extracted() {
		System.out.println("1 - Cadastrar produtos");
		System.out.println("2 - Remover produtos");
		System.out.println("3 - Listar produtos");
		System.out.println("4 - Alterar preço dos produtos");
		System.out.println("5- Grava na lista ");
		System.out.println("6 - Quantidade de produtos");
		System.out.println("7 - Altera preco produto");
		System.out.println("8 - Voltar ao menu anterior");
	}

	private static void mostraMenuDeProdutosAlimenticios() {
		EstoqueAlimenticio produtAlimenticio = new EstoqueAlimenticio();
		int subMenuAlimenticio = 0;
		do {

			extracted();

		} while (subMenuAlimenticio >= 8);

	}

}

/*
 * Programa Principal Ofereça ao seu usuário a opção de navegação por um menu
 * onde ele pode decidir se quer trabalhar com o menu de produtos alimentícios
 * ou de limpeza ou encerrar o dia. Nos submenus de produtos alimentícios e de
 * limpeza de ofereça opções para utilizar todos os seus métodos e ofereça ao
 * usuário as interações necessárias (ler do teclado as informações num caso de
 * cadastro por exemplo) e a opção de retornar ao menu anterior.
 * 
 * - Por fim você deverá pensar numa funcionalidade legal para o estoque e
 * implementá-la. Seja criativo e justifique a criação da sua funcionalidade num
 * comentário à cima do método que corresponderá à essa funcionalidade.
 */
