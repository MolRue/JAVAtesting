package CH11.Wrapper;

public class ValueCompareEX {

	public static void main(String[] args) {
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		System.out.println(obj1 == obj2);	// Integer 는 객체라서 하나의 주소를 가지고있다. 그래서 == 로 비교하면 값이 다르게 나온다.
		System.out.println(obj1.equals(obj2));
		System.out.println("------------------------");
		
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println(obj3 == obj4);	
		System.out.println(obj3.equals(obj4));
		
		/**
		 <<<예외>>>
		 [값을 비교하는 타입]
		 Byte, Short, Int : -128 ~ 127 사이 범위값이라면 단순히 값만 비교한다.
		 범위 밖의 숫자가 대입된다면, 주소값도 비교한다!
		 Boolean 
		 Character(char)
		  
		  **/
		 
		
	}

}
