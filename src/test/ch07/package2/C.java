package test.ch07.package2;
// 다른 package 내의 클래스
import test.ch07.package1.A;

public class C {
	public void method () {
		A a = new A();	//X
		a.field = "1";	//X
		a.method();		//X
	}
}
