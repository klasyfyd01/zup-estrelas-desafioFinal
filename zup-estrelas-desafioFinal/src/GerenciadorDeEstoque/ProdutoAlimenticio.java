package GerenciadorDeEstoque;

public class ProdutoAlimenticio extends Produto {
	private String origin;

	public ProdutoAlimenticio(double precoCusto, double precoVenda, String nome, String codigoDeBarra,
			String dataValidade, String origin, String aroma, String parteDeCasa) {
		super(precoCusto, precoVenda, nome, codigoDeBarra, dataValidade, origin, aroma, parteDeCasa);

		this.origin = origin;

	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

}
