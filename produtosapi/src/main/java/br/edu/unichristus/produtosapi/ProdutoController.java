package br.edu.unichristus.produtosapi;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class ProdutoController {
	@Autowired
	private ProdutoService servicoProdutos;

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

	@DeleteMapping("/{id}")
	public void remover(@PathVariable String id) {
		this.servicoProdutos.remover(id);
	}

	public void removerTodos() {
		this.servicoProdutos.removerTodos();
	}

	@PostMapping("/novo")
	public ResponseEntity<Object> salvarProduto(@RequestBody Produto produto) {
		System.out.println(produto);
		Produto produtoSalvo = servicoProdutos.salvar(produto);
		URI local = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(produtoSalvo.getId())
				.toUri();
		return ResponseEntity.created(local).build();
	}

	@PutMapping("/atualiza/{id}")
	public ResponseEntity<Object> atualizaProduto(@RequestBody Produto produto, @PathVariable String id) {
		// Produto produtoBD = servicoProdutos.buscarPeloID(id);
		produto.setId(id);
		servicoProdutos.salvar(produto);
		return ResponseEntity.noContent().build();
	}

	public void salvar(Produto produto) {
		this.servicoProdutos.salvar(produto);
	}
}
