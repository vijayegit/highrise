<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page session="false"%>
<html>
<head>

</head>


<body>
<form:form method="post" action="loginForm" id="vceForm"> 

<table>
<tr>
<td> 
 <spring:bind path="password">
										<input type="password" name="${status.expression}" 	value="${status.value}" id="password" size="30"	maxlength="50" onkeypress="javascript:submitOnEnter('loginForm', event);"/>
									</spring:bind>
</td>
</tr>
<tr>
<td>
<spring:bind path="username">
										<input type="text" name="${status.expression}" value="${status.value}" id="userName" size="30"	maxlength="50" />
									</spring:bind>
</td>
</tr>

</table>
</form:form>
</body>

</html>