package CH11.APIDocument;

import java.util.Random;

public class UtilRandom {

	public static void main(String[] args) {
		// random 사용법2. 유틸리티 임포트

		// 그냥생성
		// 현재 시간을 이용해서 랜덤한 숫자를 생성
		Random rand = new Random();
		
		for (int i = 0; i <= 5; i++) {
			// int 타입의 난수를 리턴해준다. nextInt(n) : 0 <= n 까지의 int값을 생성 
			System.out.println(rand.nextInt(10) + ",");
		}
		System.out.println("--------------------------");
		// long seed 
		// 종자값을 이용해서 랜덤한 숫자를 생성
		Random rand2 = new Random(11);	// 입력한 11 이 seed가 된다.
		for (int i = 0; i <=6; i++) {
			System.out.println(rand2.nextInt(10) + ",");
		// 랜덤한 숫자가 나오긴 하지만, 기준이 seed 값이라서 재실행 해도 같은 숫자가 나온다.
		// 컴퓨터는 난수를 생성하는걸 어려워 한다. 그래서 난수 생성 알고리즘은 seed를 통해서 혹은 현재 시간을 통해서 생성한다. 
		}
	}

}
