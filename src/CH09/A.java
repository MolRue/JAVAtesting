package CH09;

public class A {
	
	// 인스턴스 멤버 클래스 (중첩된 클래스)
	// 사용가능한 접근 제한자: public, default , private
	class B{
		//필드
		int field1 = 1;
		
		//생성자
		B() {
			System.out.println("B 생성자 실행");
		}
		
		//메소드
		void method1() {
			System.out.println("B 메소드1 실행");
		}
	}
	
	/*
	// ↑ 필드, 생성자, 메소드 에서 호출 가능하다. 아무대서나 호출ㅇ느 어렵고 내부에서 사용가능하다.
	//1. 필드로 만들기
	B field = new B();
	// field.000000
	
	//2. A클래스 생성자에서 생성자로 사용하기.(생성자로 만들기)
	A() {
		B b = new B();
	}
	
	//3. 메소드로 만들기
	void method() {
		B b = new B();
	}
	*/
	
	// A클래스의 메소드
	void useB () {
		B b = new B();
		System.out.println(b.field1);
		b.method1();
	}
}
