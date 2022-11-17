package ch07;
// 상속
//부모클래스
public class Phone {
	//필드
	public String model; //모델
	public String color; //컬러
	
	//생성자1
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("부모생성자 실행");
	}
//	//생성자2
//	public Phone() {
//		System.out.println("부모생성자 실행"); // 부모생성자가 먼저 실행된다. 
//	}
//	
	//메소드
	public void bell() {
		System.out.println("벨이 울리네요.");
	}
	
	public void sendVoice(String message) {
		System.out.println("자기 목소리: " + message);
	}
	public void reciveVoice(String message) {
		System.out.println("상대방 목소리: " + message);
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다.뚜-뚜-뚜-");
	}
}
