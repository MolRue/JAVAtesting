package test.ch03;

public class LogicalOperatior {

	public static void main(String[] args) {
		int charCode = 'A';
		
		// & : 앞이 false여도 뒤에걸 계산한다.
		if ((65<=charCode) & (charCode<=90)) { //65~90
			System.out.println("대문자군요???");
		}

		// && : 앞이 false면 뒤에는 계산조차 하지않는다.
		if ((97<=charCode) && (charCode<=122)) { //97~122
			System.out.println("소문자군요???");
		}
		
		if ((48<=charCode) && (charCode<=57)) {
			System.out.println("0-9숫자군요???");
		}
		
		int value = 6;
		
		if ((value%2==0) | (value%3==0)) {
			System.out.println("2또는 3의 배수");
		} 
		
		if ((value%2==0) || (value%3==0)) {
			System.out.println("2또는 3의 배수");
		}		
		
	}

}
