package CH09LocalNA;

public class ALocal {
	void useB(int arg) {
		int var = 1; // Java7 이전 버전까지는 final int var 과 동일. 즉, final을 붙인것과 같은 효과
		class B {
			// B클래스의 인스턴스 필드
			int field1 = 1;
			
			// 생성자
			B() {
				System.out.println("B 생성자 실행");
			}
			
			// 인스턴스 메소드
			void method1() {
				System.out.println("B 메소드 실행");
			}
//			void method2() {
//				// final 을 붙인것과 같은 판정이라 값을 바꿀수가 없다!
//				arg = 2;
//				var = 2;
//			}
			
		}
		// 메소드 안에서 로컬 객체 생성
		B b = new B();					//생성자 실행
		System.out.println(b.field1);	// 필드를 출력해주고~
		b.method1();					// B 메소드 실행
		
		
	}	
}
