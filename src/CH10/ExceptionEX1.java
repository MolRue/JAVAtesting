package CH10;

public class ExceptionEX1 {

//	//오류를 방지하려면 if문을 넣는다는 선택지도 있지만...
//	public static void printLength(String data) {
//		int result = data.length(); // 문자 수(갯수)를 데이터로 뽑아온다!?
//		System.out.println("문자 수: " + result);
//	}
//	
//	public static void main(String[] args) {
//		System.out.println("프로그램 시작\n");
//		printLength("ThisIsJava");
//		printLength(null);
//		System.out.println("프로그램 종료");
//	}
	
	public static void printLength(String data) {
		try {		// 실행시킬 코드를 작성
			int result = data.length(); // 문자 수(갯수)를 데이터로 뽑아온다!?
			System.out.println("문자 수: " + result);
		} catch(NullPointerException e) { // NullPointerException : 잡고싶은 에러 이름 || e : 변수이름
			// 에러가 났을때, 실행시킬 코드를 입력한다.
			// 예외 처리 정보를 얻는 3가지 방법
//			System.out.println(e.getMessage()); 	 // 예외가 발생한 이유만 return 한다.
//			System.out.println(e.toString());		//예외가 발생한 이유 + 예외 종류를 return 해준다.
			e.printStackTrace();					//예외가 발생한 이유 + 예외의 종류 + 예외가 발생한 곳  을 return 해준다.
			
		} finally { // 옵션이다! 필요없기도 하다. 오류 여부와 상관없이 무조건 마지막에 실행되는 코드.
			System.out.println("마무리실행\n");
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("프로그램 종료");
	}
}
