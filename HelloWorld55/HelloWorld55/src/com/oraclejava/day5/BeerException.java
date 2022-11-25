package com.oraclejava.day5;

import java.util.Scanner;

public class BeerException extends Exception {
	
	public BeerException(String message) { //생성자 부모클래스의 메시지로 전달
		super(message);
	}
	
	//나이를 새로 입력
	
    public void reInput() {
    	try {
    	System.out.print("나이 입력:");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age < 19) {
        	throw new BeerException("당신은 19세 미만으로 맥주를 마실 수 없습니다.");
        }
    	}catch (BeerException ex) {
    		System.out.println("예외 발생:" + ex.getMessage());
    	}
    }
	

}
