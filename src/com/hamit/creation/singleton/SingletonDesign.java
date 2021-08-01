package com.hamit.creation.singleton;

public class SingletonDesign {
	// private
	// private static
	// public static

	// 1- constructor ==> private
	private SingletonDesign() {
	}

	// 2- instance
	private static SingletonDesign instance;

	// 3- getInstance()
	public static SingletonDesign getInstance() {
		if (instance == null) {
			synchronized (SingletonDesign.class) {
				instance = new SingletonDesign();
			}
		}
		return instance;
	}
}
