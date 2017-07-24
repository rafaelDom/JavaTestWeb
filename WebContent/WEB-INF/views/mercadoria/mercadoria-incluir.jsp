<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
<head>
<meta name="viewport" content="width=device-width">
<meta charset="utf-8">
<title>mercadoria-incluir</title>
<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link rel="stylesheet"
	href="resources/css/mercadoria/mercadoria-incluir.css" type="text/css" />
</head>
<body>

	<h2>Inclusão de Mercadoria</h2>
	<form name="form1" action="adicionaMercadoria" method="post">
		<div class="formulario-mercadoria">
			<div class="form-group">
				<label for="name">Código:</label> <input name="codigo"
					class="form-control" maxlength="6" width="40" value="0" />
			</div>
			<div class="form-group">
				<label for="name">Tipo Mercadoria:</label> <input
					name="tipo_mercadoria" class="form-control" maxlength="20"
					width="40" />
			</div>
			<div class="form-group">
				<label for="name">Nome:</label> <input name="nome"
					class="form-control" maxlength="80" width="40" />
			</div>
			<div class="form-group">
				<label for="name">Qtde:</label> <input name="qtde"
					class="form-control" maxlength="10" width="40" value="0" />
			</div>
			<div class="form-group">
				<label for="name">Preço:</label> <input name="preco"
					class="form-control" maxlength="20" width="40" value="0" />
			</div>
			<div class="form-group">
				<label for="name">Tipo Negócio:</label> <input name="tipo_negocio"
					class="form-control" maxlength="6" width="40" />
			</div>
			<input type="submit" onclick="validar(event)" value="Adicionar"
				class="btn btn-primary">
			<button type="button" class="btn btn-secondary" onclick="window.location.href='mercadoria'">Cancelar</button>
		</div>
	</form>
	<footer>
		<div class="rodape">
			<ul class="social">
				<li><a href="https://facebook.com/"><img
						src="resources/img/facebook.png"></a></li>
				<li><a href="https://login.skype.com/"><img
						src="resources/img/skype.png"></a></li>
				<li><a href="https://www.youtube.com/"><img
						src="resources/img/you_tube.png"></a></li>
			</ul>
		</div>
	</footer>
	<script type="text/javascript"
		src="resources/js/mercadoria/mercadoria-incluir.js"></script>
</body>

</html>