package com.oraclejava.day4.day;

import java.util.ArrayList;
import java.util.List;


public class list {

	public static void main(String[] args) {
	    GoodsInfo goods1 = new GoodsInfo(1, "iphone", 100, "2022-07-08");
	    GoodsInfo goods2 = new GoodsInfo(2, "galaxy", 100, "2022-06-04");
	    GoodsInfo goods3 = new GoodsInfo(3, "shaomy", 50, "2022-07-03");
	    GoodsInfo goods4 = new GoodsInfo(4, "Lgphone", 300, "2022-03-15");
	    
	    
	   List<GoodsInfo> goodsList = new ArrayList<>();
	    goodsList.add(goods1);
	    goodsList.add(goods2);
	    goodsList.add(goods3);
	    goodsList.add(goods4);
	    
	    
	    System.out.println("상품아이디"+" "+"상품명"+"  "+"날짜"+"       "+"상품가격");
	    
	    for(GoodsInfo goods : goodsList) {
	    	System.out.print(goods.getId());
	    	System.out.println("      " +goods.getName() +" "+ goods.getDate()+" " + goods.getMoney());
	    	
	    	
	    }
		
		

	}

}
