<%@page import="org.apache.taglibs.standard.tag.common.xml.ForEachTag"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.mercadoria.dao.*"%>
<%@ page import="br.com.mercadoria.modelo.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE HTML>
<html>
<head>
<meta name="viewport" content="width=device-width">
<meta charset="utf-8">
<title>mercadoria</title>
<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link rel="stylesheet" href="resources/css/mercadoria/mercadoria.css"
	type="text/css" />
</head>
<body>
	<h2>Mercadoria</h2>
	<div class="tabela-mercadoria">
		<table class="table table-inverse">
			<thead>
				<tr>
					<th>Codigo</th>
					<th>Tipo Mercadoria</th>
					<th>Nome</th>
					<th>Qtde</th>
					<th>Preço</th>
					<th>Tipo Negócio</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="mercadoria" items="${lists}">
					<tr>
						<td>${mercadoria.codigo}</td>
						<td>${mercadoria.tipo_mercadoria}</td>
						<td>${mercadoria.nome}</td>
						<td>${mercadoria.qtde}</td>
						<td>${mercadoria.preco}</td>
						<td>${mercadoria.tipo_negocio}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div class="botoes">
		<button type="button" class="btn btn-primary"
			onclick="window.location.href='mercadoria-incluir'">Incluir</button>
		<button type="button" class="btn btn-secondary"
			onclick="window.location.href='home'">Cancelar</button>
	</div>
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
</body>

</html>