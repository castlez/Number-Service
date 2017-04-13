import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Values extends HttpServlet{
	public int value = 0;

	@Override 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException {

		// Set the response MIME type of the response message
		//response.setContentType("text/html");
		// Allocate a output writer to write the response message into the network socket
		PrintWriter out = response.getWriter();

		try{
			out.println(value);
			out.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException {
		String v = request.getParameter("value");
		this.value += Integer.parseInt(v);
	}
}