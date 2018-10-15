	
	Servlet
	   |
	   |
	GenericServlet
		|
	    |
	HttpServlet
		|
	    |
	 Our Servlet


	 HttpServlet
======================
1.	to overcome the security problem with  GenericServle we shuld go for HttpServlet.
2.	public abstract class HttpServlet  extends GenericServle

 Methods:
 
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException
  
  protected void doHead(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException
  
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException

  protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
  
  protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
  
  protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
  
  protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException

  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException

  public void service(ServletRequest req, ServletResponse res)  throws ServletException, IOException
