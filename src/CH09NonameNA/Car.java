package CH09NonameNA;

public class Car {
	// 필드에 Tire 객체 대입
	// 필드에서 익명 자식 객체 사용
	private Tire tire1 = new Tire();
	private Tire tire2 = new Tire() { // 익명객체! roll을 오버라이드 한다.
		@Override
		public void roll() { // Tire의 자식 객체로 판정되서 오버라이드가 가능해진다.
			// 이름없는 클래스 + 동시에 상속도 이루어짐 + 자동 형변환도 이루어짐
			System.out.println("한국타이어가 굴러갑니다.");
		}
	};
	
	//메소드
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	public void run2() {
		// 로컬변수에 익명 자식객체 사용
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("금호타이어가 굴러갑니다.");
			}
		};
		tire.roll();
		
	}
	
	//메소드에서 매개변수 이용.
	public void run3(Tire tire) {
		tire.roll();
	}
	
}
