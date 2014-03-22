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
                     <li><a href="service/calc">Calc</a></li>
                    <li><a href="<c:url value="/logout" />">
                            <spring:message code="label.logout" />
                        </a></a></li>
                </ul>
            </div>
            <div id="navtoplistline">&nbsp;</div>

            <div id="contentwrapper">
                <div id="maincolumn">
                    <div class="text">
                        <h2><spring:message code="label.addstudents" /></h2>
                        <form:form method="post" action="add/student" commandName="student" class="form">
                            <table>
                                <tr>
                                    <td><form:label path="firstname">
                                            <spring:message code="label.firstname" />
                                        </form:label></td>
                                    <td><form:input path="firstname" /></td>
                                    <td><span class="error" id="firstnameerror" /></td>
                                </tr>
                                <tr>
                                    <td><form:label path="lastname">
                                            <spring:message code="label.lastname" />
                                        </form:label></td>
                                    <td><form:input path="lastname" /></td>
                                    <td><span class="error" id="lastnameerror" /></td>
                                </tr>
                                <tr>
                                    <td><form:label path="email">
                                            <spring:message code="label.email" />
                                        </form:label></td>
                                    <td><form:input path="email" /></td>
                                    <td><span class="error" id="telephoneerror" /></td>
                                </tr>                
                                <tr>
                                    <td><form:label path="telephone">
                                            <spring:message code="label.telephone" />
                                        </form:label></td>
                                    <td><form:input path="telephone" /></td>
                                </tr>
                                <tr>
                                    <td><form:label path="about">
                                            <spring:message code="label.about" />
                                        </form:label></td>
                                    <td><form:input path="about" /></td>
                                </tr>
                                <tr>
                                    <td><form:label path="group.groupId">
                                            <spring:message code="label.groupid" />
                                        </form:label></td>
                                    <td><form:input path="group.groupId" /></td>
                                </tr>
                                <tr>
                                    <td colspan="2"><input type="submit"
                                                           value="<spring:message code="label.addstudents"/>" /></td>
                                </tr>
                            </table>
                        </form:form>
                        <br/>
                        <h2><spring:message code="label.students" /></h2>
                        <c:if test="${!empty studentList}">
                            <table class="data">
                                <tr>
                                    <th><spring:message code="label.firstname" /></th>
                                    <th><spring:message code="label.email" /></th>
                                    <th><spring:message code="label.telephone" /></th>
                                    <th><spring:message code="label.about" /></th>
                                    <th><spring:message code="label.group" /></th>
                                    <th><spring:message code="label.speciality" /></th>
                                    <th>&nbsp;</th>
                                </tr>
                                <c:forEach items="${studentList}" var="student">
                                    <tr>
                                        <td>${student.lastname} ${student.firstname}</td>
                                        <td>${student.email}</td>                        
                                        <td>${student.telephone}</td>
                                        <td>${student.about}</td>
                                        <td>${student.group.groupName}</td>
                                        <td>${student.group.speciality.speciality}</td>
                                        <td><a href="delete/student/${student.studentId}"><spring:message code="label.delete" /></a></td>
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