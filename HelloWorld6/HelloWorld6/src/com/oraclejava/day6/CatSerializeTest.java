package com.oraclejava.day6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CatSerializeTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 러시안 블루 고양이 한마리를 만들어서
		// 출력 스트림화를 시켜서 파일로 저
		
		
		Cat cat = new Cat();
		cat.setName("러시안 블루"); //입력. 출력해야함
		cat.setAge(6);
		
		String filepath = "src/resources/cat.obj"; //텍스트 파일 아님
		
		
		ObjectOutputStream oos = new ObjectOutputStream( //객체 직렬
				new FileOutputStream(filepath));
		oos.writeObject(cat);//filepath에 쓰겠다는 것 (objectoutputstream으로 직렬화하려면 필요함)
		
		oos.close();
		

	}

}
