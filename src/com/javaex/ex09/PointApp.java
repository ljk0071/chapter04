package com.javaex.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {
	
	public static void main(String[] args) {
		
		Map<String, Point> pMap = new HashMap<String, Point>();
		
		Point p1 = new Point(3,5);
		Point p2 = new Point(13,45);
		Point p3 = new Point(23,15);
		
		pMap.put("a", p1);
		pMap.put("b", p2);
		pMap.put("c", p3);

		System.out.println(pMap);
		
		Point p4 = new Point(100,100);
		
		pMap.put("a", p4);
		
		System.out.println(pMap);
		
		Set<String> keys = pMap.keySet();
		
		System.out.println(keys);
		
		for(String p : keys) {
			System.out.println(pMap.get(p));
		}
		
	}

}
