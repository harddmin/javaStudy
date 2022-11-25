package com.oraclejava.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		String filepath = "src/resources/news.txt";
		
		//파일 리더로 텍스트 파일 읽기
		
		FileReader fr = new FileReader(filepath); //파일의 실제경로(filepath)를 넣음
		int data;
		while ((data = fr.read()) != -1) {
			System.out.print((char)data);
		}

		fr.close();
	}

}
