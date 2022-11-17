package ch07;
// 상속
public class SmartPhoneEX {

	public static void main(String[] args) {
		System.out.println("그녀석은 우리중 최약체다!");
		SmartPhone myPhone = new SmartPhone("갤", "파랑색");
		System.out.println("과연 이건 언제?");
		
		//phone 에서 상속받은 필드 읽기 : 자식 객체에서는 얼마든지 부모 필드에 접근할 수 있다.
		System.out.println(myPhone.model + ","+ myPhone.color);
		// 부모 객체에서 상속 받은 메소드 역시 쓸수있다.
		myPhone.bell();
		myPhone.sendVoice("여보세요?");
		myPhone.reciveVoice("누구여?");
		myPhone.hangUp();
		
		myPhone.setWifi(false);
		System.out.println(myPhone.wifi);
	}

}
