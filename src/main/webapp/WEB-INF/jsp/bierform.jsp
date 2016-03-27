<%-- 
    Document   : bierform
    Created on : 29-feb-2016, 16:45:02
    Author     : thomas
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<a href="bierform.jsp"></a>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head> 
        <%@include file="../jspf/headerinfo.jspf" %>
        <link rel="stylesheet" type="text/css" href="<c:url value="../style.css"/>">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="../jspf/siteheader.jspf" %>
        
        <c:url var="post_url"  value="/bier.htm" />
        <form:form method="post" commandName="bierwrapper" action="${post_url}">
            <form:hidden path="BierId" />
            
            <form:input path="BierNaam" />
            <form:errors path="BierNaam" />
            
            <form:input path="BierBrouwerij" />
            <form:errors path="BierBrouwerij" />
            
            <form:input path="BierScore" />
            <form:errors path="BierScore" />
            
            <form:select path="CatNaam"  >
                <form:options items="${categorie}" itemValue="naam" itemLabel="naam" />
            </form:select>
            
            <form:button value="save" text="Save" />
        </form:form>
        <jsp:include page="../jspf/sitefooter.jspf" />
    </body>
</html>
