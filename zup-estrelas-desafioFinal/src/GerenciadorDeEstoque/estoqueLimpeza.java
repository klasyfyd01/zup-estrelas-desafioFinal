package GerenciadorDeEstoque;

import java.util.List;

public class estoqueLimpeza implements Estoque {
public void produtosAlimenticio() {
	
}

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
	// TODO Auto-generated method stub
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
