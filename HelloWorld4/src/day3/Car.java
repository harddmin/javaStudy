package day3;

//추상클래스 카
public abstract class Car {

	String name;  //차 이름 bmw
	int price; //차 가격 4000
	int speed; //속력
	
	public abstract void sppedDown(int speed);  // 감속 
	public abstract void speedUp(int speed); // 가속
}
