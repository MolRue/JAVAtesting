package ch07poly;

public abstract class Animal {
	//abstract class : 상속을 하기위해서 만들어진 불완전한 클래스. 일반적인 메소드와 추상메소드 모두 가질수 있다.
	
	// 메소드 선언
	public void breathe() {
		System.out.println("숨쉬기운동");
	}
	
	// 추상메소드 선언
	public abstract void sound();
	// 추상 메소드는 구현을 할수가 없다! 그냥 이렇게만....
	// ★★★추상 메소드는 자식클래스에서 반드시 오버라이딩 되야 한다. 
	
}
