package br.edu.unichristus.produtosapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

	@Autowired
	private ProdutosRepository repo;

	public Produto salvar(Produto p) {
		return this.repo.save(p);
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

	public void remover(String id) {
		this.repo.deleteById(id);
	}
}
