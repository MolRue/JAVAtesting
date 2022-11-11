package ch05;

public class StringMethod {

	public static void main(String[] args) {
		/*
		 * String ssn = "9506241230123"; // 주민번호 예시 char gender = ssn.charAt(6); //
		 * charAt( ) : index번호가 0부터 쭉쭉 int length = ssn.length();
		 * 
		 * if(length == 13) { System.out.println("주민번호 자릿수가 맞습니다."); } else {
		 * System.out.println("주민번호 자릿수가 맞지 않습니다."); }
		 * 
		 * switch (gender) { case '1' : case '3' : System.out.println("남자"); break; case
		 * '2' : case '4' : System.out.println("여자"); break; }
		 */

		/*
		 * String oldStr = "자바 문자열"; String newStr = oldStr.replace("자바", "JAVA");
		 * 
		 * System.out.println(oldStr); System.out.println(newStr);
		 */

		/*
		 * String ssn = "950624-1230123"; String firstName = ssn.substring(0, 6);
		 * System.out.println(firstName);
		 * 
		 * String lastName = ssn.substring(7); System.out.println(lastName);
		 */

		/*
		 * String subject = "자바 프로그래밍";
		 * 
		 * int location = subject.indexOf("프로그래밍"); System.out.println(location);
		 * 
		 * String substring = subject.substring(location);
		 * System.out.println(substring);
		 * 
		 * if (location != -1) { System.out.println("해당 문자열이 없습니다.");
		 * 
		 * boolean result = subject.contains("자바");
		 * 
		 * if (result) { System.out.println("자바와 관련된 책입니다."); } else {
		 * System.out.println("자바와 관련없는 책입니다."); }
		 */

		String board = "1, 자바 학습, 참조 타입 String 공부중";

		String[] tokens = board.split(",");

		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		

	}
}







