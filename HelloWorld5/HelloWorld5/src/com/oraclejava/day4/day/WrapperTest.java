package com.oraclejava.day4.day;

public class WrapperTest {

	public static void main(String[] args) {
		int num1 = 20;
		Integer num2 = new Integer(30); // 포장(boxing)
		int total = num1 + num2.intValue(); //언박싱(unboxing)
		System.out.println("두 수의 합은: " + total);
	    System.out.println(Integer.toBinaryString(total));
	    System.out.println(Integer.toOctalString(total));
	    System.out.println(Integer.toHexString(total));
	    //System.out.println(num1.equals(num2));
	    System.out.println(num1==num2);
	    Integer num3 = new Integer(13);
	    Integer num4 = new Integer(25);
	    System.out.println(num3.equals(num4));
	    
	    
	    Integer num5 = 445; //auto boxing
	    System.out.println(num5.intValue());
	    
	    int num8 = num5;
        //int num8 = num5.intValue(); unboxing
	    
	    
	    Integer num6 = Integer.parseInt("445");
	    System.out.println(num6.intValue());
	    
	    Double num7 = new Double(1.1);
	    System.out.println(num7.doubleValue());
	    
	    int a = 1;
	    System.out.println(a);
	}

}
