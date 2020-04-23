package br.edu.unichristus.produtosapi;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private ProdutoController controladorProdutos;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		controladorProdutos.removerTodos();
		Produto ancinho = new Produto("Ancinho", "GDN-0011", LocalDate.of(2016, 3, 19), 19.95,
				"Ancinho com cabo de madeira de 48 polegadas", 3.2,
				"https://openclipart.org/image/300px/svg_to_png/26215/Anonymous_Leaf_Rake.png");

		Produto carrinhoJardim = new Produto("Carrinho de Jardim", "GDN-0023", LocalDate.of(2016, 3, 18), 32.99,
				"Carrinho de Jardim com capacidade de 56 litros", 4.2,
				"https://openclipart.org/image/300px/svg_to_png/58471/garden_cart.png");

		Produto martelo = new Produto("Martelo", "TBX-0048", LocalDate.of(2016, 5, 21), 8.9,
				"Martelo de aço de garra curva", 4.8,
				"https://openclipart.org/image/300px/svg_to_png/73/rejon_Hammer.png");

		Produto serra = new Produto("Serra", "TBX-0022", LocalDate.of(2016, 5, 15), 11.55,
				"Serra de mão com lâmina de aço de 15 polegadas", 3.7,
				"https://openclipart.org/image/300px/svg_to_png/27070/egore911_saw.png");

		Produto controle = new Produto("Controle de Vídeo Game", "GMG-0042", LocalDate.of(2016, 10, 15), 35.95,
				"Controle de vídeo game padrão com dois botões", 4.6,
				"https://openclipart.org/image/300px/svg_to_png/120337/xbox-controller_01.png");

		controladorProdutos.salvar(ancinho);
		controladorProdutos.salvar(carrinhoJardim);
		controladorProdutos.salvar(martelo);
		controladorProdutos.salvar(serra);
		controladorProdutos.salvar(controle);

		List<Produto> produtos = controladorProdutos.buscarTodos();
		System.out.println("LISTA DE PRODUTOS");
		for (Produto p: produtos) {
			System.out.println(p);
		}

	}

}
