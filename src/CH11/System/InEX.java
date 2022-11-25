package CH11.System;

import java.io.IOException;

public class InEX {

	public static void main(String[] args) throws IOException {
		int speed = 0;
		int keycode = 0;
		
		while(true) {
			// enter 키를 읽지 않았을때, 실행되는 코드
			if(keycode != 10 && keycode !=10) {
				if (keycode == 49) { //(49:숫자1) : 숫자 1키를 읽었을 경우
					speed++;
				} else if(keycode == 50) { // (50:숫자2)
					speed--;
				} else if (keycode == 51 ){ //(51:숫자3)
					break; 
				}
				System.out.println("----------------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("----------------------------");
				System.out.println("현재속도= " + speed);
				System.out.println("선택: ");
			}
			keycode = System.in.read();		// 입력된 키를 하나씩 읽음
			
		}
		System.out.println("프로그램 종료");
	}
	// main 은 JVM 에서 처리하는 곳이기 때문에, throws로 오류를 던지면 JVM이 알아서 처리해준다. 하지만 에러 내용을 받아서 처리해줄 장소가 필요하다.
}
