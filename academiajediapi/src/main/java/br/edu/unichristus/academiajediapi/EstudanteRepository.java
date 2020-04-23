package br.edu.unichristus.academiajediapi;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.unichristus.academiajediapi.Estudante;

public interface EstudanteRepository extends MongoRepository<Estudante, String> {

}