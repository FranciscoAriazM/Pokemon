<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pokemon</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<body>
	<div>

		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nombre</th>
				</tr>
			</thead>
			<tbody>
				<c:foreach var="pokemon" items=${pokemones}>
					<tr>
						<td>${pokemon.id}</td>
						<td>${pokemon.nombre}</td>
						<td></td>
					</tr>
				</c:foreach>
			</tbody>

		</table>


	</div>
</body>
</html>

