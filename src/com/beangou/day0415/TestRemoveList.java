package com.beangou.day0415;

import java.util.ArrayList;
import java.util.List;

public class TestRemoveList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("11111");
		list.add("11112");
		list.add("11113");
		list.add("11114");
		list.add("11115");
		System.out.println(list);
		String first = list.remove(0);
		System.out.println(first);
		System.out.println(list);
	}

}
