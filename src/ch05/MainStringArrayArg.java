package ch05;

public class MainStringArrayArg {

	public static void main(String[] args) {
		// arg : 프로그램을 실행할때 미리 값을 넣을 수 있는거..?
		
		if(args.length !=2) {
			System.out.println("입력값 부족");
			System.exit(0); // 프로그램 강제 종료
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println("결과 : " + result);
		
	}

}
