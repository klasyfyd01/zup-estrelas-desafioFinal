package GerenciadorDeEstoque;

public class Produto {
	private double precoCusto;
	private double precoVenda;
	private String nome;
	private String codigoDeBarra;
	private String dataValidade;
	public Produto(double precoCusto, double precoVenda, String nome, String codigoDeBarra, String dataValidade) {
		super();
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.nome = nome;
		this.codigoDeBarra = codigoDeBarra;
		this.dataValidade = dataValidade;
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
	public String getCodigoDeBarra() {
		return codigoDeBarra;
	}
	public void setCodigoDeBarra(String codigoDeBarra) {
		this.codigoDeBarra = codigoDeBarra;
	}
	public String getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	
	

}
