Scripting element
==================
	a. Declearative Element{
		to declare Veriables and Methods use this element.

		Syntax: 
		<%! Declare the instance veriable and methods %>

		Example:
		<%! int count = 0;
			
			void method(){

			}
		%>
	}

	b. Scriptlet Element{
		if you want to write any business logic like servive() methods in servlet, we can write
			business logic inside Scriptlet Element.

		Sysntax: <% 
						public void doGet(request, response){}
						public  void doPost(request, response){}
					%>
		Example:
		<%
			int empSal = Integer.parseInt(request.getParameter("empSal"));
			int netSal = Integer.parseInt(request.getParameter("netSal"));
			String empid = request.getParameter("empId");
			String firstName = request.getParameter("firstName");
			int result  = empSal+netSal;
		%>
		NOTE: in jsp the "request" is implicit (i.e this kind of object autometically available to JSP page) object.

	}

	c. Expression Element{
		using this element, we can print the RESULT, the RESULT of business-logic will be pronted by this Expression Element

		Syntax: 	<%= expression  %>

		Example:	<%= empSal+netSal %>
							OR
					<%= result %>
					
					NOTE: do not put semicolon ';'		
	}				


	Hirarchey
	==========

	JspApplication
		  |
		  |
		  |-----------------> src
		  |
		  |-----------------> WEB-INF
		  |						|	
		  |						|---------> classes
		  |						|
		  |						|---------> lib	
		  |						|
		  |						|----------> web.xml	
		  |						
		  |
		  |
		  |-----------------> JSP pages  (the jap present in Application Scope i.e the root-folder)
		  	

	Steps:

		step-1: create project that directoory structure follow same like the above Hirarchey.
		step-2: create jsp pages.
		step-3: deploye Project into Tomcat Server (i.e put project into tomcat/webapp/ folder)
		step-4: start the Server
		step:5: Make Request (e.g http://localhost:8080/JspApplication/result.jsp) in browser
		step-6: print the Result. on webpage