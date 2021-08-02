package com.hamit.creation.builder;

public class BuilderMainTest {

	public static void main(String[] args) {
		BuilderClass builderClass = new BuilderClass.Builder().soyadi("Mızrak").build();
		System.out.println(builderClass);

	}

}
