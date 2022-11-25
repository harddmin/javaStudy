package day3;

public class ThisTest {
	
	int i;
	
	public ThisTest() {
		//this.i = 100;
		this(100);
	}
	
	public ThisTest(int i) {
		this.i = i;
	}
	
	public void hi() {
		this.hello();
	}
	
	public void hello() {
		System.out.println("안녕!");
	}

	public static void main(String[] args) {
		// This : 자기 자신을 가리키는 주소
		ThisTest tt = new ThisTest();
		System.out.println(tt.i);
		tt.hi();

		
	}

}
