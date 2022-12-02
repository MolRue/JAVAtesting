package Ch14vector;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEX {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		LinkedList<String> list2 = new LinkedList<String>();
		
		//시작시간과 끝시간을 저장할 변수 선언
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i=0 ; i<10000 ; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간: ", (endTime-startTime) );
		
		startTime = System.nanoTime();
		
		for (int i=0 ; i<10000 ; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간: ", (endTime-startTime) );	
		// 단순히 추가를 할때는 시간차이가 별로 없으나, 수정,삭제가 많은 경우엔 linkedList가 arrayList보다 속도가 빠르게 나온다.
	}

}
