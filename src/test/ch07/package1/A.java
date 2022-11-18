package test.ch07.package1;
// 부모클래스
// protected → 상속 관계, 같은 패키지 일때 접근 가능.(필드, 생성자, 메소드)
public class A {
	//필드
	protected String field;
	//생성자
	protected A() {}
	//메소드
	protected void method() {}
}
