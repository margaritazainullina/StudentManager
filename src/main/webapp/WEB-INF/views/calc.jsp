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

                        <form:form method="POST" action="calc" commandName="data" class="form">
                            <table>
                                <tr>
                                    <td>a&nbsp;=</td>
                                    <td colspan="3"><form:input path="a" size="30px"/></td>
                                </tr>
                                <tr>
                                    <td>b&nbsp;=</td>
                                    <td><form:input path="b"  size="30px"/></td>
                                </tr>
                                <tr>
                                    <td><input type="submit" name="add" value="+" /></td>
                                    <td><input type="submit" name="minus" value="-" /></td>
                                </tr>
                                <tr>
                                    <td><input type="submit" name="multiply" value="*" /></td>
                                    <td><input type="submit" name="divide" value="/" /></td>
                                </tr>
                                <tr>
                                    <td><input type="submit" name="multiply" value="log" /></td>                                    
                                </tr>

                            </table>  
                        </form:form>

                        <tr>
                            <td>${data.result}</td>   
                        </tr>
                        <br/>                                                
                    </div>
                </div>              
            </div>
            <div id="footer">HNEU</div>
        </div>
    </body>
</html>