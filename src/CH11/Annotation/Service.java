package CH11.Annotation;

//@PrintAnnotation	// @PrintAnnotation 의 정책이 클래스에 적용된다.
public class Service {
	//필드
//	@PrintAnnotation	// @PrintAnnotation 의 정책이 필드에 적용된다.
	String test;
	
	//생성자
//	@PrintAnnotation	// @PrintAnnotation 의 정책이 생성자에 적용된다.
	Service() {}
	
	//메소드
	@PrintAnnotation	// 내가 쓰고싶은 메소드 바로 위에 붙여준다. @Override처럼!
	public void method1() {
		System.out.println("method1");
	}
	
	@PrintAnnotation
	public void method2() {
		System.out.println("method2");
	}
	
	@PrintAnnotation(value="#", number=20) // 값을 Annotation에 넘겨줄수 있다. value :이름, number: 실제값
	public void method3() {
		System.out.println("method3");
	}
}
