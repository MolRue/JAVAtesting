package CH13MultiThread;

import java.awt.Toolkit;

public class ThreadNameEX {

	public static void main(String[] args) {
		//main 스레드
		Thread mainThread = Thread.currentThread(); // main 스레드를 얻어온다.
		System.out.println(mainThread.getName());
		
		//스레드 3개 생성하는 for문
		for (int i = 0; i < 3; i++) {
		Thread threadA = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + "실행"); // 스레드 이름을 가져온다.
				// 익명구현 객체라서 getName을 바로 쓸수가 있다. runnable을 상속받는다.
			}		
		};
		threadA.start();
		}
		
		// chat 스레드 생성
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + "실행"); // 스레드 이름을 가져온다.
				// 익명구현 객체라서 getName을 바로 쓸수가 있다. runnable을 상속받는다.
			}
		};
		chatThread.setName("chat-Thread");  // 스레드가 실행되기 전에 이름을 바꾼다.
		chatThread.start();
		}
//	스타트가 있어야 스레드가 프로세스에 올라간다.
	}

