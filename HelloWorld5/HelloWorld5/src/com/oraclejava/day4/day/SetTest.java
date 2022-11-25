package com.oraclejava.day4.day;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		//영화목
		Set<String> movieList = new HashSet<>();
		movieList.add("쥬라기공원");
		movieList.add("쥬라기공원 2");
		movieList.add("쥬라기공원 3");
		movieList.add("쥬라기공원 4");
		movieList.add("쥬라기공원 5");
		
	    for (String movie : movieList) {
	    	System.out.println(movie);
	    }

	}

}
