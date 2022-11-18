package test.ch07.package1;
// 같은 package 내의 클래스
public class B {
	public void method () {
		A a = new A();	//O
		a.field = "1";	//O
		a.method();		//O
	}
}
