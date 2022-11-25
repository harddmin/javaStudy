package com.oraclejava.day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CityMapTest {

	public static void main(String[] args) {
		// cities 정의
	    Map<String, String> cities =
	    		new HashMap<>(); //ctrl + shift +O
	    cities.put("서울특별시는 대한민국의 수도, 최고도시", "서울");
	    cities.put("대전", "대전의 관광명소, 축제를 즐기세요");
	    cities.put("대구", "대구 여행에서 빼놓을 수 없는 곳이에요, 김광석 추모");
	    cities.put("부산", " 2018년 아시아 최고 여행지 1위");
	    cities.put("인천", "인천 남동구 논현동 포구에요");

	    Set<String> citySet = cities.keySet();
	    
	    System.out.printf("%-10s%s", "도시명", "도시설명");
	    for(String num :citySet) {
	    	System.out.printf("%-10s%s\n", num,cities.get(num));
	    }
	    
	    
	    
	}

}
