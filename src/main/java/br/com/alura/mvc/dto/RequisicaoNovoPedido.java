package br.com.alura.mvc.dto;

import br.com.alura.mvc.model.Pedido;

public class RequisicaoNovoPedido {
	private String nomeProduto;
	private String urlProduto;
	private String urlImagem;
	private String descricao;
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getUrlProduto() {
		return urlProduto;
	}
	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Pedido toPedido() {
		Pedido p = new Pedido();
		p.setNomeProduto(nomeProduto);
		p.setUrlProduto(urlProduto);
		p.setUrlImagem(urlImagem);
		p.setDescricao(descricao);
		return p;
	}
}