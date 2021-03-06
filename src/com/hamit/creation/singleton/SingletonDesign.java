package com.hamit.creation.singleton;

public class SingletonDesign {
	// private
	// private static
	// public static

	// access identifier
	// public ==> heryerden erişim vardır.
	// protected ==> aynı paketin farklı classlardaın farklı paketlerde çalışmaz (extends ile eklenmişse
	// çalıştırabiliriz)
	// private ==> sadece o paketin o classında çalışır
	// -

	// creation design pattern: new kullanmamaya çalış.
	// abstraction=abstract+interface
	// database bağlantııs, port
	// singleton design pattern: tek bir kanal ve new oluşturmadan

	// private , static

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
