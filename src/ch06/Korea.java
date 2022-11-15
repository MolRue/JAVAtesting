package ch06;

public class Korea {
	//인스턴스 필드
	//final field : 파이널필드, 처음이자 최종값. 절대값??? 저장된 값을 변경할수가 없다.
	//파이널 필드는 초기값을 반드시 줘야 한다.
	final String nation = "대한민국";
	final String ssn; //주민번호? 초기값을 안주면 오류발생! 생성자에서 초기값을 주거나, 필드 선언시에 초기값을 정해줘야 한다.
	
	
	// 인스턴스 필드
	String name;
	
	// 생성자
	Korea(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
