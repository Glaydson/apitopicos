package br.edu.unichristus.produtosapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

	@Autowired
	private ProdutosRepository repo;

	public void salvar(Produto p) {
		this.repo.save(p);
	}

	public Produto buscarPeloID(String id) {
		return repo.findById(id).get();
	}

	public List<Produto> buscarTodos() {
		return this.repo.findAll();
	}

	public void removerTodos() {
		this.repo.deleteAll();
	}
}
