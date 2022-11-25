package com.oraclejava.day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NewsTest {

	public static void main(String[] args) throws IOException {
		

		String filepath = "src/resources/news.txt";

		FileInputStream fis =   new FileInputStream(filepath);
		
		int data;
		while((data = fis.read())!=-1){
			System.out.println((char)data);
		
		
		
}
		
		fis.close();
}
}