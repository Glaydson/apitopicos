package br.edu.unichristus.academiajediapi;

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
@RequestMapping("/estudantes/")
@CrossOrigin(origins = "http://localhost:4200")
public class EstudanteController {
    @Autowired
    private EstudanteService servicoEstudantes;

    @PostMapping("/novo")
    public void salvar(@RequestBody Estudante estudante) {
        this.servicoEstudantes.salvar(estudante);
    }

    @GetMapping("/todos")
    public List<Estudante> buscarTodos() {
        List<Estudante> todos = this.servicoEstudantes.buscarTodos();
        todos.forEach(System.out::println);
        return this.servicoEstudantes.buscarTodos();
    }

    @GetMapping("/{id}")
    public Estudante buscarPeloId(@PathVariable String id) {
        return this.servicoEstudantes.buscarPeloId(id);
    }

    @DeleteMapping
    public void removerTodos() {
        this.servicoEstudantes.removerTodos();
    }
}