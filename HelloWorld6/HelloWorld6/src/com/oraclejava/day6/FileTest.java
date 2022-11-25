package com.oraclejava.day6;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		String filepath = "src/resources/news.txt";
		File f1 = new File(filepath);
		
		System.out.println(f1.getPath());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getName());
		System.out.println(f1.length());
		// System.out.println(f1.exists());
		// 파일이 존재하면 삭제
		if(f1.exists()) {
			f1.delete();
		}

	}

}
