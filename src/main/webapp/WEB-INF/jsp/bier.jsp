<%-- 
    Document   : BierOverViewPagina
    Created on : 22-feb-2016, 15:06:00
    Author     : thomas
--%>

<%@page import="java.util.Set"%>
<%@page import="com.mycompany.myfirstmavenproject.domain.Bier"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
    <%@include file="../jspf/headerinfo.jspf" %>
    <link rel="stylesheet" type="text/css" href="<c:url value="style.css"/>">
    <title>BierOverviewPagina</title>
    </head>
    <body>
          <%@include file="../jspf/siteheader.jspf" %>
    <main>
        <h2><spring:message code="bieren" /></h2>
       
        <div id="bieroverview">
            <table id="overview">
                <tr>
                <th><spring:message code="name" /></th>
                <th><spring:message code="brewery" /></th>
                <th><spring:message code="score" /></th>
                <th></th>
                <th></th>
                </tr>
                <c:forEach var="bier" items="${bieren}">
            <tr>
                <td>${bier.naam}</td>
                <td>${bier.brouwerij}</td>
                <td>${bier.score}</td>
                <td><a href="<c:url value="bier/${bier.id}.htm"/>">edit</a></td>
                <td><a href="<c:url value="bier/${bier.id}/delete.htm"/>">delete</a></td>
               <!---TODO fix update button--->
               
            </tr>
                </c:forEach>
                </table>
        </div>
        <form method="GET" action="<c:url value="/bier/new.htm"/>">
        <input type="submit" value="nieuw bier"  />
        </form>
    </main>
     <jsp:include page="../jspf/sitefooter.jspf" />
        
    </body>
</html>
