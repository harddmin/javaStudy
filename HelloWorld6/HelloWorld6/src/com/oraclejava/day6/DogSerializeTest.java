package com.oraclejava.day6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DogSerializeTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Dog dog = new Dog();
		dog.setName("춘덕");
		dog.setAge(5);
		dog.setBleed("골든 리트리버");

		String filepath = "src/resources/dog.obj";
		ObjectOutputStream oos = new ObjectOutputStream( 
				new FileOutputStream(filepath)); //객체 안에 객체가 또 들어감 생성자 안에 생성자 
		oos.writeObject(dog);
		
		oos.close();
		
	}

}
