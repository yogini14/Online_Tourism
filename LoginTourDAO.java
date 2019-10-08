import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class LoginTourDAO {
	 public static Connection getConnection(){  
	        Connection con=null;  
	        try{  
	            Class.forName("com.mysql.jdbc.Driver");  
	            con=DriverManager.getConnection("jdbc:Mysql://127.0.0.1:3306/tourism","root","password@123");  
	        }catch(Exception e){System.out.println(e);}  
	        return con;  
	    }  
	    public static int save(LoginTour e){  
	        int status=0;  
	        try{  
	            Connection con=LoginTourDAO.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "insert into login_details values (default,?,?,?,?,?)");  
	            ps.setString(1,e.getFullName());  
	            ps.setString(2,e.getEmail());  
	            ps.setString(3,e.getUserName());  
	            ps.setString(4,e.getPassword());  
	            ps.setString(5,e.getConfirm_Pwd());
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	    }  
}