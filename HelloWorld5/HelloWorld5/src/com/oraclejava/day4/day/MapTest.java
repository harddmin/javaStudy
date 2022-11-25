package com.oraclejava.day4.day;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
				Map<String, String> movieList =
				new HashMap<>();
		movieList.put("1", "공조2");
		movieList.put("2", "인생은 아름다");
		movieList.put("3", "정직한 후보2");
		movieList.put("1", "공조");
		movieList.put("4", "652");
		movieList.put("5", "거");
		movieList.put("6", "선데이");
		
	System.out.println(movieList.get("1"));
		
		Set<String> keySet = movieList.keySet();
		for (String key : keySet) {
			System.out.printf("%s : %s\n",key,movieList.get(key));
	

		}
	}
}


