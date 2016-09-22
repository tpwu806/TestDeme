package test2015dowm.data;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {

	public static void main(String[] args) {
		String s = "2005-05-10 23:14:71.0";
		System.out.println("s"+s);
		Timestamp ts = Timestamp.valueOf(s);
		System.out.println("ts"+ts);
		String str=setAsText(ts);
		System.out.println("str"+str);

	}
	
	
	
	
	public static String setAsText(Timestamp value){
		
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(value);
	}

}