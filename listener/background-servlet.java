	Background Thread for a Tomcat servlet app [duplicate]
=============================================================


If you want to start a thread when your WAR is deployed, you can define a context listener within the web.xml:

<web-app>
    <listener>
       <listener-class>com.mypackage.MyServletContextListener</listener-class>
    </listener>
</web-app>
Then implement that class something like:

public class MyServletContextListener implements ServletContextListener {

    private MyThreadClass myThread = null;

    public void contextInitialized(ServletContextEvent sce) {
        if ((myThread == null) || (!myThread.isAlive())) {
            myThread = new MyThreadClass();
            myThread.start();
        }
    }

    public void contextDestroyed(ServletContextEvent sce){
        try {
            myThread.doShutdown();
            myThread.interrupt();
        } catch (Exception ex) {
        }
    }
}