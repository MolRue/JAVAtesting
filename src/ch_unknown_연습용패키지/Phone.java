package ch_unknown_연습용패키지;

public abstract class Phone {
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}

	//메소드
	public void turnOn() {
		System.out.println("켠다???");
	}
	
	public void turnOff() {
		System.out.println("끈다???");
	}
	
	
}
