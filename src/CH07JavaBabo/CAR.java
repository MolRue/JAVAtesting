package CH07JavaBabo;

public class CAR {
	//필드
	TIRE frontLeftTire = new TIRE("앞왼쪽", 6);
	TIRE frontRightTire = new TIRE("앞오른쪽", 2);
	TIRE backLeftTire = new TIRE("뒤왼쪽", 3);
	TIRE backRightTire = new TIRE("뒤오른쪽", 4);

	//생성자
	//메소드
int run() {
	System.out.println("[자동차가 달립니다.]");
	if(frontLeftTire.roll() == false) {stop(); return 1;}
	if(frontRightTire.roll() == false) {stop(); return 2;}
	if(backLeftTire.roll() == false) {stop(); return 3;}
	if(backRightTire.roll() == false) {stop(); return 4;}
	return 0;
}
void stop () {
	System.out.println("[장비를 정지합니다.]");
}
}