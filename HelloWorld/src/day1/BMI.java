package day1;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("키를 입력:");
		double height = scan.nextDouble();  // 키(cm)
		System.out.print("몸무게를 입력:");
		double weight = scan.nextDouble();  // 몸무게(kg)
		
		// centi meter -> meter 변경해서 계산
		double bmi = weight / ((height / 100.0) * (height / 100.0));
		System.out.println("bmi = " + bmi);
	}

}
