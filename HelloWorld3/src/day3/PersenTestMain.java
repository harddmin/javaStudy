package day3;

public class PersenTestMain {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		Person person2 = new Person();
		
		person1.setName("김연경");
		person1.setId(07);
		person1.setSex("여자");
		person1.setTeamName("흥국생명");
		
		person2.setName("이지민");
		person2.setId(03);
		person2.setSex("여자");
		person2.setTeamName("자바");
		
		System.out.println("person1 이름=" +person1.getName());
		System.out.println("person1 아이디=" +person1.getId());
		System.out.println("person1 팀명=" +person1.getTeamName());
		System.out.println("person1 성별=" +person1.getSex());
		
		System.out.println();
		
		System.out.println("person2 이름=" +person2.getName());
		System.out.println("person2 아이디=" +person2.getId());
		System.out.println("person2 팀명=" +person2.getTeamName());
		System.out.println("person2 성별=" +person2.getSex());
		

	}

}
