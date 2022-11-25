package day3;

public class Bmw extends Car{

	@Override
	public void sppedDown(int speed) {
		this.speed -= speed;
		if (this.speed < 40) {
			this.speed = 70;
		}
		
	}

	@Override
	public void speedUp(int speed) {
		this.speed += speed;
		if (this.speed > 100) {
			this.speed = 99;
		}
		
	}

}
