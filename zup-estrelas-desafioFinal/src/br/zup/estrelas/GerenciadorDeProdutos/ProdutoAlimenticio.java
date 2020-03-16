package br.zup.estrelas.GerenciadorDeProdutos;

public class ProdutoAlimenticio extends Produto {
	private String origin;

	
	public ProdutoAlimenticio(double precoCusto, double precoVenda, String nome, int codigoDeBarra, String dataValidade,
			String origin) {
		super(precoCusto, precoVenda, nome, codigoDeBarra, dataValidade);
		this.origin = origin;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

}
