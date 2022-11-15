package test.ch06.exam01.pakage2;

import test.ch06.exam01.pakage1.A;
import test.ch06.exam01.pakage1.B;

public class C {
//	A a = new A(); // A클래스(default) 접근 불가.
//	B b = new B(); // B클래스(public) 자유롭게 접근 가능.
	A a1 = new A(true);  	//O
	A a2 = new A(1);		//X : default는 같은 패키지 내에서만 호출할수 있다.
	A a3 = new A("문자열");	//X : private는 같은 클래스 내에서만 호출할수 있다.
}
