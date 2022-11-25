package com.oraclejava.day5;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ExTest3 {

	public static void main(String[] args) {
		//Unchecked 예외 : 실행해봐야지 알수있는 예외
		//Checked 예외 : 처리하지 않으면 에러가 나는 예외
		
	    //throws는 정말 처리가 힘들경우에만 사용하고
		//가능한한 개발자가 처리하는 것이 좋음(try~catch)
		try {
		int age = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("나이 입력:");
	    age = scan.nextInt();
	    if (age<19) {
	    	throw new BeerException("당신은 맥주를 마실 수 없습니다.");
	    }
	    	System.out.println("맛있게 드세요");
	    
	
		}catch (BeerException ex) {
			System.out.println("예외 발생:" + ex.getMessage());
			ex.reInput();
		
		}
	}

}
