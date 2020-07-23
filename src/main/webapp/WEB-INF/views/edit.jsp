<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="ru.job4j.forum.models.Post" %>
<html>
<body>
<c:if test="${not empty errorMessge}">
    <div style="color:red; font-weight: bold; margin: 30px 0px;">
            ${errorMessge}
    </div>
</c:if>
<form action="<c:url value='/post'/>" method='POST'>
    <input type='text' hidden name='id' value="<c:out value="${post.id}"/>" >
    <table>
        <tr>
            <td>Тема статьи:</td>
            <td><input type='text' name='name' value="<c:out value="${post.name}"/>" ></td>
        </tr>
        <tr>
            <td>Описание:</td>
            <td><input type='text' name='desc' value="<c:out value="${post.desc}"/>"></td>
        </tr>
        <tr>
            <td colspan='2'><input name="submit" type="submit" value="submit" /></td>
        </tr>
    </table>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form>
</body>
</html>