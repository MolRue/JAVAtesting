package com.java.ex;

public class ChildClass extends ParentClass {
	public ChildClass() {
		System.out.println("자식 클래스 입니다.");
	}
	@Override
	public void method1() {
		super.method1();
		System.out.println("자식 클래스 method1() 입니다.");
	}
}
