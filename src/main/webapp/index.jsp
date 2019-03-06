<%@ page contentType="text/xml; charset=UTF-8" %>
<%@ page import="com.perfist.test1.SoapToXmlBacking" %>
<%@ page session="false"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%
    SoapToXmlBacking soapToXmlBacking = new SoapToXmlBacking();
    request.setAttribute("context", soapToXmlBacking.getResult());
%>
${context}
