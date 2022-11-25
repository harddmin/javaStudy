package com.oraclejava.day5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CityMapTest {

	public static void main(String[] args) {
		
		Map <String,String> map = new HashMap();
		
		map.put("서울특별시","한국의 수도, 구경거리와 놀거리가 많습니다.");
	    map.put("바르셀로나","스페인의 가장 큰 도시 중 하나입니다. 가우디 건축물이 유명합니다.");
	    map.put("베네치아","이탈리아에서 가장 유명한 관광지입니다. 물의 도시라는 별명이 있습니다.");
	    
	    Set<String>keycity = map.keySet();
	    
	    List<String> list = new ArrayList<>(keycity);
	    list.sort((a,b)-> a.compareTo(b)); 
	    System.out.println("도시명" +"     " +"도시 소개");
	    
	   //Iterator<String> iter =keycity.iterator();
	    Iterator<String> iter = list.iterator();
	   while(iter.hasNext()) {
		   String key = iter.next();
		   String value = map.get(key);
		   
		   
		   
			  
		 
			  
			  System.out.println(key+ "  "+ value);
			  
	   }
	    
	    
	    

	}

}
