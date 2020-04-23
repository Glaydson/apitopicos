package br.edu.unichristus.academiajediapi;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "estudantes")
public class Estudante {
    @Id
    private String id;

    private String nome;

    private double altura;

    private String peso;

    private String corCabelo;

    private String corOlhos;

    private String anoNascimento;

    private String sexo;

    private String planeta;

    private String url;

    public Estudante(String nome, double altura, String peso, String corCabelo, String corOlhos, String anoNascimento,
            String sexo, String planeta, String url) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.corCabelo = corCabelo;
        this.corOlhos = corOlhos;
        this.anoNascimento = anoNascimento;
        this.sexo = sexo;
        this.planeta = planeta;
        this.url = url;
    }

    @Override
    public String toString() {
        return "Estudante [altura=" + altura + ", anoNascimento=" + anoNascimento + ", corCabelo=" + corCabelo
                + ", corOlhos=" + corOlhos + ", id=" + id + ", nome=" + nome + ", peso=" + peso + ", planeta=" + planeta
                + ", sexo=" + sexo + ", url=" + url + "]";
    }

}