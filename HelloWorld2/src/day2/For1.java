package day2;

public class For1 {

	public static void main(String[] args) {
		//1~10까지 합
		// 줄 주석/주석 해제 처리( Ctrl + / )
//		int i = 1;
//		int sum = 0; //합
//		
//		while (i <= 50) {
//			sum += i;
//			i++;
//		}
//		
//		System.out.println("합 = " + sum);
		
		
		int sum = 0; // 합
		
		for (int i = 1; i<=10; i++) {
			sum += i;
			System.out.println("합 = " + sum);
		}
		
		

	}

}
