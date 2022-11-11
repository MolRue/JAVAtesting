package ch06;

public class ClaculatorEX {

	public static void main(String[] args) {
		// Calculator 에서 만든 메소드를 객체를 만들어서 여기서 실행
		
		Calculator myCalc = new Calculator ();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println(result1);
		
		int x = 10, y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println(result2);
	}

}
