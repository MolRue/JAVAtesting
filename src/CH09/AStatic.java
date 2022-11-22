package CH09;

public class AStatic {
	
	// 사용가능한 접근제한자 : public, private, default
	static class B {
		int field1 = 1;
		
		B() {
			System.out.println("B 생성자 실행");
		}
		
		void method1() {
			System.out.println("B 메소드 실행");
		}
	}
	//1. 필드로 사용
	B field = new B();
	
	//정적 필드값으로 사용가능
	static B field2 = new B();
	
	//2. 생성자에서 사용
	public AStatic() {
		B b = new B();
	}
		
	//3. 메소드 에서 사용가능
	void method1() {
		B b = new B();
	}
	// 정적 메소드에서 사용 가능
	static void method2() {
		B b = new B();
	}

}
