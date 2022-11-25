package com.oraclejava.day4.day;

public class MathTest {

	public static void main(String[] args) {
		//절대값
	    System.out.println(Math.abs(-5));
	    //절상, 절삭
	    System.out.println(Math.ceil(7.99));
	    System.out.println(Math.ceil(1.05));
	    
	    System.out.println(Math.floor(7.99));
	    System.out.println(Math.floor(1.05));
	    
	    //반올림(사사오입)
	    System.out.println(Math.round(7.99));
	    System.out.println(Math.round(1.05));
	    
	    //PI
	    System.out.println(Math.PI);
	    //E
	    System.out.println(Math.E);

	    
	    //1.7 ==> 2(절상)
	    
	   System.out.println(Math.ceil(1.7));
	   System.out.println(Math.ceil(1.1));
	   
	   //어떤 아르바이트 직원의 일일 평균 근무 시간은 25.6 시간이었다.
	   //반올림해서 출력
	   
	   double hour = 25.6;
	   System.out.println(Math.round(hour));
	   
	   //추신수 선수의 2022년 타율이 0.279 였다.
	   //소수점 3자리에서 절삭하여라. -->0.27
	   
	   double avg = 0.279;
	   System.out.println(Math.floor(avg*100)/100);
	   
	   
	   
	   
	   
	   
	   
	   
	}

}
