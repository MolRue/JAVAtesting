package CH09;

public class AEX {

	public static void main(String[] args) {
		/*
		// 외부(다른클래스) 에서 중첩클래스 사용하기
		A a = new A();
		// 중첩클래스는 항상 바로 들어갈순 없고 외부(A) 클래스를 통해 내부(B) 클래스를 호출해야 한다.
		A.B b = a.new B(); 
		*/
		
		A a = new A();
		a.useB();
	}

}
