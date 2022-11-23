package day2;

public class Coffee2Main {

	static Coffee coffee(int money) {
		Coffee coffee = new Coffee();  // 인스턴스 생성
		
		coffee.cup = money / 400;
		coffee.change = money % 400;
		
		return coffee;
	}
	
	// 시작점(start point)
	public static void main(String[] args) {
		Coffee cafe = coffee(1000);  //1000 매개변수(arguments)
		System.out.printf("커피 %d잔\n거스름돈 %d원\n"
				, cafe.cup, cafe.change);
	}

}
