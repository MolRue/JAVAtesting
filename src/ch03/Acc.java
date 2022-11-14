package ch03;

public class Acc {

	public static void main(String[] args) {
		
		/*
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		// 정확한 계산ㅇ느 항상 정수로 해야한다.
		double result = apple - number * pieceUnit;
		System.out.println("사과 1개에서 남은 양 : " + result);
		*/
		
		/*
		int apple = 1;
		int totalPiece = apple * 10;
		int number = 7;
		
		int result = totalPiece - number;
		System.out.println("사과 1개에서 남은 양 : " + result / 10.0);
		*/
		
		int x = 5;
		double y = 0.0;
		double z = x / y;
//		double z = x % y;
		
		System.out.println(z);
		
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z);
		}

	}

}
