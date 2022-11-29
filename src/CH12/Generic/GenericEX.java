package CH12.Generic;

public class GenericEX {

	public static void main(String[] args) {
//		Box<String> box1 = new Box<String>();
		Box<String> box1 = new Box<>();
		box1.content = "안녕하세요?";
		String str = box1.content;
		System.out.println(str);
		
		//int를 클래스로 표현하면 Integer가 된다.
		Box<Integer> box2 = new Box<>();
		box2.content = 1000;
		int val = box2.content;
		System.out.println(val);
	}
}
