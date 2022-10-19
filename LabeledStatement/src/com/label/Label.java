package com.label;

import java.util.ArrayList;
import java.util.Scanner;

public class Label {
	public static void main(String args[]) 
	{
		int d = 1 / 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		int n = sc.nextInt();

		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			for(int j=0;j<x;j++) {
				array.add(sc.nextInt());
			}
			first:{
				for(int j=0;j<x;j++) {
					if(array.get(j)<0) {
						break first;
					}
					System.out.print(array.get(j)+" ");
				}
				System.out.print("\n");
				for(int j=x-1;j>=0;j--) {
					System.out.print(array.get(j)+" ");
				}
			}
			System.out.print("\n");
			for(int j=0;j<(x*2)-1;j++) {
				System.out.print("-");
			}
			array.clear();
			System.out.print("\n");
		}
	}
}
