package ch06;

public class Calculator {
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
