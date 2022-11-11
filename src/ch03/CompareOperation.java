package test.ch03;

public class CompareOperation {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;

		boolean result1 = (num1 <= num2);

		System.out.println("result1: " + result1);

		char char1 = 'A'; // 유니코드:65
		char char2 = 'B'; // 유니코드:66
		boolean result2 = (char1 < char2);
		System.out.println("result2: " + result2);

		int num3 = 1;
		double num4 = 1.0;
		boolean result3 = (num3 == num4);
		System.out.println("result3: " + result3);

		// double 의 정밀도가 float 보다 높아서 결과값이 달라진다. → 강제 형변환을 시켜주면 된다.
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result4 = (num5 == num6);
		boolean result5 = (num5 == (float) num6);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);

		String str1 = "자바";
		String str2 = "java";

		boolean result6 = (str1.equals(str2));
		boolean result7 = (!str1.equals(str2));
		System.out.println("result6 : " + result6);
		System.out.println("result7 : " + result7);

	}
}
