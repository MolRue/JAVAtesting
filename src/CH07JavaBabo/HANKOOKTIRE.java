package CH07JavaBabo;

public class HANKOOKTIRE extends TIRE {
	//필드
	
	//생성자
	public HANKOOKTIRE(String location, int maxRotation) {
	super(location, maxRotation);
	}
	
	//메소드
	@Override
	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명 : " + (maxRotation - accumulateRotation) + "회");
		return true;
		} else {
			System.out.println("***" + location + "HankookTire 펑크 ***");
		return false;
		}
		
	}
}


