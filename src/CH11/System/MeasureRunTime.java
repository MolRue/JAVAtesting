package CH11.System;

public class MeasureRunTime {

	public static void main(String[] args) {
		
		long time1 = System.nanoTime();
		
		int sum = 0;
		for (int i=1 ; i<=1000000 ; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		double time = (time2 - time1) / 1000000000.0;
		System.out.println(sum);
		System.out.println(time2 - time1 + "나노초가 소요되었습니다.");
		System.out.println(time1);
		System.out.println(time);
	}

}
