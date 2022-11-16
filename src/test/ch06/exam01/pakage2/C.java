package test.ch06.exam01.pakage2;

import test.ch06.exam01.pakage1.A;
import test.ch06.exam01.pakage1.B;

public class C {
//	A a = new A(); // A클래스(default) 접근 불가.
//	B b = new B(); // B클래스(public) 자유롭게 접근 가능.
//	A a1 = new A(true);  	//O
//	A a2 = new A(1);		//X : default는 같은 패키지 내에서만 호출할수 있다.
//	A a3 = new A("문자열");	//X : private는 같은 클래스 내에서만 호출할수 있다.
	
	public C() {
	/*
	// A클래스와 같은 패키지에 있으므로 A클래스에 접근이 가능하다.
	A a1 = new A(true);  	//O
	A a2 = new A(1);		//O
	A a3 = new A("문자열");	//X : private는 같은 클래스 내에서만 호출할수 있다.
	*/
	
	A a = new A();
	
	a.field1 = 1;		// O
	a.field2 = 1;		// X
	a.field3 = 1;		// X
	a.method1();		// O
	a.method2();		// X
	a.method3();		// X
	
}
}
