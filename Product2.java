package jdbcproject;
import java.sql.*; 
	import java.util.*;
	public class Product2{
		 public static void main(String a[]) 
		    { 
			 	@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
		        //Creating the connection 
		        String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
		        String user = "ora"; 
		        String pass = "akku"; 
		        System.out.println("Enter the product code");
		        int pCode=sc.nextInt();
		        Connection con=null; 
		        String sql="select * from PRODUCTS where PROD_CODE="+pCode;
		        try
		        { 
		            DriverManager.registerDriver(new oracle.jdbc.OracleDriver()); 
		  
		           
		            con = DriverManager.getConnection(url,user,pass); 
		  
		            Statement st = con.createStatement(); 
		            ResultSet result=st.executeQuery(sql);
		            
		          while(result.next()) {
		        	  System.out.println(result.getString("PROD_CODE") +":"+result.getString("PROD_NAME")+":"+result.getString("PROD_PRICE")+":"+result.getString("PROD_CATG"));
		          }
		        	  
		           
		        } 
		        catch(Exception ex) 
		        { 
		            System.err.println(ex); 
		        } 
		        finally {
		        	 
		        	try{
		        		con.close(); 
		        	}
		        	catch(SQLException e) {
		        		System.out.println(e);
		        	}
				}
		    } 
		} 



