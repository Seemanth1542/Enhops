package ZestIot;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Database 
{
	
	
	public static void tc001() throws SQLException {
		String totalflight=null;
		ResultSet result=DBWrapper.Connect(SQL_Queries.strQuery_20, "prod");
		 while(result.next())
		 {
		  
		    ArrayList<String> logid = new ArrayList<String>();
		    ArrayList<String> flightnumber=new ArrayList<String>();
		    ArrayList<String> sta=new ArrayList<String>();
		    ArrayList<String> eta=new ArrayList<String>();
		    ArrayList<String> ata=new ArrayList<String>();
		   
		   String str_logid=result.getString("logid");
			String str_flightnumber=result.getString("flightnumber");
			String str_sta=result.getString("sta");
		   String str_eta=result.getString("eta");
			String str_ata=result.getString("ata");
			
			logid.add(str_logid);
			flightnumber.add(str_flightnumber);
			sta.add(str_sta);
			eta.add(str_eta);
			ata.add(str_ata);
			System.out.println(logid);
			System.out.println(flightnumber);
			System.out.println(sta);
			System.out.println(eta);	
	    }
		 
	}
		 public static void tc002() throws SQLException {
				String totalflight=null;
				ResultSet result=DBWrapper.Connect(SQL_Queries.strquery_001, "prod");
				 while(result.next())
				 {
				  
				    ArrayList<String> logid = new ArrayList<String>();
				    ArrayList<String> flightnumber=new ArrayList<String>();
				    ArrayList<String> toairport=new ArrayList<String>();
				   
				   
				   String str_logid=result.getString("logid");
					String str_flightnumber=result.getString("flightnumber");
					String str_toairport=result.getString("toairport");
				 
					
					logid.add(str_logid);
					flightnumber.add(str_flightnumber);
					toairport.add(str_toairport);
					
					System.out.println(logid);
					System.out.println(flightnumber);
					System.out.println(toairport);
						
			    }
				 
	}
	public static void main(String args[]) throws Exception
	{
		Database.tc002();
		DBWrapper.dbConnectionClose();
	}
}
