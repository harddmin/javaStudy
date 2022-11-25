package com.oraclejava.day5;

import java.util.Scanner;

public class ExTest2 {

	public static void main(String[] args) {
		//NullPointerException(NPE) 
		//자신의 이름을 입력받아 "트럼프"이면 "당신은 트럼프입니다"라고 출력되게 함
		//아니면 "당신은 트럼프가 아닙니다"
		
		try {
		
	   String name ="이지민";
	   
	  if( name.equals("트럼프")) {
	      System.out.println("당신은 트럼프입니다.");
	  }
	  
	  else   {
          System.out.println("당신은 트럼프가 아닙니다.");
	  }
		}
		catch (NullPointerException ex) {
			System.out.println("예외 발생:" +ex.getMessage());
		}finally {
			//예외가 발생하든 안하든 프로그램 종료 전에 무조건 실행할거야~
		    System.out.println("최종 처리");
		}

	}

}
