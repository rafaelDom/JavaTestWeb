package br.com.mercadoria.modelo;

public class Mercadoria {
	
	private int codigo = 0;
	private String tipo_mercadoria;
	private String nome;
	private int qtde = 0;
	private float preco = 0;
	private String tipo_negocio;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipo_mercadoria() {
		return tipo_mercadoria;
	}

	public void setTipo_mercadoria(String tipo_mercadoria) {
		this.tipo_mercadoria = tipo_mercadoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getTipo_negocio() {
		return tipo_negocio;
	}

	public void setTipo_negocio(String tipo_negocio) {
		this.tipo_negocio = tipo_negocio;
	}

}
