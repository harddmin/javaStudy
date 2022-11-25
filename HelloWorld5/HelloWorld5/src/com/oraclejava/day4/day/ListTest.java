package com.oraclejava.day4.day;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		//영화 목록 순위
	    List<String> movieList = new ArrayList<>();
	    movieList.add("헤어질 결심");
	    movieList.add("조조 래빗");
	    movieList.add("코코");
	    movieList.add("사랑할 땐 누구나 최악이 된다");
	    movieList.add("미드나잇 인 파리");
	    movieList.add("미드나잇 인 파리");
	    
	  // System.out.println(movieList.get(3));
	    
	  for (String movie : movieList) {
		  System.out.println(movie);
	  }
	    
	    
	   }

	}


