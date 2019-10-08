import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BookingDao {
	 public static Connection getConnection(){  
	        Connection con=null;  
	        try{  
	            Class.forName("com.mysql.jdbc.Driver");  
	            con=DriverManager.getConnection("jdbc:Mysql://127.0.0.1:3306/tourism","root","password@123");  
	        }catch(Exception e){System.out.println(e);}  
	        return con;  
	    }  
	    public static int save(bookingAttri b){  
	        int status=0;  
	        try{  
	            Connection con=BookingDao.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "insert into booking_details values (default,?,?,?,?,?,?,?)");  
	            ps.setString(1,b.getCustName());  
	            ps.setString(2,b.getPackName());  
	            ps.setString(3,b.getCheckIn());  
	            ps.setString(4,b.getCheckOut());  
	            ps.setString(5,b.getAdults());
	            ps.setString(6,b.getChildren());
	            ps.setString(7,b.getPhoneNo());

	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	    }  
}
