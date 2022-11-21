package CH07_Mart;

import java.util.ArrayList; // java에서 제공하는 ArrayList 

public class CustomerApplication { 
//필드선언
	// Customer 객체를 저장할 ArrayList 를 생성. ArrayList기능 import필요.
	private static ArrayList<Customer> customerList = new ArrayList<>();

	public static void main(String[] args) {
//생성자
		// Silver고객 명단
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");

		// Gold고객
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerJung = new GoldCustomer(10040, "정약용");

		// VIP고객
		Customer customerYul = new VIPCustomer(10050, "이율곡", 12345);
		// 필드의 경우 부모의 필드에만 접근 할수 있었고, override 된 메소드에는 부모필드에서도 접근이 가능.
// 메소드
		// add라는 메소드를 이용해서 배열을 넣는다.
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerJung);
		customerList.add(customerYul);

		// static 이라 따로 조치없이 호출이 가능하다. (전역변수니깐)
		showAllCustomer();

		// id로 고객찾기
		Customer customer = findCustomer(10050); // customer 객체를 받는 역할.
		
		// id로 찾은 고객의 실제 지불금액, 보너스 포인트 출력
		if (customer == null) {
			System.out.println("존재하지 않는 회원입니다.");
		} else {
			//고객의 실제 지불금액 & 보너스포인트
			showPriceBonus(customer, 10000);
		}
	}

	// 모든 고객 정보 출력 메소드
	public static void showAllCustomer() {
		System.out.println("===============모든 고객정보 출력==============");
		for (Customer customer : customerList) { // for (데이터타입 변수 : array리스트)
			System.out.println(customer.showCustomerInfo());
		}
	}

	// id로 고객객체를 찾아주는 메소드
	public static Customer findCustomer(int customerID) {// 여기선 리턴타입이 Customer 이다.
		Customer resultCustomer = null;

		for (Customer customer : customerList) {
			//해당 객체의 customerID와 매개변수로 받아온 (getCustomerID)가 같은지 비교한다.
			if (customer.getCustomerID() == customerID) {
				resultCustomer = customer;
				break; // !! 원본에는 break가 누락되었다. 참고!
			}
		}
		return resultCustomer; // 해당 객체를 찾지 못하면 null을 리턴해준다.	
	}
	public static void showPriceBonus(Customer customer, int price) {
		System.out.println("=================해당고객의 할인율과 보너스 포인트 계산=========");
		int cost = customer.calcPrice(price); // override에 정의해둔 계산식 결과가 cost 객체에 저장될예정
		System.out.println(customer.getCustomerName()+"님의 지불금액: " + cost + "원");
		System.out.println(customer.getCustomerName()+"님의 현재 보너스 포인트: "+ customer.bonusPoint +"점");
		}
}

// 1. 코드에 대한 이해
// 2. 시험지엔 빈칸이 뚫려있을거임.  