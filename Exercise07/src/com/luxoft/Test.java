package com.luxoft;


public class Test {
	public static void main(String[] args) {
		int v1 = 3;
		byte v2 = v1;
		System.out.println(v2);
		v1 = 256;
		byte v3 = v1;
		System.out.println(v3);
		int v4 = 's';
		System.out.println(v4);
		
		byte v5 = 115;
		if (v5 == 's') {
			System.out.println("Equals");
		}
		
		//TODO: What exactly will be printed?
		System.out.println((double)4);
		
		//TODO: What exactly will be printed?
		double d = 5;
		System.out.println(d + 1);
		
		boolean b = v4;
		
		short v6 = "short";
		
		float v7 = 3.67;
		
		float v9 = 3;//TODO: Why there is no compilation error?
		
		int v8 = v7;
		
		int array[] = new double["27"];
		
	}
}
