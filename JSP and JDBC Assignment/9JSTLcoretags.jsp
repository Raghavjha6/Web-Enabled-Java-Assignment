<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSTL Core Tags Demo</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 30px; background: #f0f8ff; }
        h2 { color: #0066cc; }
        .block { background: #fff; padding: 15px; border-radius: 10px;
                 box-shadow: 0 0 5px #ccc; margin-bottom: 20px; }
    </style>
</head>
<body>
<h2>JSTL Core Tags Demonstration</h2>
<div class="block">
    <h3>1. c:set & c:out</h3>
    <c:set var="name" value="John Doe" />
    <p>Welcome, <c:out value="${name}" />!</p>
</div>
<div class="block">
    <h3>2. c:if</h3>
    <c:set var="age" value="20" />
    <c:if test="${age >= 18}">
        <p>✔ You are eligible to vote. (Age: ${age})</p>
    </c:if>
</div>
<div class="block">
    <h3>3. c:choose, c:when, c:otherwise</h3>
    <c:set var="marks" value="65" />
    <c:choose>
        <c:when test="${marks >= 75}">Grade: A</c:when>
        <c:when test="${marks >= 50}">Grade: B</c:when>
        <c:otherwise>Grade: C</c:otherwise>
    </c:choose>
</div>
<div class="block">
    <h3>4. c:forEach</h3>
    <c:set var="fruits" value="${['Apple','Banana','Cherry']}" />
    <ul>
        <c:forEach var="fruit" items="${fruits}">
            <li>${fruit}</li>
        </c:forEach>
    </ul>
</div>
<div class="block">
    <h3>5. c:forTokens</h3>
    <c:forTokens var="city" items="Delhi,Mumbai,Kolkata,Chennai" delims=",">
        <p>City: ${city}</p>
    </c:forTokens>
</div>
<div class="block">
    <h3>6. c:catch</h3>
    <c:catch var="error">
        ${5 div 0}
    </c:catch>
    <p>Error: <c:out value="${error}" default="No error occurred" /></p>
</div>
<div class="block">
    <h3>7. c:import</h3>
    <c:import url="https://www.example.com" var="data" />
    <p>Imported content length: <c:out value="${fn:length(data)}" /></p>
</div>
<div class="block">
    <h3>8. c:param (with c:url)</h3>
    <c:url var="searchUrl" value="https://www.google.com/search">
        <c:param name="q" value="JSTL tutorial" />
    </c:url>
    <a href="${searchUrl}" target="_blank">Search JSTL on Google</a>
</div>
<div class="block">
    <h3>9. c:redirect</h3>
    <%-- <c:redirect url="https://www.google.com" /> --%>
    <p>(Redirect example commented to prevent actual navigation.)</p>
</div>
<div class="block">
    <h3>10. c:remove</h3>
    <p>Before removing: <c:out value="${name}" /></p>
    <c:remove var="name" />
    <p>After removing: <c:out value="${name}" default="(Removed Successfully)" /></p>
</div>
</body>
</html>