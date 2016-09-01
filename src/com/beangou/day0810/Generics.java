package com.beangou.day0810;

public class Generics {

	public static void main(String[] args) {
		Holder1<Integer> h1 = new Holder1<>();
		h1.setA(5);
		System.out.println(h1.getA());
		
		TwoTuple<String, Integer> twoTuple = new TwoTuple<>("first", 2);
		System.out.println(twoTuple.first);
		
		FourTuple<Integer, String, StringBuffer, Byte> four = new FourTuple<>(1, "2", new StringBuffer("c"), (byte)5);
		System.out.println("********");
//		four.third = new StringBuffer("44");
		System.out.println(four.third);
	}

}

class Holder1<T> {
	private T a;

	/**
	 * @return the a
	 */
	public T getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(T a) {
		this.a = a;
	}
	
}

class TwoTuple<A, B> {
	public final A first;
	public final B second;
	public TwoTuple(A a, B b) {
		this.first = a;
		this.second = b;
	}
	
	public String toString() {
		return "(" + first + "," + second + ")";
	}
}

class ThreeTuple<A, B, C> extends TwoTuple<A, B> {
	public final C third;
	public ThreeTuple(A a, B b, C c) {
		super(a, b);
		this.third = c;
	}
}

class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C> {
	public final D fourth;
	public FourTuple(A a, B b, C c, D d) {
		super(a, b, c);
		this.fourth = d;
	}
}

