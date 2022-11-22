package day1;

import java.util.Scanner;

public class Hello13 {

	public static void main(String[] args) {
		System.out.println("몇까지 합을 구할까요?");
		

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); //어디까지 합을 저장하는 변수 num
		
		int total = 0; //합을 저장하는 변수
		
		for (int i=1; i<=num; i++) {
		
			total +=i;
			
		}
			System.out.println("1 to " + num + "sum is" +total);
	}

	}

