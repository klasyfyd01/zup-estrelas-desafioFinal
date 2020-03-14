package GerenciadorDeEstoque;

import java.util.List;

public interface Estoque {
	public void alteraPrecoProdutos(float percentagem, boolean aumenta);

	public boolean cadstroProduto(Produto produto);

	public boolean removeProduto(Integer codigoDeBarras);

	public boolean alteraPrecopoduto(float percentagem, boolean aumentaPreco, int codigoDeBarras);
	
	public Produto consultaProduto(Integer codigoDeBarras);
	
	public List<Produto> listaProdutos();
	
	public boolean gravaListaProdutos();
	
	public int quantidadeProdutos();
}
