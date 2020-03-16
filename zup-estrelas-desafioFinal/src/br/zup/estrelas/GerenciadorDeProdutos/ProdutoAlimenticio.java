package br.zup.estrelas.GerenciadorDeProdutos;

public class ProdutoAlimenticio extends Produto {
	private String origin;

	public ProdutoAlimenticio(double precoCusto, double precoVenda, String nome, int codigoDeBarra,
			String dataValidade) {
		super(precoCusto, precoVenda, nome, codigoDeBarra, dataValidade);
		// TODO Auto-generated constructor stub
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

}
