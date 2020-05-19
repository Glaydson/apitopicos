package br.edu.unichristus.academiajediapi;

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
@RequestMapping("/estudantes/")
@CrossOrigin(origins = "http://localhost:4200")
public class EstudanteController {
    @Autowired
    private EstudanteService servicoEstudantes;

    @GetMapping("/{id}")
    public Estudante buscarPeloId(@PathVariable String id) {
        return this.servicoEstudantes.buscarPeloId(id);
    }

    @GetMapping("/todos")
    public List<Estudante> buscarTodos() {
        List<Estudante> todos = this.servicoEstudantes.buscarTodos();
        todos.forEach(System.out::println);
        return this.servicoEstudantes.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable String id) {
        this.servicoEstudantes.remover(id);
    }

    @PostMapping("/novo")
    public ResponseEntity<Object> salvarProduto(@RequestBody Estudante estudante) {
        Estudante estudanteSalvo = servicoEstudantes.salvar(estudante);
        URI local = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(produtoSalvo.getId())
                .toUri();
        return ResponseEntity.created(local).build();
    }

    @PutMapping("/atualiza/{id}")
    public ResponseEntity<Object> atualizaEstudante(@RequestBody Estudante estudante, @PathVariable String id) {
        // Produto produtoBD = servicoProdutos.buscarPeloID(id);
        estudante.setId(id);
        servicoEstudantes.salvar(estudante);
        return ResponseEntity.noContent().build();
    }

    public void salvar(Estudante estudante) {
        this.servicoEstudantes.salvar(estudante);
    }

    public void removerTodos() {
        this.servicoEstudantes.removerTodos();
    }
}