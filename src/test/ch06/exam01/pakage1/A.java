package test.ch06.exam01.pakage1;
// 클래스는 public, default 접근제한자를 가질 수 있다. 아무것도 안쓰면 default이다.
/* 필드 : 
 * 생성자 : public, default, private
 * 메소드 : 
 * */

public class A { // pirvate 생성자는 같은 클래스 내에서만 사용가능하다.
	/*
	public A(boolean b) {
		
	}
	A(int b) {
		
	}
	private A(String s) {
		
	}
	*/
	
	public int field1;
	int field2;
	private int field3;
	
	public A() {
		field1 = 1;		// O
		field2 = 1;		// O
		field3 = 1;		// O
		method1();		// O
		method2();		// O
		method3();		// O
	}
	
	public void method1() {}
	void method2() {}
	private void method3() {}
}
