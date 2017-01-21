<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="local" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link href="<c:url value="/resources/style/style.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/style/bootstrap-theme.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/style/bootstrap.css" />" rel="stylesheet">
    <title>Show Reports</title>
</head>
<body>
<a href="/">
    <button class="btn-info">To main</button>
</a>
<div class="container panel">
    <table class="table table-striped" border="1" align="center">
        <thead class="text-center">
        <tr>
            <th><strong>Report Id</strong></th>
            <th><strong>Start Date</strong></th>
            <th><strong>End Date</strong></th>
            <th><strong>Performer</strong></th>
            <th><strong>Activity</strong></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${viewReport}" var="view">
            <tr>
                <td>${view.reportId}</td>
                <td>${view.startDate}</td>
                <td>${view.endDate}</td>
                <td>${view.performer}</td>
                <td>${view.activity}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
