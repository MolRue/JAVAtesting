package ch_unknown_연습용패키지;

/**이건 바깥 클래스**/
	class A {
		A() { System.out.println("A라는 객체가 생성된다."); }
	

/**이건 인스턴스 멤버 클래스**/
	class B {
		B(){System.out.println("B라는 객체가 생성된다.");}
		int field1;
		// static int field2;
		void method1() {}
		// static void method2() {}
	}


/**이건 정적 멤버 클래스**/
	static class C {
	C() {System.out.println("C라는 객체가 생성된다.");}
	int field1;
	static int field2;
	
	void method1() {}
	static void method2() {}
	}
	
	void method() {
		
/**이건 로컬 클래스**/
		class D{
			D() {System.out.println("D라는 객체가 생성된다.");}
			int field1;
			void method1() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
