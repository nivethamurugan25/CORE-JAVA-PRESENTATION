package busticketbooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class CrudOperations {
	
	    private void insert() {
		try{ Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketbooking","root","Nivethamurugan@25"); 
		Statement st=con.createStatement(); 
		int result=st.executeUpdate("insert into passangerdetails values('Niya','Female','niya@gmail.com','Kallada','Hyderabad','Pune','11:00AM','2022-10-2',2,500)");
		if(result==0)
		{
			System.out.println("Data is not Inserted");
		}
		else
		{
			System.out.println("Data is Inserted");
		}
		} 
		catch(Exception e)
		{ 
			System.out.println(e.toString());
		}
	    }
	
	  private void read() {
		   try{ Class.forName("com.mysql.jdbc.Driver");
		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketbooking","root","Nivethamurugan@25"); 
		   Statement st=con.createStatement(); 
		   ResultSet rs=st.executeQuery("select * from passangerdetails");
		   while(rs.next())
		   {
		        System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)); 
		   } 
		   } 
			catch(Exception e)
			{ 
				System.out.println(e.toString());
			}
			   }
	 
	  private  void update() {
		   try{ Class.forName("com.mysql.jdbc.Driver");
		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketbooking","root","Nivethamurugan@25"); 
		   Statement st=con.createStatement(); 
		   int result=st.executeUpdate("update passangerdetails set TravelsName='SKPN' where Name='Gnanu'");
		   if(result==0)
			{
				System.out.println("Data is not Updated");
			}
		   else
			{
				System.out.println("Data is Updated");
			}
			} 
				
			catch(Exception e)
			{ 
			    System.out.println(e.toString());
			}
		    }
	
	  private void delete() {
			try{ Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketbooking","root","Nivethamurugan@25"); 
			Statement st=con.createStatement(); 
			int result=st.executeUpdate("delete from passangerdetails where Time='1:00PM'");
			if(result==0)
			{
				System.out.println("Data is not Deleted");
			}
		   else
			{
				System.out.println("Data is Deleted");
			}
			} 
			catch(Exception e)
			{ 
				System.out.println(e.toString());
			}
		    }
	
	

	public static void main(String[] args) {
		
		  
		 Scanner sc=new Scanner(System.in);
		   System.out.println("Select an option");
		   int a=sc.nextInt();
		  CrudOperations co=new CrudOperations();
		   switch(a) {
		   case 1:
			     System.out.println("insert");
		         co.insert();
		         break;
		   case 2:
		         System.out.println("update");
		         co.update();
		         break;
		   case 3:
		         System.out.println("read");
		         co.read();
		         break;
		   case 4:
		         System.out.println("delete");
		         co.delete();
		         break;
		  default:
			     System.out.println("please select the correct option");
		         break;
		         
		   }
	     	}
	}
