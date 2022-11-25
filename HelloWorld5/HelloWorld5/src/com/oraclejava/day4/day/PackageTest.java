package com.oraclejava.day4.day;

//import java.util.Date;
//import java.util.Random;

import java.util.*;
import java.lang.*;

public class PackageTest {

	public static void main(String[] args) {
		// 다른 패키지의 클래스를 가져오려면 import문을 사용한다.
		System.out.println(new Date());
	    System.out.println(new Random().nextInt(10)+1);
	    java.lang.System.out.println(new java.util.Date());

	}

}
