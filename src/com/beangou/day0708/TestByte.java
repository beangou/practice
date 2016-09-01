package com.beangou.day0708;

public class TestByte {

	public static void main(String[] args) {
		byte b = 127;
		int i = 127;
		System.out.println(b);
		System.out.println(b == i);
//		"".replace("{", newChar)
		long RANDOM_ID_BITS = 15L; 
		long max = -1L ^ (-1L << RANDOM_ID_BITS);
		System.out.println("max=" + max);
	}
	
}
