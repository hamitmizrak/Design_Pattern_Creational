package com.hamit.creation.builder;

public class BuilderLombokMainTest {

	public static void main(String[] args) {
		BuilderClassLombok builderClass = new BuilderClassLombok().builder().soyadi("Mızrak").build();
		System.out.println(builderClass);

	}

}
