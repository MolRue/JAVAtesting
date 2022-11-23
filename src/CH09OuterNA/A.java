package CH09OuterNA;

public class A {
	// A클래스 인스턴스 필드와 메소드
	int field1;
	void method1() {}
	
	// A클래스 정적 필드와 메소드
	static int field2;
	static void method2() {}
	
	
	// 인스턴스 멤버 클래스
	class B {
		void method() {
			field1 = 10;	//O
			method1();		//O
			
			field2 = 10;	//O
			method2();		//O
		}
	}

	// 정적 멤버 클래스
	static class C {
		void method() {
			// 정적 멤버 클래스 에서는 바깥 클래스의 인스턴스 필드와 메소드에 접근할수 없다.
			field1 = 10;	//X
			method1();		//X
		
			// 오직 static 클래스와 메소드에만 접근 가능하다.
			field2 = 10;	//O
			method2();		//O
		}
	}
}
