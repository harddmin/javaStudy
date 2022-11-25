package com.oraclejava.day5;

import java.util.Scanner;

public class CoffeeMain {

   public static void main(String[] args) {
	
 
	   try {
		   int cash =0;
		   Scanner scan = new Scanner(System.in);
		   System.out.print("금액 입력:");
		   cash = scan.nextInt();
		   if(cash<400) {
			   throw new CoffeeException("돈이 모자랍니다.");
		   }
		  System.out.println("맛있게 드세요");
		  
		  int price = 400;  // 커피 1잔 400원
			int cup = cash / price; // 몫(=잔)
			int change = cash % price;
			
			if (cash >= price) {
				System.out.println("커피: "+ cup +"잔");
				System.out.println("거스름돈: " + change +"원");
		   
			}
	   }catch (CoffeeException ex) {
		   System.out.println("예외 발생:");
		   ex.reinput();
		   
		   
	   }
		   
		   
		   
	   }
   }

	


   
