import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegisteredLoginDao {
	 public static boolean validate(String userName, String password) {
		 boolean status=false;
	        try{  
	            Class.forName("com.mysql.jdbc.Driver");  
	            Connection con=DriverManager.getConnection("jdbc:Mysql://127.0.0.1:3306/tourism","root","password@123");    
	            PreparedStatement ps=con.prepareStatement(  
	                         "select * from login_details where userName=? and password=?");  
	            ps.setString(1,userName);  
	            ps.setString(2,password);  
	           ResultSet res=ps.executeQuery();
	           status=res.next();
	        
	        }
	        catch(Exception ex){System.out.println(ex);}  
	        return status;  
	    }  
}
