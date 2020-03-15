package GerenciadorDeEstoque;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class EstoqueAlimenticio implements Estoque {


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
	FileReader arquivo = new FileReader(nome.txt);
	FileWriter novoArquivo  = new FileWriter(nome.txt);
	
	return null;
}

@Override
public boolean gravaListaProdutos() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public int quantidadeProdutos() {
	// TODO Auto-generated method stub
	return 0;
}
}
