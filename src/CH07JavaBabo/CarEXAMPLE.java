package CH07JavaBabo;

public class CarEXAMPLE {
	public static void main(String[] args) {
		CAR car = new CAR(); // Car객체 생성
		
		for(int i = 1; i <=5; i++) {
			int problemLocation = car.run();				//Car 객체의 run() 메소드 5번 반복실행
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");	//앞 왼쪽 타이어가 펑크났을때 HankookTire로 교체
				car.frontLeftTire = new HANKOOKTIRE("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 HankookTire로 교체");	//앞 오른쪽 타이어가 펑크났을때 KumhoTire로 교체
				car.frontRightTire = new KUMHOTIRE("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("앞왼쪽 HankookTire로 교체");	//뒤 왼쪽 타이어가 펑크났을때 HankookTire로 교체
				car.backLeftTire = new HANKOOKTIRE("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("앞왼쪽 HankookTire로 교체");	//뒤 오른쪽 타이어가 펑크났을때 KumhoTire로 교체
				car.backRightTire = new KUMHOTIRE("뒤왼쪽", 17);
				break;
			}
		System.out.println("------------------------------"); //1회전시 출력되는 내용을 구분
		}
		
	}
}
