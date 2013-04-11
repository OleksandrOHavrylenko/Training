package com.luxoft.task2;

public class GCTest {
	byte array[] = new byte[1024];

	public static void main(String[] args) {
		//TODO: modify numberOfIterations to check that GC is called
		int numberOfIterations = 1000000;
		
		for (int i = 0; i < numberOfIterations; i++) {
			//TODO: collect references to foo at an array to prevent object being garbage collected
			Foo foo = new Foo();
		}
	}
}
