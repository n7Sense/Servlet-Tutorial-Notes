	Filter
=============

1. Before sending my form data i can do validation. i can add validation with the help of Filter
2. while sending out/put from Servlet, i can add modify my Dynamic page with the help of filter
3.Methods:
		
		public void init(FilterConfig config)
			init() method is invoked only once. It is used to initialize the filter.

		public void doFilter(HttpServletRequest request,HttpServletResponse response, FilterChain chain)
			doFilter() method is invoked every time when user request to any resource, to which the filter is mapped.It is used to perform filtering tasks.
			If you get invalid form dat we can directly respond ERROR message to server from the filter, no need to execute the Servlet.

		public void destroy()	
		This is invoked only once when filter is taken out of the service.

4. Filter execute 2 times, before Servlet execution and after Servlet execution., but servlet execute only one time.
