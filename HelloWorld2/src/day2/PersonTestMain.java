package day2;

public class PersonTestMain {

	public static void main(String[] args) {
		Person person = new Person();
		person.id = 1;
		person.name = "한유섬";
		person.teamName = "SSG";
		person.sex = "남";
		
		System.out.println("id = " + person.id);
		System.out.println("name = " + person.name);
		System.out.println("팀명 = " + person.teamName);
		System.out.println("성별 = " + person.sex);
		
		person.hit();
		person.hit();
		person.homerun();
		person.doublePlay();

	}

}
