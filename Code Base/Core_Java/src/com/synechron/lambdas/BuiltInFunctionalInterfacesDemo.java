package com.synechron.lambdas;

import java.io.Console;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class BuiltInFunctionalInterfacesDemo {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<>();
	list.add(12);
	list.add(43);
	list.add(34);
	list.add(67);
	list.add(32);
	list.add(34);
	list.add(324);
	list.add(76);
	list.add(11);
	System.out.println("----");
//	for(int x:list) {
//		System.out.println(x);
//	}
	//list.forEach(x->System.out.println(x));
	Consumer<Integer> consumer=x->System.out.println(x);
	System.out.println("******");
	list.forEach(consumer);
	
	list.remove(0);//remove by index
	Predicate<Integer> predicate=n->n%2==0;
	list.removeIf(predicate);
	System.out.println(list);
}
}
