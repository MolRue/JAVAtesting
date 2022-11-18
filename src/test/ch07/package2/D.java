package test.ch07.package2;
// 상속 받은 다른 package 내의 클래스
import test.ch07.package1.A;

public class D extends A{
	public D() {
		super(); // A클래스의 생성자 호출
	}
	
	public void method () {
		super.field = "1";
		super.method();
		
		// 이미 상속 지정이 되있으므로 this 로 접근해도 된다.
		this.field = "1";
		this.method();
		
	}
	public void method2 () {
		// protected 사용시 직접 객체를 생성해서 사용할 수는 없다. 상속을 통해서만 사용가능.
		A a = new A();	//X
		a.field = "1";	//X
		a.method();		//X
	}
}
