package GerenciadorDeEstoque;

public class ProdutoLimpeza extends Produto {
	private String aroma;
	private String parteDeCasa;

	public ProdutoLimpeza(double precoCusto, double precoVenda, String nome, int codigoDeBarra, String dataValidade) {
		super(precoCusto, precoVenda, nome, codigoDeBarra, dataValidade);
		// TODO Auto-generated constructor stub
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
