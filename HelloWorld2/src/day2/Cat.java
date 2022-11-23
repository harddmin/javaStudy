package day2;

public class Cat {
	int age;  // 고양이 나이
	String name;  // 고양이 이름
	double weight;  // 고양이 몸무게
	
	// 행동 method(먹는다 eat, 운다 cry,, 숨는다 hide)
	public void eat() {
		System.out.println("고양이가 먹습니다... 냠냠");
	}
	
	public void cry() {
		System.out.println("고양이가 웁니다... 냥냥~");
	}
	
	public void hide() {
		System.out.println("고양이가 숨습니다... 헐레벌떡");
	}
}
