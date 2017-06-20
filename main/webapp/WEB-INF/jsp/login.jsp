<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<c:set var="url" value="${pageContext.request.contextPath}"></c:set>


<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h1> session</h1>
${user_session}
</body>
</html>