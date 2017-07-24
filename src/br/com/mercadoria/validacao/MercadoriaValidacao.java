package br.com.mercadoria.validacao;

import br.com.mercadoria.modelo.Mercadoria;

public class MercadoriaValidacao {

	public boolean validar(Mercadoria mercadoria) {
		boolean validacao = false;

		if (mercadoria.getCodigo() != 0
				|| !mercadoria.getTipo_mercadoria().isEmpty()
				|| !mercadoria.getNome().isEmpty() || mercadoria.getQtde() != 0
				|| mercadoria.getPreco() != 0
				|| !mercadoria.getTipo_negocio().isEmpty()) {

			validacao = true;
		}

		return validacao;

	}
}
