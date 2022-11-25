package com.oraclejava.day5;

import java.net.MalformedURLException;
import java.net.URL;

public class ExTest4 {

	public static void main(String[] args) {
		// 나이를 입력받아 19세 미만이면 예외가 발생
		// 예외 메세지: "당신은 맥주를 사서 마실 수 없습니다."
		
      try {
    	  URL url = new URL("www.yahoo.co.kr");
    	  
      } catch (MalformedURLException e) {
    	  System.out.println("--- Exception 발생 구문 ----");
    	  System.out.println("예외 발생 정보:" +e.getMessage());
    	  System.out.println("예외 자체 정보:" + e.toString());
    	  e.printStackTrace();
    	 
      }finally {
    	  System.out.println("여기로");
      }
		   
	 
		
		
		
		

	}

}
