package com.oraclejava.day4.day;

public class GoodsInfo {

     private int id; //상품id
     private String name; //상품 이s
     private int money; // 상품 가
     private String date; // 주문일

     public GoodsInfo(int id, String name, int money, String date) {
    	 this.id = id;
    	 this.name = name;
    	 this.money = money;
    	 this.date = date;
    	 
     }
     
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
     
     


	}


