	JSP
==========

JavaServer Pages (JSP) technology provides a simplified, fast way to create dynamic web content. 
JSP technology enables rapid development of web-based applications that are server- and platform-independent.
The JSP Standard Tag Library (JSTL) is a collection of tag libraries that implement general-purpose functionality 
common to many Web applications. 
JSP, a specification of Sun Microsystems, first appeared in 1998. The official versions, 1.0 and 1.1, both appeared in 1999, 
Internally, each JSP page is actually converted into a servlet by the server

	Drawbacks of Servlet technology
	--------------------------------	
		1. Whenever we are developing the Servlet must have we shuld congigure that into web.xml, asume that 100 Servlet are 
		there in aour application, then all 100 Servlet we have to configure into web.xml file un-necessolry incresing the time
		of developer.

		2. Whenever we are modifing the Servlet must and shuld we need to stop the Server and we need to compile the Servlet
			once again redeployethe application inside the server and restart the server.

		3. Servlets are allowed by the only Java Code. but not Text-&-Html

		4. Whenever we are using the Servlet, presenting the data is very slow.
			in order to overcome this problem we shuld go for JSP.

	Advantages Of JSP
	------------------
		1. no need to congigure inside web.xml.
		2. presenting the data is very fast. compare to Servlet.
		3. when modify, no need to Stop and Re-Start the server.
		4. JSP pages allowed by the HTML code and Textual code and Java Code also.

	Rules Of JSP
	--------------
	1. Whenever developing jsp page must and shuld extension .jsp.
	2. after developing JSP page must and shuld we need to place inside the Application Scope.


	JSP Element
	===========
	categoried in 3 types.

	1. Scripting Element
		scripting element are categoried into 3-types
			a. Declearative Element
			b. Scriptlet
			c. Expression element

	2. Directives in jsp
			a. Page Directive
			b. include Directive
			c. Taglib Directive

	3.JSP Action Tags
			i. Jsp Pre-Defiend Action Tags {
				1. Forward Action Tag
				2. Include Action Tag
				3. Param Action Tag
				4. useBing Action Tag
				5. setProperty action tag.
				6. getProperty acton tag
				etc.
			}

			ii. Custom Tags.



		
<%@ page 	imort="" %> Import Element

<%! %> Declearative Element

<% %>  Scriptlet Element

	3-Tire Application In JSP
================================
if our Application Logic execute with 3-different application is called 3-tier application.
e.g: 
1. Html (Which contain form element)
2. Jsp( contain business logic and  DataBase Connection )
3. after the jsp container persist the data into DataBase (e.g, MySql, Oralce, MongoDb)
	hence, according to statement 1,2,3 we can defie 3-tier application.

