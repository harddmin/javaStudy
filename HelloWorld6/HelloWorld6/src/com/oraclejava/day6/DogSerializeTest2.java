package com.oraclejava.day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DogSerializeTest2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		String filepath = "src/resources/dog.obj";
				ObjectInputStream ois =
				new ObjectInputStream(new FileInputStream(filepath));
				
				Dog dog = (Dog) ois.readObject();
				ois.close();

				System.out.println("개 이름:" + dog.getName());
				System.out.println("개 나이:" + dog.getAge());
				System.out.println("개 품종:" + dog.getBleed());
				
				
				
	}

}
