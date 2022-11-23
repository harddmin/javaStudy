package day2;

public class Person {
	int id;		// 일련번호:1
	String name;	// 선수명: 김현수
	String teamName;	// 팀명:  LG
	String sex;	// 성별: 남
	
	// 메소드 작성
	//홈런친다(homerun), 안타친다(hit), 병살친다(doublePlay)
	public void homerun() {
		System.out.println("홈런 칩니다...");
	}
	
	public void hit() {
		System.out.println("안타 칩니다...");
	}
	
	public void doublePlay() {
		System.out.println("병살타 칩니다...");
	}
	
}
