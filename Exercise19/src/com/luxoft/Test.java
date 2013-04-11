package com.luxoft;

import java.io.Serializable;

public abstract class Test implements Serializable, Cloneable {
	private int field;

	public Test(final Object field) {
	}

	@Deprecated
	protected static void method(final String[] params) {
	}
}
