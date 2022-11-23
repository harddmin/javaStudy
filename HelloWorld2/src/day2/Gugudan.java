package day2;

public class Gugudan {

	public static void main(String[] args) {
		int sum;  // sum 이란 변수
		
		for (int i = 1; i<= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				sum = i * j;
				System.out.print(" " + j + "*" + i + "=" + sum);
			}
			System.out.println();  //줄바꿈
		}

	}

}
