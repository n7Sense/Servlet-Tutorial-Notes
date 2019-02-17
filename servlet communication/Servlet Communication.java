Servlet Communication
======================

Implementing total Business logic in single servlet is not good programming, if we do then we will face some problems
if any problem is occured then searhing the code inside the single servlet is very complex, 
and whenevr we are doing any small changes then we have to compile entire Servlet. this is one of the biggest problem

in order to overcome the problem, We can separate the business logic And we can implement the business logic in different servlet
After implementing the business logic in different servlet then how to Provide the communication between the servlet , 
if  we want to provide a communication between the servlet then we have to go for the servlet communication 
If you want to provide the communication between the two servlet then we should have to be go for RequestDispatcher interface.


we can do a 3-way to Inter-Servlet-Communication
	1. getServlet("ServletName")
	2. RequestDispatcher
	3. sendRedirect();

	RequestDispatcher
========================

1.Methods:

	To forward the current Servlet Result to other Servlet.
	public abstract void forward(ServletRequest paramServletRequest, ServletResponse paramServletResponse)
		throws ServletException, IOException;
	  
	We can include the other Pages Result into current servlet.
	public abstract void include(ServletRequest paramServletRequest, ServletResponse paramServletResponse)
	    throws ServletException, IOException;

2. To get RequestDispatcher object.		
		RequestDispatcher rd - paramServletRequest.getRequestDispatcher();

3. 	RegistrationServlet registrationServlet = getServletContext().getServlet("ServletClassName");

4. 	RequestDispatcher rd = request.getRequestDispatcher("RegisterServlet");
		rd.forward(req, resp);
		rd.include(req, resp);

		
