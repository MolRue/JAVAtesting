package ch07;

public class Child extends Parent{
	// 필드
	public int b;
	// 메소드
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	public void method3() {
		System.out.println("Child-method3()");
	}
	
}
