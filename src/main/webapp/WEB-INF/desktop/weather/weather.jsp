<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>form.jsp</title>
</head>
<body>
	<hr>
	<h1>날씨 정보 조회 결과</h1>
	<hr>
	${requestScope.weather.current.temperature}<br>
<%-- 	${RequestScope.weather.current.temperature}<br> --%>
<%-- 	${RequestScope.weather.current.skycode}<br> --%>
<%-- 	${RequestScope.weather.current.skytext}<br> --%>
<%-- 	${RequestScope.weather.current.date}<br> --%>
<%-- 	${RequestScope.weather.current.observationtime}<br> --%>
<%-- 	${RequestScope.weather.current.observationpoint}<br> --%>
<%-- 	${RequestScope.weather.current.feelslike}<br> --%>
<%-- 	${RequestScope.weather.current.humidity}<br> --%>
<%-- 	${RequestScope.weather.current.winddisplay}<br> --%>
<%-- 	${RequestScope.weather.current.day}<br> --%>
<%-- 	${RequestScope.weather.current.shortday}<br> --%>
<%-- 	${RequestScope.weather.current.windspeed}<br> --%>
<!-- <!-- 	forecast --> -->
<%-- 	${RequestScope.weather.forecasts[1].low}<br> --%>
<%-- 	${RequestScope.weather.forecasts[1].high}<br> --%>
<%-- 	${RequestScope.weather.forecasts[1].skycodeday}<br> --%>
<%-- 	${RequestScope.weather.forecasts[1].skytextday}<br> --%>
<%-- 	${RequestScope.weather.forecasts[1].date}<br> --%>
<%-- 	${RequestScope.weather.forecasts[1].day}<br> --%>
<%-- 	${RequestScope.weather.forecasts[1].shortday}<br> --%>
<%-- 	${RequestScope.weather.forecasts[1].precip}<br> --%>

</body>
</html>