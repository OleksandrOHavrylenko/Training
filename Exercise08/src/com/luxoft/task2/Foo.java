package com.luxoft.task2;

public class Foo {

	@Override
	protected void finalize() throws Throwable {
		//TODO: print to console that finalize() was called		
		super.finalize();
	}
}
