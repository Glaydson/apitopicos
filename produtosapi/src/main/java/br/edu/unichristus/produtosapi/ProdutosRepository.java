package br.edu.unichristus.produtosapi;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutosRepository extends MongoRepository<Produto, String> {

}
