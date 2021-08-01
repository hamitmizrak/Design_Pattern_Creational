package com.hamit.creation.singleton;

public class SingletonDesign {

	// 1- constructor ==> private
	private SingletonDesign() {

	}

	// 2- nesneyi
	private static SingletonDesign instance;

	// 3-
	public static SingletonDesign getInstance() {
		if (instance == null) {
			synchronized (SingletonDesign.class) {
				instance = new SingletonDesign();
			}
		}
		return instance;
	}
}
