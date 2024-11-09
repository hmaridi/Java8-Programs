package com.java8.demo.wayToBreakSingletonDp;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WayToBreakSingleton {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {
		Singleton originalSingleton = Singleton.getInstance();
		Singleton duplicateSingleton = Singleton.getInstance();
		
		System.out.println("HashCode original singleton  : " + originalSingleton.hashCode());
		System.out.println("HashCode duplicate singleton : " + duplicateSingleton.hashCode());
		
		
		//Break Singleton using Reflection API
		Class<?> singletonClass=Class.forName("com.java8.demo.wayToBreakSingletonDp.Singleton");
		Constructor<Singleton> constructor=(Constructor<Singleton>) singletonClass.getDeclaredConstructor();
		constructor.setAccessible(true);
		
		Singleton brokenSingletonUsingReflection=constructor.newInstance();
		System.out.println("HashCode original singleton  : " + originalSingleton.hashCode());
		System.out.println("HashCode for brokenSingletonUsingReflectionIns : " + brokenSingletonUsingReflection.hashCode());
		
		
		//Break Singleton Using Cloning
		Singleton breakSingletonCloningIns=(Singleton) originalSingleton.clone();
		System.out.println("HashCode original singleton  : " + originalSingleton.hashCode());
		System.out.println("HashCode for breakSingletonCloningIns : " + breakSingletonCloningIns.hashCode());
		
		
	}

}
