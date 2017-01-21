<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link href="<c:url value="/resources/style/style.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/style/bootstrap-theme.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/style/bootstrap.css" />" rel="stylesheet">
    <title>Main_page</title>
</head>
<body>
<div class="container">
    <div class="well col-lg-3 col-md-offset-4">
        <p class="text-center">Show reports</p>
        <c:if test="${not empty error}">
            <p class="text-center" style="color: #cc0000">
                    ${error}
            </p>
        </c:if>
        <form:form action="show-reports" commandName="report" method="post">
            <form:input cssClass="form-control" path="startDate" placeholder="Start date:"/>
            <form:input cssClass="form-control" path="endDate" placeholder="End date:"/>
            <form:select path="performer" class="form-control" size="1">
                <option selected value="all-performers">All Performers</option>
            </form:select>
            <form:select path="timePeriod" class="form-control" size="1">
                <option selected disabled>Time Period:</option>
                <option value="last-qtr">Last Qtr</option>
                <option value="last-month">Last Month</option>
                <option value="last-calendar-year">Last Calendar Year</option>
                <option value="current-year-to-date">Current Year to Date</option>
                <option value="current-qtr-to-date">Current Qtr to Date</option>
                <option value="current-month-to-date">Current Month to Date</option>
            </form:select>
            <button class="btn btn-primary btn-block" type="submit" value="">
                Submit
            </button>
        </form:form>
    </div>
</div>
</body>
</html>
