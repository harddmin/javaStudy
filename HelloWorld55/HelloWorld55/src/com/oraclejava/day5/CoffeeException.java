package com.oraclejava.day5;

import java.util.Scanner;

public class CoffeeException extends Exception {
	
	public CoffeeException(String message) {
		super(message);
	}

	
	public void reinput() {
		try {
			System.out.print("금액 입력:");
			Scanner scan = new Scanner(System.in);
			int cash = scan.nextInt();
			if(cash<400) {
				throw new CoffeeException("돈이 부족합니다.");}
				
		
				
		   
			
		}catch (CoffeeException ex) {
			System.out.println("예외 발생:" + ex.getMessage());
		}

       try {
    	   
    	   System.out.print("금액 입력:");
			Scanner scan = new Scanner(System.in);
			int cash = scan.nextInt();
			System.out.println("맛있게 드세요");
			  
			  int price = 400;  // 커피 1잔 400원
				int cup = cash / price; // 몫(=잔)
				int change = cash % price;
				
				if (cash >= price) {
				    throw new CoffeeException(cup +"잔" + change + "원");
				    
				    //매개변수를 스트링 타입으로 받아서 change를 쓸수없다는게 뭔말????
				    
					
    	   
       }
       }catch(CoffeeException ex) {
					System.out.println("커피: " +ex.getMessage()); //super exception 클래스의 텍스트를 뿌리는 mesaage를 여기서 
					System.out.println("거스름돈:" +ex.getMessage());
					
				}
	

       }

}
