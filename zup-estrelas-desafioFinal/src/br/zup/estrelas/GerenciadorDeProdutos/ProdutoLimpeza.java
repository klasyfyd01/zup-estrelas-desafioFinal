package br.zup.estrelas.GerenciadorDeProdutos;

public class ProdutoLimpeza extends Produto {
	private String aroma;
	private String parteDeCasa;

	public ProdutoLimpeza(double precoCusto, double precoVenda, String nome, int codigoDeBarra, String dataValidade,
			String aroma, String parteDeCasa) {
		super(precoCusto, precoVenda, nome, codigoDeBarra, dataValidade);
		this.aroma = aroma;
		this.parteDeCasa = parteDeCasa;
	}

	public String getAroma() {
		return aroma;
	}

	public void setAroma(String aroma) {
		this.aroma = aroma;
	}

	public String getParteDeCasa() {
		return parteDeCasa;
	}

	public void setParteDeCasa(String parteDeCasa) {
		this.parteDeCasa = parteDeCasa;
	}

}
