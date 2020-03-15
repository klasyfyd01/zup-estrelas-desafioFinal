package GerenciadorDeEstoque;

public class Produto {
	private double precoCusto;
	private double precoVenda;
	private String nome;
	private int codigoDeBarra;
	private String dataValidade;

	public Produto(double precoCusto, double precoVenda, String nome, int codigoDeBarra, String dataValidade) {
		super();
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.nome = nome;
		this.codigoDeBarra = codigoDeBarra;
		this.dataValidade = dataValidade;
	}

	public void aumentaPreco(float percentagem) {
		this.precoVenda += precoVenda * percentagem;
	}

	public void diminuirPreco(float percentagem) {
		this.precoVenda -= precoVenda * percentagem;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoDeBarra() {
		return codigoDeBarra;
	}

	public void setCodigoDeBarra(int codigoDeBarra) {
		this.codigoDeBarra = codigoDeBarra;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

}
