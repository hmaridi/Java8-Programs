package com.java8.demo.wayToBreakSingletonDp;

public class Singleton implements Cloneable {

	private static Singleton singleton;

	private Singleton() {
	}

	public static Singleton getInstance() {
		synchronized (Singleton.class) {
			if (singleton == null) {
				singleton = new Singleton();
			}
		}
		return singleton;

	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
