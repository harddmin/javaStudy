package com.oraclejava.day5;

public class ExTest {

	public static void main(String[] args) {
		//Unchecked Exception
		//친구 4명의 이름을 배열에 넣고 출력
		//유비무
	try{
		String[] friend = new String[4];
		
		friend[0] = "강호동";
		friend[1] = "서장훈";
	    friend[2] = "이수근";
	    friend[3] = "김영철";
	    
	   
    for(int i =0; i<friend.length; i++) {
    	System.out.println(friend[i]);
    }
	}
    catch(ArrayIndexOutOfBoundsException ex) {
		//예외처리
		System.out.println("예외 발생:" +ex.getMessage());
	}
		
		

	}


}