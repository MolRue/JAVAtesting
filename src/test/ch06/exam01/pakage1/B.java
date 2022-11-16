package test.ch06.exam01.pakage1;

public class B {
	public void method() {
	/*
	// A클래스와 같은 패키지에 있으므로 A클래스에 접근이 가능하다.
	A a1 = new A(true);  	//O
	A a2 = new A(1);		//O
	A a3 = new A("문자열");	//X : private는 같은 클래스 내에서만 호출할수 있다.
	*/
	
	A a = new A();
	
	a.field1 = 1;		// O
	a.field2 = 1;		// O
	a.field3 = 1;		// X
	a.method1();		// O
	a.method2();		// O
	a.method3();		// X
	
}}
