package ch06;

public class Calculator {

	// 메소드 오버로딩 : 같은 이름의 메소드를 여러개 만든다.
	// * 매개변수의 순서, 갯수, 타입 중 하나가 달라야 한다. 안그럼 에러남!!
	double areaRectangle (double width) {
		return width * width;
	}
	double areaRectangle (double h, int a) {
		return h * a;
	}
	double areaRectangle (double width, double height) {
		return width * height;
	}
	
	
	// 리턴값이 없는 메소드 선언
	void powerOn () {
		System.out.println("전원켠다.");
//		return; //리턴을 안써도 되고, 어차피 리턴값 필요없데
	}
	
	void powerOff () {
		System.out.println("전원꺼. 나안해..");
	}
	
	// int 형으로 리턴값이 있는 메소드???
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	// double 형으로 리턴값이 있는 메소드
	double divide(int x , int y) {
		double result = (double) x / (double) y ;
		return result;
	}
	
	
}
