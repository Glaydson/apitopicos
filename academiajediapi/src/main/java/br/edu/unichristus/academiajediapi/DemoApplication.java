package br.edu.unichristus.academiajediapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private EstudanteController controladorEstudantes;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.controladorEstudantes.removerTodos();

		this.controladorEstudantes.salvar(new Estudante("Luke Skywalker", 172, "77", "louro", "blue", "19BBY",
				"masculino", "Alderaan", "./assets/imagens/luke_skywalker.jpg"));
		this.controladorEstudantes.salvar(new Estudante("C-3PO", 167, "75", "n/a", "amarelo", "112BBY", "n/a",
				"Alderaan", "./assets/imagens/c-3po.jpg"));
		this.controladorEstudantes.salvar(new Estudante("R2-D2", 96, "32", "n/a", "vermelho", "33BBY", "n/a",
				"Coruscant", "./assets/imagens/r2-d2.jpg"));
		this.controladorEstudantes.salvar(new Estudante("Darth Vader", 202, "136", "nenhuma", "amarelo", "41.9BBY",
				"masculino", "Alderaan", "./assets/imagens/darth_vader.jpg"));
		this.controladorEstudantes.salvar(new Estudante("Leia Organa", 150, "49", "castanho", "castanho", "19BBY",
				"feminino", "Yavin IV", "./assets/imagens/leia_organa.jpg"));
		this.controladorEstudantes.salvar(new Estudante("Owen Lars", 178, "120", "castanho, cinza", "azul", "52BBY",
				"masculino", "Alderaan", "./assets/imagens/owen_lars.jpg"));
		this.controladorEstudantes.salvar(new Estudante("Beru Whitesun Lars", 165, "75", "castanho", "azul", "47BBY",
				"feminino", "Alderaan", "./assets/imagens/beru_whitesun_lars.jpg"));
		this.controladorEstudantes.salvar(new Estudante("R5-D4", 97, "32", "n/a", "vermelho", "desconhecido", "n/a",
				"Alderaan", "./assets/imagens/r5-d4.jpg"));
		this.controladorEstudantes.salvar(new Estudante("Biggs Darklighter", 183, "84", "preto", "castanho", "24BBY",
				"masculino", "Alderaan", "./assets/imagens/biggs_darklighter.jpg"));
		this.controladorEstudantes.salvar(new Estudante("Obi-Wan Kenobi", 182, "77", "branco", "azul-cinza", "57BBY",
				"masculino", "Stewjon", "./assets/imagens/obi-wan_kenobi.jpg"));
		this.controladorEstudantes.salvar(new Estudante("Anakin Skywalker", 188, "84", "louro", "azul", "41.9BBY",
				"masculino", "Alderaan", "./assets/imagens/anakin_skywalker.jpg"));
		this.controladorEstudantes.salvar(new Estudante("Wilhuff Tarkin", 180, "desconhecido", "cinza", "azul", "64BBY",
				"masculino", "Stewjon", "./assets/imagens/wilhuff_tarkin.jpg"));
		this.controladorEstudantes.salvar(new Estudante("Chewbacca", 228, "112", "castanho", "azul", "200BBY",
				"masculino", "Kashyyyk", "./assets/imagens/chewbacca.jpg"));
		this.controladorEstudantes.salvar(new Estudante("Han Solo", 180, "80", "castanho", "castanho", "29BBY",
				"masculino", "Corellia", "./assets/imagens/han_solo.jpg"));
		this.controladorEstudantes.salvar(new Estudante("Greedo", 173, "74", "n/a", "preto", "44BBY", "masculino",
				"Rodia", "./assets/imagens/greedo.jpg"));
		this.controladorEstudantes.salvar(new Estudante("Jabba Desilijic Tiure", 175, "1,358", "n/a", "laranja",
				"600BBY", "hemafrodita", "Nal Hutta", "./assets/imagens/jabba_desilijic_tiure.jpg"));
		this.controladorEstudantes.salvar(new Estudante("Wedge Antilles", 170, "77", "castanho", "hazel", "21BBY",
				"masculino", "Corellia", "./assets/imagens/wedge_antilles.jpg"));
		this.controladorEstudantes.salvar(new Estudante("Yoda", 66, "17", "branco", "castanho", "896BBY", "masculino",
				"desconhecido", "./assets/imagens/yoda.jpg"));
		this.controladorEstudantes.salvar(new Estudante("Palpatine", 170, "75", "cinza", "amarelo", "82BBY",
				"masculino", "Naboo", "./assets/imagens/palpatine.jpg"));
	}

}
