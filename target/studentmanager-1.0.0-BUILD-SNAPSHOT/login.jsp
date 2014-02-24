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
                    <c:if test="${not empty param.error}">
                        <font color="red"> <spring:message code="label.loginerror" />
                            : ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message} </font>
                        </c:if>
                    <form method="POST" action="<c:url value="/j_spring_security_check" />">
                        <table>
                            <tr>
                                <td align="right"><spring:message code="label.login" /></td>
                                <td><input type="text" name="j_username" /></td>
                            </tr>
                            <tr>
                                <td align="right"><spring:message code="label.password" /></td>
                                <td><input type="password" name="j_password" /></td>
                            </tr>
                            <tr>
                                <td align="right"><spring:message code="label.remember" /></td>
                                <td><input type="checkbox" name="_spring_security_remember_me" /></td>
                            </tr>
                            <tr>
                                <td colspan="2" align="right"><input type="submit" value="Login" />
                                    <input type="reset" value="Reset" /></td>
                            </tr>
                        </table>
                    </form>
                </div>
            </div> 
        </div>
</div>
<div id="footer">HNEU</div>
</div>
</body>
</html>