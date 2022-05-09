package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		Set<Integer> iset = new HashSet<Integer>();
		
		while ( iset.size() != 6 ) {
			iset.add(((int)(Math.random()*45)+1));
		}
		
		System.out.println(iset);

	}

}
