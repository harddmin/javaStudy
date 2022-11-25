package day3;

public class Benz extends Car {

	@Override
	public void sppedDown(int speed) {
		this.speed -= speed;
		if (this.speed <40) {
			this.speed = 40;
		}
		
		
	}

	@Override
	public void speedUp(int speed) {
		this.speed += speed;
		if (this.speed > 150) {
			this.speed = 149;
		}
		
		
	}
	
	

}
