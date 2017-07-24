function validar(e) {
	var codigo = form1.codigo.value;
	var tipo_mercadoria = form1.tipo_mercadoria.value;
	var nome = form1.nome.value;
	var qtde = form1.qtde.value;
	var preco = form1.preco.value;
	var tipo_negocio = form1.tipo_negocio.value;

	if (codigo == "" || tipo_mercadoria == "" || nome == "" || qtde == ""
			|| preco == "" || tipo_negocio == "") {
		alert("Erro! Favor preecher todos os campos!");
		e.preventDefault();
	}

}
