package GerenciadorDeEstoque;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EstoqueAlimenticio implements Estoque{
List<Produto>produtosAlimenticios = new ArrayList<Produto>();
	@Override
	public void alteraPrecoProdutos(float percentagem, boolean aumenta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean cadstroProduto(Produto produto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeProduto(Integer codigoDeBarras) {
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
	public boolean gravaListaProdutos() throws IOException{
		FileWriter novoListaProdutos = new FileWriter(arquivo.txt );
		return false;
	}

	@Override
	public int quantidadeProdutos() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}