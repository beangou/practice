package com.beangou.day0811;

import java.math.BigDecimal;

public class MyBigDecimalTest {

	public static void main(String[] args) {
		BigDecimal a = new BigDecimal(1);
		BigDecimal b = new BigDecimal(10);
		System.out.println(a.divide(b));
		double aa = 1;
		double bb = 10;
		System.out.println(aa / bb);
		
		System.out.println(new BigDecimal(0.1)); // 此处有坑
		System.out.println(new BigDecimal("0.1"));
		
		System.out.println(0 == -0.01);
		
		System.out.println(0 == -0);
		System.out.println(Float.compare(0, -0));
//		Float.isNaN(v)
		
		double dou = 0;
		BigDecimal douBig = new BigDecimal("0"); 
		for (int i = 0; i < 26; i++) {
			dou += 0.1;
			douBig = douBig.add(new BigDecimal("0.1"));
		}
		System.out.println("dou=" + dou);
		System.out.println("douBig=" + douBig);
		
		int checkNum = 3;
		check(checkNum);
	}
	
	public static void check(Integer a) {
		if(a == null) {
			System.out.println("为空=" + a);
		}else {
			System.out.println("不为空=" + a);
		}
	}

}
