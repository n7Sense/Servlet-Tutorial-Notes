
	Servlet Container
==========================
	1.	usually we can said Tomcat Container or Tomcat Servlet Container.
	2. 	Servlet Container (e.g suppose Tomcat Container).
		when we startthe Container then Container will read all WAR file, mean it will extract WAR file into 
		webapp folder. that is called deployement.
	3.	After deployement, Container will read web.xml file after read it will create 2 OBJECT i.e
			i. ServletContext 
			ii. ServletConfig

	4. aour one specific project Container create 2 Object after deployement.
		
	5. if i have to to share the my some Object to all Servlet class then that object are stored in ServletContext.
		it is an public area or public scope, 
		example: like our Database Connection configurtion object.

	6. for each Application Container create the separate ServletContext object.

	7. for each user define Servlet class, Container will create a PRIVATE area that area is called ServletConfig
			Object
	8. for each Servlet class container will create the separate ServletConfig object.
		suppose we have 10-Servlet class then container will create 10- ServletConfig object.

	Example:

	<web-app>

		<servlet>
			<servlet-name>employee</servlet-name>
			<servlet-class>EmployeeController</servlet-class>

			<init-param>
				<param-name>data1</param-name>
				<param-value>500000</param-value>
			</init-param>
		</servlet>


		<servlet>
			<servlet-name>department</servlet-name>
			<servlet-class>DpartmentController</servlet-class>
			<init-param>
				<param-name>data2</param-name>
				<param-value>456</param-value>
			</init-param>
		</servlet>


		<context-param>
			<param-name>data3</param-name>
			<param-value>6895</param-value>
		</context-param>

	</web-app>

	we can see the above example the data1 and data2 is created inside ServletConfig because it is only available to
	specified Servlet Controller, hence we can say that the init() methods are use to create object inside ServletConfig.

	But in "context-param" we can easily say that this is available to all servelet inside the specific Application,
	hence we can say that this object is created inside the ServletContext.

	+---------------------------------------------------------------------------+-----------------+
	|			MyApplication.war							Tomcat Container    |				  |							
	|																			|				  |	
	|																			|				  |
	|				MyApplication												|				  |					
	|					|														|				  |
	|					|---------> src 										|				  |
	|					|---------> src 										|				  |
	|					|---------> src 										|				  |
	|					|														|				  |
	|					|---------> WEB-INF										|				  |
	|					|			   |										|				  |	
	|					|			   |------> classes 						|				  |
	|					|			   |			|							|ServletContext	  |
	|					|			   |			|--->A.class ServletConfigA |				  |
	|					|			   |			|			 	 			|	Object		  |
	|					|			   |			|--->B.class ServletConfigB	|				  |
	|	 				|			   |            |							|				  |
	|					|			   |			|--->C.class ServletConfigC	|				  |
	|					|			   |										|				  |
	|					|			   |-------> lib							|				  |
	|					|														|				  |
	|					|														|				  |		
	|					|---------->html										|				  |
	|					|---------->jsp											|				  |
	|					|---------->css 										|				  |
	|					|---------->js 											|				  |
	|																			|				  |
	|																			|				  |
	|																			|				  |
	+---------------------------------------------------------------------------+-----------------+

	Garbage are responsible for Object, but not any resources, like FileOpen, Connection etc.