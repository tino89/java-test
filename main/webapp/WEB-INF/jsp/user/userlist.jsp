<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<c:set var="url" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/css/bootstrap.css"/>" rel="stylesheet" />
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-6" style="border: 1px solid red">
				<div class="row">
					<div class="col-md-6">
						<h4>Add User</h4>
					</div>
					<div class="col-md-6 text-right">
						<a href="${url}/user-add"><button class="btn btn-success">
								Crear Nuevo</button> </a>
					</div>
				</div>

				<table class="table table-striped">
					<c:forEach items="${listUser}" var="item">
						<tr>
							<td>${item.name}</td>
							<td>${item.lastName}</td>
							<td>${item.dni}</td>
							<td><a href="${url}/user-edit/${item.idUser}">
									<button class="btn btn-info">Editar</button>
							</a></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>



</body>
</html>