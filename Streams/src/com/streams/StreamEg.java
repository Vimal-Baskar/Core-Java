package com.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.*;

public class StreamEg {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=100;i>=0;i--) {
			list.add(i);
		}
		try {
			list = list.stream()
					.filter(x -> x%2==0)
					.map(x -> { 
						try{
							return 5/x;
						}
						catch(Exception e) {
							System.out.print(e);
						}
						return -1;
					}).collect(Collectors.toList());
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Exception caught");
		}
		System.out.println(list);
		list.stream().mapMulti((element,consumer)-> {
			if(element%2==0) {
				consumer.accept(element);
			}
		}).forEach(StreamEg::print);
		System.gc();
		
//		int ans = StreamEg::print;
//		
////		list = list.stream().takeWhile(ele -> (ele%2==0)).collect(Collectors.toList());
////		System.out.println(list.size());
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		List<ArrayList<Integer>> list1 = new ArrayList<ArrayList<Integer>>();
//		for(int i=1;i<=3;i++) {
//			ArrayList<Integer> temp = new ArrayList<Integer>();
//			for(int j=1;j<=3;j++) {
//				temp.add(j);
//			}
//			list1.add(temp);
//		}
//		System.out.println(list1.stream().flatMap(Collection::stream).collect(Collectors.toList()));
//		System.out.println(list);
//		System.out.println(list.stream().allMatch(l -> (l==1)));
//		System.out.println(list.stream().noneMatch(l -> (l<1)));
//		System.out.println(list.stream().anyMatch(l -> (l<1)));
////		System.out.println(list);
//	    int integer= list.stream().reduce(1,(a,b) -> a+b);
//	    System.out.println(integer);
		
	}
	
	static int print(Object s)
	{
		System.out.println("This1");
		return 1;
		
	}
}