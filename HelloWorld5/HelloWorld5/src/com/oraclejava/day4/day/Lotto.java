package com.oraclejava.day4.day;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		
	
		
	   for(Integer i =1; i<=6; i++) { //왜 인티저를 써야하는지 모르겠음...
		   Integer ball = new Random().nextInt(45) +1;
		   System.out.print(ball + " ");
			
		}
		
		

	}

}
