import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class saveservlet1
 */
@WebServlet("/saveservlet1")
public class saveservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public saveservlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	          
	        String fullname=request.getParameter("Full_Name");  
	        String email=request.getParameter("Email");  
	        String username=request.getParameter("UserName");  
	        String password=request.getParameter("Password");  
	        String confirm=request.getParameter("Confirm_Pwd"); 
	        
	        LoginTour e=new LoginTour();  
	        e.setFull_Name(fullname);  
	        e.setEmail(email);  
	        e.setUserName(username);  
	        e.setPassword(password);
	        e.setConfirm_Pwd(confirm);
	          
	        int status=LoginTourDAO.save(e);  
	        if(status>0){  
	            out.print("<p><h1>Record saved successfully!</h1></p>");  
	            request.getRequestDispatcher("Signin.jsp").include(request, response);  
	        }else{  
	            out.println("Sorry! unable to save record");  
	        }  
	          
	        out.close();  
	    }  
	  
	}  