package com.springcore.ref;

public class A {
	private int A;
	private B ob;
	public int getA() {
		return A;
	}
	public void setA(int a) {
		A = a;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	public A(int a, B ob) {
		super();
		A = a;
		this.ob = ob;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [A=" + A + ", ob=" + ob + "]";
	}
	
	

}
