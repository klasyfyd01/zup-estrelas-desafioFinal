package br.zup.estrelas.GerenciadorDeEstoque;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import br.zup.estrelas.GerenciadorDeProdutos.Produto;

public class EstoqueAlimenticio implements Estoque {
	List<Produto> produtosAlimenticios = new ArrayList<Produto>();

	@Override
	public void alteraPrecoProdutos(float percentagem, boolean aumenta) {
		for (int raise = 0; raise < produtosAlimenticios.size(); raise++) {
			if (aumenta == true) {
				this.produtosAlimenticios.get(raise).aumentaPreco(percentagem);

			} else {
				this.produtosAlimenticios.get(raise).diminuirPreco(percentagem);
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Produto consultaProduto(Integer codigoDeBarras) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> listaProdutos() {

		return produtosAlimenticios;
	}

	@Override

	public boolean gravaListaProdutos() {
		try {
			FileWriter arquivo = new FileWriter("novoListProdutos.txt");
			PrintWriter gravaArquivo = new PrintWriter(arquivo);
			gravaArquivo.print("produtos em estoque");
			for (int i = 0; i < produtosAlimenticios.size(); i++) {
				gravaArquivo.print("\n");
				gravaArquivo.print(produtosAlimenticios.get(i));
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

		return 0;
	}

	@Override
	public boolean removeProduto(Integer codigoDeBarra) {
		for (int i = 0; i < produtosAlimenticios.size(); i++) {
			if (produtosAlimenticios.get(i).getCodigoDeBarra() == codigoDeBarra) {
				produtosAlimenticios.remove(i);
				return true;
			}

		}
		return false;

	}

}