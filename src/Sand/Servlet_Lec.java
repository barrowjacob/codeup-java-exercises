package Sand;

public class Servlet_Lec {

    // herein lies the servlet lecture
    // hold on to your pants


    // SERVLET is a java class that extends HttpServlet class from servlet library
    // SERVLET's most basic functionality is to handle http REQUEST and RESPONSE
    //  in order to use SERVLET, you need two things:
    //      --servlet library
    //      --web server that will interact on our behalf (tomcat)


    // TOMCAT::
    // web server
    // two types of web servers
    //      --software that runs the requests and responses
    //      --machine that the software runs on
    // other web servers: JBOSS, wildfly, nginx, iis web server, ibm websphere, glassfish
    // TOMCAT expects our application to be deployed as WAR (web archive) file
    // WAR has directory, which is diff than project directory
    //      --as such, you will need to know where files are located within WAR file


    // USING SERVLETS:
    // when creating a servlet:
    // 1) create a class that extends HttpServlet
    // 2) Annotate the class with @WebServlet annotation to specify which URL it maps to
    //      -- "/hello-word" etc
    // 3) implement a 'protected' doGet or doPost methods that accepts two parameters:
    //      -- HttpServletRequest and HttpServletResponse



}
