package br.zup.estrelas.programaPrincipal;

import java.util.Scanner;

import br.zup.estrelas.GerenciadorDeEstoque.EstoqueAlimenticio;
import br.zup.estrelas.GerenciadorDeEstoque.EstoqueLimpeza;

public class PrincipalListaGerenciadorProdutos {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args)  {
		// XXX: Por que esse TODO est� aqui?
		// TODO Auto-generated method stub
		int option;

		System.out.println("Bem vindo ao sistema de gerenciador dos nossos produtos");
		System.out.println("Escolhe entre as op�oes para comecar");
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
		// XXX: Inicializar o Estoque de Limpeza aqui faz com que quando sairmos do m�todo
		// ele se perca.
		EstoqueLimpeza estoqueLimpeza = new EstoqueLimpeza();
		int subMenuLimpeza = 0;
		do {
			//XXX: Primeiro voc� deve apresentar o menu e s� depois iniciar o cadastro.
			System.out.println("1 - Cadastrar produtos");
			String nome = in.next();
			System.out.println("Digite a data de fabrica�ao do produto");
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
		System.out.println("4 - Alterar pre�o dos produtos");
		System.out.println("5- Grava na lista ");
		System.out.println("6 - Quantidade de produtos");
		System.out.println("7 - Altera preco produto");
		System.out.println("8 - Voltar ao menu anterior");
	}

	// XXX: O menu n�o faz nada.
	private static void mostraMenuDeProdutosAlimenticios() {
		EstoqueAlimenticio produtAlimenticio = new EstoqueAlimenticio();
		int subMenuAlimenticio = 0;
		do {

			extracted();

		//XXX: Essa condi��o n�o � correta considerando as op��es do m�todo extracted
		} while (subMenuAlimenticio >= 8);

	}

}

/*
 * Programa Principal Ofere�a ao seu usu�rio a op��o de navega��o por um menu
 * onde ele pode decidir se quer trabalhar com o menu de produtos aliment�cios
 * ou de limpeza ou encerrar o dia. Nos submenus de produtos aliment�cios e de
 * limpeza de ofere�a op��es para utilizar todos os seus m�todos e ofere�a ao
 * usu�rio as intera��es necess�rias (ler do teclado as informa��es num caso de
 * cadastro por exemplo) e a op��o de retornar ao menu anterior.
 * 
 * - Por fim voc� dever� pensar numa funcionalidade legal para o estoque e
 * implement�-la. Seja criativo e justifique a cria��o da sua funcionalidade num
 * coment�rio � cima do m�todo que corresponder� � essa funcionalidade.
 */
