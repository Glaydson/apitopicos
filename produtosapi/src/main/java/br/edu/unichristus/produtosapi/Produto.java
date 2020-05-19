package br.edu.unichristus.produtosapi;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "produtos")
@JsonFormat
public class Produto {

	@Id
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private String id;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private String nomeProduto;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private String codigoProduto;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern= "yyyy-MM-dd")
	private LocalDate dataLancamento;

	@JsonFormat(shape = JsonFormat.Shape.NUMBER_FLOAT)
	private double preco;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private String descricao;

	@JsonFormat(shape = JsonFormat.Shape.NUMBER_FLOAT)
	private double rating;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private String urlImagem;

	public Produto(String nomeProduto, String codigoProduto, LocalDate dataLancamento, double preco, String descricao,
			double rating, String urlImagem) {
		super();
		this.nomeProduto = nomeProduto;
		this.codigoProduto = codigoProduto;
		this.dataLancamento = dataLancamento;
		this.preco = preco;
		this.descricao = descricao;
		this.rating = rating;
		this.urlImagem = urlImagem;
	}

	@Override
	public String toString() {
		return "Produto [codigoProduto=" + codigoProduto + ", dataLancamento=" + dataLancamento + ", descricao="
				+ descricao + ", id=" + id + ", nomeProduto=" + nomeProduto + ", preco=" + preco + ", rating=" + rating
				+ ", urlImagem=" + urlImagem + "]";
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

}
