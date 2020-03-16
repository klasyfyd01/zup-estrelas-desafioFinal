package br.zup.estrelas.GerenciadorDeEstoque;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import br.zup.estrelas.GerenciadorDeProdutos.Produto;
import br.zup.estrelas.GerenciadorDeProdutos.ProdutoLimpeza;

public class EstoqueLimpeza implements Estoque {
	List<ProdutoLimpeza> produtosLimpeza = new ArrayList<ProdutoLimpeza>();

	@Override
	public void alteraPrecoProdutos(float percentagem, boolean aumenta) {
		for (int i = 0; i < produtosLimpeza.size(); i++) {
			if (aumenta) {
				produtosLimpeza.get(i)
						.setPrecoVenda(produtosLimpeza.get(i).getPrecoVenda() * (1 + (percentagem / 100)));

			} else {
				produtosLimpeza.get(i)
						.setPrecoVenda(produtosLimpeza.get(i).getPrecoVenda() * (1 - (percentagem / 100)));

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
		if (aumenta) {
			produtosLimpeza.get(codigoDeBarras)
					.setPrecoVenda(produtosLimpeza.get(codigoDeBarras).getPrecoVenda() * (1 + (percentagem / 100)));

		} else {
			produtosLimpeza.get(codigoDeBarras)
					.setPrecoVenda(produtosLimpeza.get(codigoDeBarras).getPrecoVenda() * (1 - (percentagem / 100)));

		}
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