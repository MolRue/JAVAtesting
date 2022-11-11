package Scanner;

import java.util.Scanner;

public class Scanner_example {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // 객체 객체를받아올변수 = new 객체이름(System.in)

		System.out.println("X값 입력: ");
		String strX = scanner.nextLine(); // enter키를 누르면 문자열을 읽는다.
		int x = Integer.parseInt(strX);

		System.out.println("Y값 입력: ");
		String strY = scanner.nextLine(); // enter키를 누르면 문자열을 읽는다.
		int y = Integer.parseInt(strY);

		int result = x + y;
		System.out.println("result: " + result);
		System.out.println();

		while (true) {
			System.out.println("입력 문자열: ");
			String data = scanner.nextLine();
			
			//if (data=== "q"); ← JS로 따지면 이거
			
			if (data.equals("q")) {  // 입력받은 데이터가 q인가?
				break;
			}
			
			System.out.println("출력 문자열: " + data);
			System.out.println();
			
		}
	System.out.println("종료");
	}
}
