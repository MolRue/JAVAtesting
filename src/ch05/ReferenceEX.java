package ch05;

public class ReferenceEX {

	public static void main(String[] args) {
		/*
		int[] arr1; 
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] { 1, 2, 3};
		arr2 = new int[] { 1, 2, 3};
		arr3 = arr2;						// arr2의'값'이 아닌 '주소'를 arr3에 넘겨준다.
		
		System.out.println(arr1 == arr2);  	// Java에서 ==는 값을 비교하는 것이 아니라 주소를 비교한다.
		System.out.println(arr2 == arr3);
	
		int[] intArray = null;
		intArray[0] = 10;
		*/
		
		/*
		String[] strArray = new String[3];
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String("java");
		
		System.out.println(strArray[0] == strArray[1]);			
		System.out.println(strArray[0] == strArray[2]);			// 번지수가 다르다..???
		System.out.println(strArray[0].equals(strArray[2])); 	//equals는 단순히 값으로 비교하니까 true가 나온다.
		*/
		
		/*
		//배열 정의
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		/*
		//배열 복사
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		*/
		/*
		System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length);
		// System.arraycopy(원본배열, 원본배열 복사 시작 인덱스, 새배열, 새배열 붙여넣기 시작 인덱스, 복사 항목수)
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.println(newIntArray[i] +",");
		}
		*/
		
		int[] scores = {95, 71, 84, 93, 87};
		int sum = 0;
		
		for (int score : scores) {
			System.out.println(score);
			sum += score;
		}
		
		System.out.println(sum);
		
		
	}

}
