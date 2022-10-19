package com.reflection;

import java.lang.reflect.*;

public class Reflection {
	public static void main(String[] args) {
		PrivateClass p = new PrivateClass();
		try {
			Method m = p.getClass().getDeclaredMethod("getNumber",null);
			Field f = p.getClass().getDeclaredField("number");
			f.setAccessible(true);
			m.setAccessible(true);
			m.invoke(p, (Object)null);
			System.out.println(f.get(p));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}