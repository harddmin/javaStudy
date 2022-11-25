package com.oraclejava.day5;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		//중복 가능하고 순서가 있는 객체(리스트) - 컬렉션
	    List<Goodsinfo> goodsList =
	    		new ArrayList<>();  //빈 리스트 생성
	    
	    
	    //라면 리스트
	    goodsList.add(new Goodsinfo(1, "신라면", 6000, "2022-10-12"));
	    goodsList.add(new Goodsinfo(2, "진라면", 5500, "2022-10-12"));
	    goodsList.add(new Goodsinfo(3, "열라면", 4000, "2022-10-12"));
	    goodsList.add(new Goodsinfo(4, "불닭면", 3000, "2022-10-12"));
	    goodsList.add(new Goodsinfo(5, "무파마", 7000, "2022-10-12"));
	    
	   System.out.printf("%-10s%-15s%-10s%-10s\n", "상품아이디", "상품명", "날짜", "상품가격");
	   
	   for (Goodsinfo goods : goodsList) {
		   System.out.printf("%-15d%-15s%10s%10d\n",goods.getId(), goods.getName(),goods.getDate(),goods.getMoney());
	   }
	    //int를 d로 표현

	}

}
