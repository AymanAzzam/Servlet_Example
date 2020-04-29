import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Numbers extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException {
	/**************** Parameters Declaration and Get Parameters from the request ***************/
        Integer num1 = Integer.parseInt(request.getParameter("num1"));
        Integer num2 = Integer.parseInt(request.getParameter("num2"));
	boolean add = request.getParameter("addition") != null && request.getParameter("addition").equals("on");
	boolean mul = request.getParameter("multiplication") != null && request.getParameter("multiplication").equals("on") ;	
	String page = null;
	
	/************* Set Content Type to HTMl *****************/
	response.setContentType("text/html");
        
	/*************** Logic **********************/
	page = page = "<!doctype html> <html> <body> ";
	if(add)
		page += "<h1>" + Integer.toString(num1) + " + " +  Integer.toString(num2) + " = " + Integer.toString(num1+num2) + " </h1> ";
	if(mul)
		page += "<h1>" + Integer.toString(num1) + " * " +  Integer.toString(num2) + " = " + Integer.toString(num1*num2) + " </h1> ";
	page += " </body></html>" ;
	
	/*************** Write the response **************/
	response.getWriter().println(page);
    }

}
