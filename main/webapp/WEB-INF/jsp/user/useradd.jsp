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
			<div class="col-md-6">
				<div class="row">
					<div class="col-md-6">
						<h4>Add User</h4>
					</div>
					<div class="col-md-6 text-right">
						<a href="${url}/user-list"><button class="btn btn-success">
								Listar todo</button> </a>
					</div>
				</div>
				<br>

				<c:if test="${type == 1}">
					add
					<c:set var="urlAction" value="${url}/user-add"></c:set>
				</c:if>
				<c:if test="${type == 2}">
					edit
					<c:set var="urlAction" value="${url}/user-edit-save"></c:set>
				</c:if>


				<form:form class="form-horizontal" method="post"
					action="${urlAction}" commandName="userForm">

					<form:input type="hidden" path="idUser" />

					<div class="form-group">
						<label class="col-md-2" for="lastName">Last Name:</label>
						<div class="col-md-10">
							<form:input path="lastName" type="text" id="lastName"
								class="form-control" />
							<form:errors path="lastName" />
						</div>
					</div>


					<div class="form-group">
						<label class="col-md-2" for="name">Name:</label>
						<div class="col-md-10">
							<form:input path="name" type="text" id="name"
								class="form-control" />
							<form:errors style="color:red" path="name" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-2" for="dni">DNI:</label>
						<div class="col-md-10">
							<form:input path="dni" type="text" id="dni" class="form-control" />
							<form:errors path="dni" />
						</div>
					</div>


					<c:if test="${type == 1 || type == 2}">
						<div class="form-group">
							<div class="col-md-10 col-md-offset-2">
								<form:button type="submit"> Enviar </form:button>
							</div>
						</div>
					</c:if>

				</form:form>
			</div>

			<div class="col-md-6"></div>
		</div>
	</div>



</body>
</html>