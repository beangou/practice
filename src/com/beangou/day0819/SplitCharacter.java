package com.beangou.day0819;

public class SplitCharacter {
	public static void main(String[] args) {
		String[] a = "2016081721001004100242538925^0.10^SUCCESS".split("\\^");
		System.out.println(a.length);
	}
}
