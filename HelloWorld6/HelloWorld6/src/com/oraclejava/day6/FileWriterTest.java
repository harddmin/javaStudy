package com.oraclejava.day6;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		 String filepath = "src/resources/diary.txt";
		 FileWriter dr = new FileWriter(filepath);
		 dr.write("날씨는 좋지만 힘들다.\n");
		 dr.write("2022-10-13");
		 
		 dr.close();
		 
		 	
		

	}

}
