package ch07;

public class ChildEX {

	public static void main(String[] args) {
		// 자식객체
		Child child = new Child();
		
		Parent parent = child; // 부모가 자식을 품고있음 → 자동 타입변환
		
		parent.method1();	// Parent 에 있는 method1
		parent.method2();	// Parent 에 있는 method2 가 오버라이드 된 Child-method2
//		parent.method3();	// 객체간 자동 형변환이 일어났을때는 자식 객체에 있는 메소드는 불러올수 없다.

		parent.a = 2;
//		parent.b = 1;	// 자식 객체에 있는 필드는 불러오지 못한다.
		
		Parent parent1 = new Child(); // 자동 타입 변환
		

		//instanceof : 객체타입 확인을 위해 자바에서 제공하는 연산자
		//parent 가 Child 타입이 아니라면 강제타입 반환을 할수 없으므로 확인을 위해 추가한 if문 
		
		if (parent1 instanceof Child) { //parent 매개 변수가 Child객체를 담고 있는가?
			
		Child child1 = (Child)parent; // 강제 타입 변환 
		child1.b = 1;	//자식 객체에 있는 필드에 접근 가능
		child1.method3();  // 자식 메소드에 있는 필드애 접근가능
		}
	}
}


