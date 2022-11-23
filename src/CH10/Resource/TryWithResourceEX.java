package CH10.Resource;

public class TryWithResourceEX {
	
	public static void main(String[] args) {
		//try 안에 열고싶은 리소스 객체 생성
		try (MyResource res = new MyResource("A")) {
			String data = res.read1();
			int value = Integer.parseInt(data);  //int형으로 변환 
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try (MyResource res = new MyResource("A")) {
			String data = res.read2();  // NumberFormanException 에러 발생. read2는 abc라서 
			int value = Integer.parseInt(data);  //int형으로 변환 
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
// 1. 생성자가 실행. 열기 가 찍힘
// 2. read1이 실행되며 100 이 리턴됨. 이후 9줄에서 int형변환
// 3. AutoCloseable 때문에 자동으로 닫힘. 닫기 가 찍힘