<%-- 
    Document   : Categorie
    Created on : 16-mrt-2016, 15:53:22
    Author     : thomas
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../jspf/headerinfo.jspf" %>
        <link rel="stylesheet" type="text/css" href="<c:url value="style.css"/>">
        <title>JSP Page</title>
        
    </head>
    <body>
         <%@include file="../jspf/siteheader.jspf" %>
             <h2>Onze Bieren</h2>
       
       
                <c:forEach var="categorie" items="${categorie}">
            <div id="bieroverview">
                    <h3> ${categorie.naam} </h3>
                    <h4><a href="<c:url value="categorie/${categorie.id}.htm"/>">edit</a></h4>
          
            
           
            <table class="cat">
                <tr>
                <th><spring:message code="name" /></th>
                <th><spring:message code="brewery" /></th>
                <th><spring:message code="score" /></th>
               
                <th></th>
               <c:forEach var="bier" items="${categorie.bieren}">
            <tr>
                <td>${bier.naam}</td>
                <td>${bier.brouwerij}</td>
                <td>${bier.score}</td>
                <td><a href="<c:url value="bier/${bier.id}/delete.htm"/>">delete</a></td>
            </tr>
              </c:forEach>    
         
               </table>
            </div>
             </c:forEach>
               
          
          <form method="GET" action="<c:url value="/categorie/new.htm"/>">
        <input type="submit" value="nieuwe categorie"  />
        </form>       
                
        
        <jsp:include page="../jspf/sitefooter.jspf" />
    </body>
</html>
