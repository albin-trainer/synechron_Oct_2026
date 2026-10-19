package com.synechron.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
public static void main(String[] args) {
	HashMap<String, String> map= new HashMap<>();
	map.put("SBC", "Magestic, Bangalore");
	map.put("KJM", "KR puram, Bangalore");
	map.put("MAQ", "Mangalore");
	map.put("MYS", "Mysore");
	map.put("CST","Mumbai");
	
	System.out.println(map);
	String stationName=map.get("KJM");
	System.out.println(stationName);
	
	//MAP is not iterable 
	Set<String> keys=   map.keySet();//returns Set view
	for(String k:keys) {
		System.out.println(k);
	}
	System.out.println("***********");
	Collection<String> values=map.values();
	for(String v:values) {
		System.out.println(v);
	}
	System.out.println("--------------");
	Set<Map.Entry<String, String>>  records=   map.entrySet();
	for(Map.Entry<String, String> r:records) {
		System.out.println(r.getKey()+"  "+r.getValue());
	}
	
}
}
