Listener :
=============
Listener are autometically by activated by servlet container.


	HttpServletListener
===========================	

1. Listener classes are Listen.
	using the Listener class we can find out,how many clients are connected to the server

	example

	public class MyListener implements HttpServletListener{

		static int userCount;

		@Override
		public void sessionCreted(HttpSessionEvent hse){
			userCount++;
		}

		@Override
		public void sessionDestroyed(HttpSessionEvent hse){
			userCount--;
		}

		public static int getUserCount(){
			return userCount;
		}
	}



interface	ServletContextListener
=======================================
How much time time our application is available at server

	public void contextInitialized(ServletContextEvent e)

	public void contextDestroyed(ServletContextEvent e)	


	How to Configure Listener.? in web.xml file
================================================
Listener are autometically by activated by servlet container.
where container identified the <listener> tag then the container autometically activate listener.

web.xml
+++++++++++

<web-app>
	<listener>
		<listener-class>MyContextLoaderListener</listener-class>
	</listener>
</web-app>


	ServletSessionListener
===============================
when we create an session object interbally it session listener execute opening and closing session the event is gnerated.



	RequestListener
=======================
request listener to handle and mentain request object.

