package br.edu.unichristus.academiajediapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository repo;

    public Estudante salvar(Estudante e) {
        return this.repo.save(e);
    }

    public List<Estudante> buscarTodos() {
        return this.repo.findAll();
    }

    public Estudante buscarPeloId(String id) {
        return this.repo.findById(id).get();
    }

    public void removerTodos() {
        this.repo.deleteAll();
    }

    public void remover(String id) {
        this.repo.deleteById(id);
    }
}