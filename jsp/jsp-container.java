JSP CONTAINER
==============

To run dynamic web pageswe required JSp Container .

			
				JSP PAGES 																Declarative
					|													++++++++++++++++++++++++++++++++++++++++
					|load into Container 					|-----------|	<%! jspInit(); jspDestroy(); %>		| 
					|										|			++++++++++++++++++++++++++++++++++++++++
			+++++++++++++++++++++							|	
			| 	JSP Container 	|-------------------------->|
			+++++++++++++++++++++							|						Scriptlet
					|										|			+++++++++++++++++++++++++++++++++++++++++
					|convert to Servlet java page 			|---------->|	<%			jspService();		%>	|
					|										|			+++++++++++++++++++++++++++++++++++++++++
				Jsp_Servet.java								|
					|										|
					|compile java sorce into byte code.		|						expression
					|										|			 ++++++++++++++++++++++++++++++++++++++++
				Jsp_Servlet.class 							|----------->|	<% = out.println(){ dynamic }   %>	|
																		 ++++++++++++++++++++++++++++++++++++++++


Built In Object In JSP
=======================
	
	request
	response
	session
	context
	page
	Exception
	out
	config
	page Context
	


