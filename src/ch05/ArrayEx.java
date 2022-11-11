package ch05;

public class ArrayEx {

	public static void main(String[] args) {
//		String[] season = {"Spring","Summer","Autumn","Winter"};
//		String season2[]; //선언만 해둔것
		/*
		 * String season[] = {"Spring","Summer","Autumn","Winter"};
		 * 
		 * System.out.println(season[0]); System.out.println(season[1]);
		 * System.out.println(season[2]); System.out.println(season[3]);
		 * 
		 * season[1] = "여름"; System.out.println(season[1]);
		 * 
		 * int[] scores = {83, 90, 87};
		 * 
		 * int sum = 0; for (int i=0 ; i<3 ; i++) { sum += scores[i]; }
		 * 
		 * double avg = (double) sum/3;
		 * 
		 * System.out.println("총합: "+ sum + "평균" + avg );
		 */

		
		/** 
		  초기값
		  int : 0
		  long : 0L
		  short: 0
		  byte : 0
		  char : \u0000
		  float : 0.0f
		  double : 0.0
		  boolean : false
		  
		  string : null (클래스는 초기값이 null)
		  **/
		int[] arr1 = new int[3]; 
		for (int i = 0; i < 3; i++) {
			arr1[i] = 10;
			System.out.println(arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for (int i = 0; i < 3; i++) {	
			System.out.println(arr2[i]);
		} 
		
		String[] arr3 = new String[3];
		for (int i = 0; i < 3; i++) {	
			System.out.println(arr3[i]);
		} 
		
	}

}
