package day3;

public class CatMain {

	public static void main(String[] args) {
		KoreanCat kc = new KoreanCat();
		System.out.println("이름:" + kc.getName());
		kc.setAge(5);
		System.out.println("나이:" + kc.getAge());
		kc.cry();
		
		JapanCat jc = new JapanCat();
		System.out.println("이름:" +jc.getName());
		jc.setAge(2);
		System.out.println("나이:" +jc.getAge());
		jc.cry();
		
		//다형성(polymorphism)
		System.out.println("***다형성 연습***");
		Cat cat;
		cat = kc;
		cat.cry();
		
		cat = jc;
		cat.cry();
		

	}
	
	
	

}
