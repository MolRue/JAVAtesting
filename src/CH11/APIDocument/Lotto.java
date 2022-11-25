package CH11.APIDocument;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		//선택번호 (내가 선택한 번호)
		int[] selectNumber = new int[6]; // 선택한 6개의 번호를 저장할 배열
		Random random = new Random();
		System.out.println("선택번호");
		
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;	// 1~45범위의 숫자로 만든다.
			System.out.println(selectNumber[i] + " ");
		}
		System.out.println("");
		
		//당첨번호 (난수로 생성된 번호, 컴퓨터가 주는 번호)
		
		int[] winNumber = new int[6]; // 당첨된 6개의 번호를 저장할 배열
		Random random2 = new Random(5);
		System.out.println("당첨번호");
		
		for(int i=0; i<6; i++) {
			winNumber[i] = random2.nextInt(45) + 1;	// 1~45범위의 숫자로 만든다.
			System.out.println(winNumber[i] + " ");
		}
		System.out.println("");
		
		//당첨여부 (두 번호가 일치하는지 여부)

		Arrays.sort(selectNumber);	// 비교하기 전에 배열값을 정리 : 배열 내부 값들이 정렬된 상태로 바뀐다.
		Arrays.sort(winNumber);
		
		boolean result = Arrays.equals(selectNumber, winNumber);
		System.out.println("당첨여부: ");
		
		if (result) {
			System.out.println("당첨");
		} else {
			System.out.println("안당첨");
		}

	}

}
