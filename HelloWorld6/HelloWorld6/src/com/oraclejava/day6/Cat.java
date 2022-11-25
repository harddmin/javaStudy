package com.oraclejava.day6;

import java.io.Serializable;

//고양이 설계
public class Cat implements Serializable { //객체 직렬화 serializable을 써야만 직렬화

	private String name; //고양이이름
	private int age; //고양이 나이
	
	//get,set
	//마우스 우클릭 -> 소스->제너레이트 게터세터
	//혹은 메뉴 ---> 
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	 

	
	
	
	

	
}
