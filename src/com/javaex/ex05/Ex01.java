package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Set<Integer> iset = new HashSet<Integer>();
//		int j = 0;
//		while(j != 6) {
//			iset.add(((int)(Math.random()*45)+1));
//			j++;
//		}
		for(int i=0;i<6;i++) {
			iset.add(((int)(Math.random()*45)+1));
		}
		
		System.out.println(iset);
		
		
		
		
		
	}
}
