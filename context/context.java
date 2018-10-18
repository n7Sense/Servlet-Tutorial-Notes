	Context
================
	Servlet class can read data from WEB.XML file by Context and Config.

1. using Context and Config param we can read data from web.xml

2. to Pass Dynamic input we can use Context and Config parameter inside web.xml

ServletConfig interfce return ServletContext Object
	
	public init(ServletConfig config){	

	}

	If we want to share connection properties to all servlet then 


<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://java.sun.com/xml/ns/javaee" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd" id="WebApp_ID" version="3.0">
  <display-name>ServletDBLog4jExample</display-name>

  <welcome-file-list>
    <welcome-file>login.html</welcome-file>
  </welcome-file-list>

  <context-param>
    <param-name>dbUser</param-name>
    <param-value>pankaj</param-value>
  </context-param>

  <context-param>
    <param-name>dbPassword</param-name>
    <param-value>pankaj123</param-value>
  </context-param>

  <context-param>
    <param-name>dbURL</param-name>
    <param-value>jdbc:mysql://localhost:3306/UserDB</param-value>
  </context-param>

  <context-param>
    <param-name>log4j-config</param-name>
    <param-value>WEB-INF/log4j.xml</param-value>
  </context-param>
  
  <error-page>
    <error-code>404</error-code>
    <location>/AppErrorHandler</location>
  </error-page>

  <error-page>
    <exception-type>java.lang.Throwable</exception-type>
    <location>/AppErrorHandler</location>
  </error-page>
  
  <filter>
    <filter-name>AuthenticationFilter</filter-name>
    <filter-class>com.journaldev.servlet.filters.AuthenticationFilter</filter-class>
  </filter>

  <filter-mapping>
    <filter-name>AuthenticationFilter</filter-name>
    <url-pattern>./</url-pattern>
  </filter-mapping>
  
</web-app>
