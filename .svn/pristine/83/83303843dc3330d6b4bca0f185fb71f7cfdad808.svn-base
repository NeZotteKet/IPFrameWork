<%-- 
    Document   : categoriechangeform
    Created on : 20-mrt-2016, 18:37:01
    Author     : thomas
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../jspf/headerinfo.jspf" %>
        <link rel="stylesheet" type="text/css" href="<c:url value="../style.css"/>">
        <title>JSP Page</title>
    </head>
    <body>
          <%@ include file="../jspf/siteheader.jspf" %>
        <c:url var="post_url"  value="/${categorie.naam}/edit.htm" />
        <form:form method="post" commandName="categorie" action="${post_url}">
            <form:label path="naam" for="naam" value="naam" />
            <form:input path="naam"/>

            <form:button >save</form:button>
        </form:form>
        <jsp:include page="../jspf/sitefooter.jspf" />
    </body>
</html>
