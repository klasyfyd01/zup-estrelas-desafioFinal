package GerenciadorDeEstoque;

import java.util.Scanner;

public class PrincipalListaGerenciadorProdutos {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
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
				mostraMenuDeProdutosAlimenticios();
               break;
				case 2: mostraMenuDeProdutosDeLimpeza();
				break;
				default:System.out.println("opcao invalida"); 
			}	
			}while(option != 3);
			
			System.out.println("Obrigado e bom descanso");
		}

	private static void mostraMenuDeProdutosDeLimpeza() {
		EstoqueLimpeza estoqueLimpeza = new EstoqueLimpeza();
		int submenu = 0;
		do {
			System.out.println("1 - Cadastrar produtos");

			System.out.println("2 - Remover produtos");

			System.out.println("3 - Listar produtos");

			System.out.println("4 - Alterar preço dos produtos");

			System.out.println("8 - Voltar ao menu anterior");
		}while();

	}

	private static void mostraMenuDeProdutosAlimenticios() {
		EstoqueAlimenticio estoqueAlimenticio = new EstoqueAlimenticio();

	}

}
