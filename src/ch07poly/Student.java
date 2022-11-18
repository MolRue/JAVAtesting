package ch07poly;

public class Student extends Person{
	// 필드
	public int studentNo; // 학생번호
	
	// 생성자
	public Student(String name, int StudentNo) {
		super(name); // 부모생성자를 호출하는 역할
		this.studentNo = StudentNo;
	}
	
	// 메소드
	public void study() {
		System.out.println("공부를 합니다.");
	} //순서 8. 부모 클래스인 person에는 없는 매개변수를 형변환이 되어서 매개변수가 추가되고
}
