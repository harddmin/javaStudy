package day3;

public class Cat {

	private String name;
	private int age;
	
	public void cry() {
		System.out.println("노멀 크라이!"); //오버라이드
	}
	
	public Cat(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
