package ch07;
//final 을 붙이면 부모클래스로 사용할 수 없다.(상속불가) 
//public final class Airplane {
public class Airplane {
	//메소드
	public void land() {
		System.out.println("착륙");
	}
// 메소드에 final 을 붙이면 오버라이드 할 수 없다.	
//	public final void fly() {
//		System.out.println("일반 비행");
//	} 
	public void fly() {
		System.out.println("일반 비행");
	}
	public void takeoff() {
		System.out.println("이륙");
	}
}
