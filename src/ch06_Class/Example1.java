package ch06_Class;

public class Example1 { //20번
	public static boolean isNumber(String str) {
		// 주어진 문자열이 null 이거나 빈문자열"" 이라면 false를 반환한다
		if (str == null || str.equals(""))  
		return false;
		
		// 주어진 문자열이 숫자로만 이루어져 있는지 확인한다.
		// 모두 숫자로만 이루어져 있으면 true를 반환하고, 아닌경우 false를 반환한다.

//		char a = '8';
//		
//		System.out.println("char: " + (int)a);
		
		for (int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println("값" + ch);
			
			if (ch < '0' || ch > '9' ) { // 0보다 작거나 9보다 크면 숫자가 아니다 라고 전제해줌
				return false;
			} 
		}
		return true; 
	}
	
	 
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));

	}

}
