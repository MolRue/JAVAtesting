package CH10;

public class ExceptionEX2 {
	
	public static void main(String[] args) {
		try { 
			Class.forName("java.lang.String2");	// 주어진 클래스를 찾는 코드 // try catch문을 반드시 써줘야 한다.
			System.out.println("java.lang.String 클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}  
	}
}
