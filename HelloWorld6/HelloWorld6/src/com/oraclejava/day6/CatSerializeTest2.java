package com.oraclejava.day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CatSerializeTest2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		String filepath = "src/resources/cat.obj";
		ObjectInputStream ois =
				new ObjectInputStream(new FileInputStream(filepath));
		
		Cat cat = (Cat) ois.readObject();//캐스팅
		ois.close();
		
		System.out.println("아이 이름:" + cat.getName());
		System.out.println("아이 이름:" + cat.getAge());
		
	}
	
}
