package br.edu.unichristus.produtosapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class ProdutoController {
	@Autowired
	private ProdutoService servicoProdutos;

	@PostMapping("/novo")
	public void salvar(@RequestBody Produto produto) {
		this.servicoProdutos.salvar(produto);
	}

	@CrossOrigin
	@GetMapping("/todos")
	public List<Produto> buscarTodos() {
		List<Produto> todos = this.servicoProdutos.buscarTodos();
		todos.forEach(System.out::println);
		return this.servicoProdutos.buscarTodos();
	}

	@GetMapping("/{id}")
	public Produto buscarPeloId(@PathVariable String id) {
		return this.servicoProdutos.buscarPeloID(id);
	}

	@DeleteMapping
	public void removerTodos() {
		this.servicoProdutos.removerTodos();
	}
}
