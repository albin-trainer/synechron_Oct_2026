package com.synechron.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class List2Demo {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<>();
	list.add("Apple");
	list.add("Orange");
	System.out.println(list);
	
	list.add(1,"Grapes"); //added in the 1st index
	System.out.println(list);
	
	String fruit=list.get(1);
	System.out.println(fruit);
	list.remove(1); //grapes removed ....
	System.out.println(list);
	
	ArrayList<String> list2=new ArrayList<>();
	long t1=System.currentTimeMillis();//cur time in milli secs
	for(int i=1;i<=10000000;i++) {
		list2.add("Hello");
	}
	long t2=System.currentTimeMillis();//cur time in milli secs
	
	System.out.println("Time took for arraylist "+ (t2-t1));
	LinkedList<String> list3=new LinkedList<>();
	t1=System.currentTimeMillis();//cur time in milli secs
	for(int i=1;i<=10000000;i++) {
		list3.add("Hello");
	}
	t2=System.currentTimeMillis();//cur time in milli secs
	System.out.println("Time took for LinkedList "+ (t2-t1));

	
}
}
