package com.oraclejava.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		
		
		Set<Integer> pre = new HashSet<>(); //set인터페이스, 추상클래
		 pre.add(1);
		 pre.add(2);
		 pre.add(3);
		 pre.add(4);
		 pre.add(5);
		 
		 
		 
		 for(Integer num : pre) {
			 System.out.println(num);
		 }
		
		 //set:순서없고, 중복이 불가능한 컬렉션
			Set<Integer> set = new HashSet<>();
			set.add(1);
			set.add(5);
			set.add(9);
			
			//System.out.println(set.size());
			
			for (Integer num : set) {
				System.out.println(num);
			}
		
		//System.out.println(new Random().nextInt(45) +1);
	
			//로또 만들기
			Set<Integer> lotto = new HashSet<>();
			//로또 번호 추출해서 로또(셋)에 대입
			while (lotto.size() <6) {
				lotto.add(new Random().nextInt(45)+1); //0~44까지라 1을 더한것
			}
			
			List<Integer> list = new ArrayList<>(lotto); //lotto를 list로 변경 가능(set을 리스트로)(Integer 안 써도 오류는 안 나지만 그냥 타입 int를 써준것)
			
		   // Collections.sort(list); //오름차순으로 정렬, 컬렉션을 쓰기위해 set을 list로 변경한 것
			
			
			list.sort((n1, n2) -> n1.compareTo(n2)); //오름차순(순방향) n1,n2를 여기서 정의한다,역방향은 n1, n2를 바꿔주면 
		    
		    
		    //정렬된 리스트 출력
		   for (Integer num :list) {
			   System.out.printf("%3d" , num);
		   }

			
		

	}

}
