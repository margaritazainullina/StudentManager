<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf8">
        <title><spring:message code="label.title" /></title>
        <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/layout-1-master.css"/>
    </head>
    <body>
        <div id="maincontainer">
            <div id="headline1">
                <div class="title">Students database</div>
            </div>
            <div id="navtoplist">
                <ul>
                    <li><a href="index"><spring:message code="label.students" /></a></li>
                    <li><a href="group"><spring:message code="label.groups" /></a></li>
                    <li><a href="speciality"><spring:message code="label.specialities" /></a></li>
                    <li><a href="login.jsp"><spring:message code="label.login" /></a></li>
                    <li><a href="<c:url value="/logout" />">
                            <spring:message code="label.logout" />
                        </a></a></li>
                </ul>
            </div>
            <div id="navtoplistline">&nbsp;</div>
            <div id="contentwrapper">
                <div id="maincolumn">
                    <div class="text">
                        <h2><spring:message code="label.addspeciality" /></h2>

                        <form:form method="post" action="add/speciality" commandName="speciality" class="form">

                            <table>
                                <tr>
                                    <td><form:label path="speciality">
                                            <spring:message code="label.speciality" />
                                        </form:label></td>
                                    <td><form:input path="speciality" /></td> 
                                   <td><span class="error" id="specialityerror" /></td>
                                </tr>

                                <tr>
                                    <td colspan="2"><input type="submit"
                                                           value="<spring:message code="label.addspeciality"/>" /></td>                    
                                </tr>
                            </table>
                        </form:form>
                        <br/>
                        <h2><spring:message code="label.specialities" /></h2>
                        <c:if test="${!empty specialityList}">
                            <table class="data">
                                <tr>
                                    <th><spring:message code="label.specialityid" /></th>
                                    <th><spring:message code="label.speciality" /></th>
                                    <th>&nbsp;</th>
                                </tr>
                                <c:forEach items="${specialityList}" var="speciality">
                                    <tr>
                                        <td>${speciality.specialityId}</td>  
                                        <td>${speciality.speciality}</td>  
                                        <td><a href="delete/speciality/${speciality.specialityId}"><spring:message code="label.delete" /></a></td>
                                    </tr>
                                </c:forEach>
                            </table>
                        </c:if>
                    </div>
                </div>              
            </div>
            <div id="footer">HNEU</div>
        </div>
    </body>
</html>