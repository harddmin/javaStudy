package com.oraclejava.day6;

import java.io.Serializable;

public class Dog implements Serializable{
	
	private String name; //개 이름
	private int age; //개 나이
    private String bleed; //개 혈통
    
    
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
	public String getBleed() {
		return bleed;
	}
	public void setBleed(String bleed) {
		this.bleed = bleed;
	}
    
    
    
    
    

}
