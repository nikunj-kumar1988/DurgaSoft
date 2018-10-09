package com.durga.loans.homeloan;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {

	public static void main(String[] args) {
		HashMap<Integer,String> mp = new HashMap<>();
		mp.put(800, "nikunj");
		mp.put(5, "kumar");
		mp.put(500, "vishwakarma");
		mp.put(89, "Ashish Kumar");
		mp.put(105, "Dhiraj");
		mp.put(null, "pathak");
		
		System.out.println(mp);
		
		Set s1 = mp.keySet();
		Collections c = (Collections) mp.values();
		System.out.println(c);
		
		Set c2 = mp.entrySet();
		Iterator it = c2.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			System.out.println(entry.getKey() + "--" + entry.getValue());
			
		}
	}

}
