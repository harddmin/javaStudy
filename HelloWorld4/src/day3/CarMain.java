package day3;

public class CarMain {

	public static void main(String[] args) {
		Bmw bmw = new Bmw ();
		Benz benz = new Benz ();
		
		Car car;
		car = bmw; //=Car car = bmw; 다형성인듯
		car.speedUp(50);
		car.speedUp(50);
		car.speedUp(10);
		
		System.out.println("bmw 현재 속도 = " +car.speed);
		
		car = benz;
		car.speedUp(50);
		car.speedUp(50);
		car.speedUp(50);
		car.speedUp(10);
		
		System.out.println("benz 현재 속도 = " + car.speed);
		

	}

}
