package ch06_Class;

public class Example2 { //21번

	public static int max(int[] arr) { // 조건식 에만 리턴이있어서..
		// 주어진 배열이 null 이거나 0 인 경우 -999999를 반환한다.
		if (arr == null || arr.length == 0) {
			return -999999;
		}
		int max = arr[0];
		// 최대값을 하나씩 비교하게 시켜야함
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] >= max) {
				max = arr[i];
			}
		}
		return max;

	}

	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열

	}

}
