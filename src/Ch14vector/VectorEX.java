package Ch14vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorEX {

	public static void main(String[] args) {
//		List<Board> list2 = new Vector<>();   // 이렇게 써도 된다! //list 는 vector의 부모 인터페이스 이다.(자동형변환)
//		list2.add(null);
		
//		Vector<Integer> list = new Vector<>();	// generic은 클래스 명이랑 인터페이스만 쓸수있...
//		list.add(1);
		
		Vector<Board> list = new Vector<>();
//		ArrayList<Board> list = new ArrayList<>();	// ArrayList는 동기화가 되지 않아서 기다려주지 않는다. 그래서 앞부분 코드가 끝나기 전에 뒷부분 코드가 시작되버린다.
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for(int i=1 ; i<=1000 ; i++) {
					list.add(new Board("제목", "내용", "글쓴이"));
				}
			}
		};
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for(int i=1001 ; i<=2000 ; i++) {
					list.add(new Board("제목", "내용", "글쓴이"));
				}
			}
		};
		threadA.start();
		threadB.start();
		
		// 작업 스레드들이 모두 종료될 때 까지 메인 스레드를 기다리게 하는 코드
		
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {
			
		}
		
		int size = list.size();
		System.out.println("총 객체 수: " + size);	// 0개가 나오는 이유 : 메인이 먼저 실행 되고, 스레드의 run이 실행되기도 전에 코드가 끝나서 0으로 나온다
		System.out.println();
		
	}
}
