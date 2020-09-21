package ZestIot;


public class SQL_Queries 
{

public static String strQuery_20 = "SELECT logid, flightnumber, sta, eta, ata FROM `DailyFlightScheduleArrival_GMR`where (date(sta)= '2020-02-05' or date(mediator_sta)='2020-02-05') and operationunit=4 and sensor_ata is null";
	//Total flights scheduled arrival for Delhi
public static String strQuery_025="SELECT count(*) FROM `DailyFlightScheduleArrival_GMR`where (date(sta)= '2020-02-05' or date(mediator_sta)='2020-02-05') and operationunit= 22";
		
public static String strquery_001="SELECT logid,flightnumber,toairport FROM `DailyFlightScheduleDeparture_GMR` where toairport is null";
public static String strquery_002="";
}
