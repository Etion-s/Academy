<%@ page contentType="text/html; charset=EUC-KR" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title><spring:message code="login.form.title"/></title>
</head>
<body>
<form:form commandName="login">
<font color=red><form:errors /></font>
<p>
	<label for="loginType"><spring:message code="login.form.type" /></label>
	<form:select path="loginType" items="${loginTypes}" />
</p>
<p>
	<label for="id"><spring:message code="login.form.id" /></label>
	<form:input id="id" path="id"/>
	<font color=red><form:errors path="id" /></font>
</p>
<p>
	<label for="password"><spring:message code="login.form.password" /></label>
	<form:password id="password" path="password"/>
	<font color=red><form:errors path="password" /></font>
</p>
<p>
	<input type="submit" value="<spring:message code="login.form.submit" />">
</p>
</form:form>
</body>
</html>










