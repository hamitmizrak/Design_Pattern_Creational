package com.hamit.creation.singleton;

public class SingletonClass {

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

	// 1-)parametresiz constructor : yapıcı methodlar private
	private SingletonClass() {
		// TODO Auto-generated constructor stub
	}

	// 2-)private static
	private static SingletonClass instance;

	// 3-)public static
	public static SingletonClass getInstance() {

		if (instance == null) {
			synchronized (SingletonClass.class) {
				instance = new SingletonClass();
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		SingletonClass singletonClass = new SingletonClass();
		System.out.println(singletonClass);

	}

}
