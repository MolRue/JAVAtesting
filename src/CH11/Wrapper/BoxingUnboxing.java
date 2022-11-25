package CH11.Wrapper;

public class BoxingUnboxing {

	public static void main(String[] args) {
		Integer obj = 100;		//Integer : 정수(숫자)형을 받기위해 만들어진 객체 // boxing : 기본타입(primitive type)의 값을 포장객체로 만드는 것.
		int value = obj; //unboxing : 포장 객체를 기본타입으로 만드는 것. 

		int value2 = obj + 5; 	// 연산을 위해 언박싱 하고, 합쳐진 값을 value2에 넣는다. = obj는 5와 연산되기 위해 언박싱된다.
		
		System.out.println("value: " + obj.intValue());
		
		System.out.println("value2: " + value2);
	}

}
