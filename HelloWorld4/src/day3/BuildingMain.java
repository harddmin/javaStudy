package day3;

public class BuildingMain {

	public static void main(String[] args) {
		
		Building a = new Building("BuILDING-A", "GURO", "1");
		Building b = new Building("BuILDING-B", "GURO", "2");
		Building c = new Building("BuILDING-C", "GURO", "3");
		
		System.out.println("건물명:" + a.getBuildingName());
		System.out.println("주소:" + a.getBuildingAddress());
		System.out.println("ID:" + a.getBuildingId());

	}

}
