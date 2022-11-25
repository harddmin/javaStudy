package com.oraclejava.day4.day;

import java.util.Calendar;

public class NowTest {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int am_pm = cal.get(Calendar.AM_PM);
		
		System.out.print(year +"/"+ month + "/" + day +" "+ (am_pm == 0 ? "오전" : "오후") + " " + minute + ":" + second );
		
		
        
//	    System.out.print(am_pm+" "+hourOfDay + ":" + minute + ":" + second);
		
		
		
		
		
		
		

}
}