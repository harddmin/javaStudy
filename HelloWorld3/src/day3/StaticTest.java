package day3;

public class StaticTest {
	
	static String myName = "임형구";
	static int myAge = 999;
	
	static String myAddr;
	
	static {
		myAddr = "서울시 송파구 잠실";
	}
	
//	private {
//		myadr = "서울";
//	}
	
	static void hello() {
		System.out.println("안녕!");
	}

	public static void main(String[] args) {
		hello();
		System.out.println("이름 = " +myName);
		//제 이름을 임수정으로 변경
		myName = "임수정";
		System.out.println("이름 = " + myName);
		System.out.println("현재 나이 = " + myAge);
		//1년후 2023년
		myAge++;
		System.out.println("1년후 나이 = " + myAge);
		System.out.println("주소는 " + myAddr);

	}

}
