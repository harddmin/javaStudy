package day3;

public class Building implements BuildingType {
	
	String name;
	String address;
	String id;
	
	public Building(String name, String address, String id) {
		this.name = name;
		this.address = address;
		this.id = id;
	}

	@Override
	public String getBuildingName() {
		
		return this.name;
	}

	@Override
	public String getBuildingAddress() {
		
		return this.address;
	}

	@Override
	public String getBuildingId() {
		
		return this.id;
	}
	

}
