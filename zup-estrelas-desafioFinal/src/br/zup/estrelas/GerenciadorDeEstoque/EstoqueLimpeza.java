package br.zup.estrelas.GerenciadorDeEstoque;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import br.zup.estrelas.GerenciadorDeProdutos.Produto;

public class EstoqueLimpeza implements Estoque {
	List<Produto> produtosLimpeza = new ArrayList<Produto>();

	@Override
	public void alteraPrecoProdutos(float percentagem, boolean aumenta) {
		for (int raise = 0; raise < produtosLimpeza.size(); raise++) {
			if (aumenta == true) {
				this.produtosLimpeza.get(raise).aumentaPreco(percentagem);

			} else {
				this.produtosLimpeza.get(raise).diminuirPreco(percentagem);
			}
		}
	}

	@Override
	public boolean cadstroProduto(Produto produto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alteraPrecopoduto(float percentagem, boolean aumentaPreco, int codigoDeBarras) {
		for (int raise = 0; raise < produtosLimpeza.size(); raise++) {
			if (aumentaPreco == true) {
				System.out.println("");
			}
		}
		/*
		 * Altera o preço de um produto com base em uma porcentagem, se a variável
		 * aumenta for verdadeira aumenta o preço de venda e se for false deverá
		 * diminuir o preço de venda.
		 */
		return false;
	}

	@Override
	public Produto consultaProduto(Integer codigoDeBarra) {
		for (Produto produto : produtosLimpeza) {
			if (produto.getCodigoDeBarra() == codigoDeBarra) {
				return produto;
			}
		}
		return null;
	}

	@Override
	public List<Produto> listaProdutos() {
		// TODO Auto-generated method stub
		return produtosLimpeza;
	}

	@Override
	public boolean gravaListaProdutos() {
		try {
			FileWriter arquivo = new FileWriter("novoListProdutos.txt");
			PrintWriter gravaArquivo = new PrintWriter(arquivo);
			gravaArquivo.print("todosOsProdutos");
			for (int i = 0; i < produtosLimpeza.size(); i++) {
				gravaArquivo.print("\n");
				gravaArquivo.print(produtosLimpeza.get(i));
			}
			arquivo.close();
			gravaArquivo.close();

		} catch (Exception e) {
			System.out.println("Erro ao gravar o produto!");
			e.printStackTrace();
			return false;
		}
		return true;

	}

	@Override
	public int quantidadeProdutos() {
		// TODO Auto-generated method stub
		return produtosLimpeza.size();
	}

	@Override
	public boolean removeProduto(Integer codigoDeBarras) {
		for (int i = 0; i < produtosLimpeza.size(); i++) {
			if (produtosLimpeza.get(i).getCodigoDeBarra() == codigoDeBarras) {
				produtosLimpeza.remove(i);
				return true;
			}
		}
		return false;
	}

}
/*
 * EstoqueLimpeza implementa Estoque; atributos: produtosLimpeza. métodos:
 * implementar os métodos da interface.
 */