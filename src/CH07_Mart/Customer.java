package CH07_Mart;

public class Customer {
	// 필드
	protected int customerID; // 고객 이아디
	protected String customerName; // 고객 이름
	protected String customerGrade; // 고객 등급 : silver, gold 등등...
	int bonusPoint; // 포인트 적립 변수
	double bonusRatio; // 보너스 포인트 적립 비율

	// 생성자 : 클래스의 초기값
	public Customer() {
		initCustomer();
	}

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}

	// 고객 등급 초기화 메소드
	private void initCustomer() {
		customerGrade = "SILVER"; // 초기등급은 여기에.
		bonusRatio = 0.01; // 필드에 초기값을 주기.
	}
	// 메소드 :클래스가 가진 기능
	// 보너스 포인트 계산, 가격리턴
	public int calcPrice(int price) { // price :지불금액
		bonusPoint += (price * bonusRatio); // += : 누적합산. 포인트는 쌓여야 하니깐. 보너스 비율을 계산해서 보너스 포인트를 적립해준다.
		return price; // 적립은 따로 return 하지 않아도 되지만, 사용된 가격은 return 해줘야 한다.
	}

	// 고객정보 보여주는 코드
	public String showCustomerInfo() {
		return customerName + "님의 등급: " + customerGrade + "보너스 포인트: " + bonusPoint + "점";
	}

	// get, set 메소드
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

}
