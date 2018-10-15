	GenericServlet
=====================

1.	We no need to implements the all the life-cycle methods, we just have ti provide the implementation of 
	service() methods
2. 	public abstract class GenericServlet extends java.lang.Object implements Servlet, ServletConfig, java.io.Serializable

3.	Defines a generic, protocol-independent servlet, can work with , FTP, TCP, SMTP, etc.

4. 	not providing the security for the data. data can be display on the address-bar very clearly.

3. Dynamic Web Page;
	a page which is created by Servlet-Container is called Dynamic web page

	example:

		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
			System.out.println("We Are in service methods");
			PrintWriter pw = res.getWriter();
			pw.println("<html>");
			pw.println("<head><h1>NSense</h1></head>");
			pw.println("<body bgcolor='yellow'>");
			pw.println("<marquee><h1>nSense</h1></marquee>");
			pw.println("</body>");
			pw.println("</html>");
			pw.close();
		}

		by the above example the page is produced by Servlet-Container: