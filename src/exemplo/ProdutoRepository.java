package exemplo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ProdutoRepository {

	private Map<String,Produto> catalogo;
	
	public ProdutoRepository() {
		this.catalogo = new HashMap<>();
	}
	
	public void adicionaProduto(Produto produto) {
		this.catalogo.put(produto.getId(), produto);
	}
	
	public void removeProduto(Produto produto) {
		this.catalogo.remove(produto.getId());
	}
	
	public void editaProduto() {
		
	}
	
	public Produto recuperaProduto(String id) {
		return this.catalogo.get(id);
	}
	
	public Collection<Produto> listaProdutos() {
		return this.catalogo.values();
	}
	
}
