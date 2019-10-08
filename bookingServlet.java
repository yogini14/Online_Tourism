

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class bookingServlet
 */
@WebServlet("/bookingServlet")
public class bookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bookingServlet() {
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
	          
	        String custnm=request.getParameter("CustName");  
	        String PackName=request.getParameter("PackName");  
	        String Check_In =request.getParameter("CheckIn");  
	        String check_out=request.getParameter("CheckOut");  
	        String adults=request.getParameter("Adults"); 
	        String children=request.getParameter("Children"); 
	        String Ph_Number=request.getParameter("PhoneNo"); 
	        
	        bookingAttri b=new bookingAttri();  
	        b.setCustName(custnm);  
	        b.setPackName(PackName);  
	        b.setCheckIn(Check_In);  
	        b.setCheckOut(check_out);
	        b.setAdults(adults);
	        b.setChildren(children);
	        b.setPhoneNo(Ph_Number);
	        int status=BookingDao.save(b);  
	        if(status>0){  
	            out.print("<p><h1>Booked successfully</h1></p>"); 
	            out.print("<Button><a href="
	            		+ "https://p-y.tm/Tz-AZwA/>Pay Now</a></Button>");
	            //request.getRequestDispatcher().forward(request, response);  
	        }else{  
	            out.println("Sorry! unable to book");  
	        }  
	          
	        out.close();  
	    }  
	  
	}  
	
