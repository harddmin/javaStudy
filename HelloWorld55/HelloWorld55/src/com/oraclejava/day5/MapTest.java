package com.oraclejava.day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		//사람의 이름을 키로, 주소를 값으로 하는 맵(해쉬맵)을 작성하고 자료를 여러개 입력후 출력(Get)
				//강호동 -> 서울시 구로구
				
			    Map<String,String> map = new HashMap<>();
			    
			    map.put("이지민","송파구"); //put은 문법. 변수 아
			    map.put("박동훈","경기도");
			    map.put("동대문","동역사");
			    
			    
			   
				
			//전체 주소록 출력
			 Set<String>keySet = map.keySet(); //키목록만 가져와서 키를 얻고 키를 이용해 셋목록만듦
//			 for(String key : keySet) {
//				 System.out.println("이름:" +key);
//				 System.out.println("주소:" +map.get(key));
//				 System.out.println("========");
			 
			 
		
			 Iterator<String> iter = keySet.iterator();
				while (iter.hasNext()) {
					String key = iter.next();
					String value = map.get(key);
				//	System.out.println(key + " : " + map.get(key));
				//	System.out.printf("이름: %s , 주소:%s\n",key,value);
			 
			 
		System.out.println("--------------");
		
		
		//전체 주소록 출력
		  Set<String> keyset = map.keySet();
		  
	//키순으로 정렬
		  List<String> list = new ArrayList<>(keySet);
		  list.sort((a,b)-> a.compareTo(b));

		
		
	 
	
	//iterator로 출력
		Iterator<String> iter2 = list.iterator();
		while (iter2.hasNext()) {
			String key3 = iter2.next();
			String value3 = map.get(key3);
		    System.out.println("이름: " + key +",주소: "+ value3);
			
		}
		 
		 
		 
	
	}
	 
	
	
	
	
	
	 }
	
}
	  
	  
	  
	
	
	
