package ch07MartRemind;

public class Customer {
// +:public -:private #:protected ~:default
	// 필드선언
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRate;
	
	// 생성자 : 클래스 초기값을 설정하자.
	public Customer() {
		initCustomer();
	}
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	private void initCustomer() {
		customerGrade = "SILVER"; // 이건 초기등급. 
		bonusRate = 0.01; // 선언된 할인율 필드의 초기값.
	}
	
	// 메소드! 실제로 행동하는 친구들?
	
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRate); // += 누적합산! bonusPoint는 price X bonusRate 를 
		return price; 		// price로 리턴해준다.
	}
	
	public String showCustomerInfo() { // showCustomerInfo로 요청받으면 "(customerName) 님의 회원등급 :(customerGrade) 보너스포인트 : "bonusPoing" 로 출력되도록 리턴 
		return customerName + "님의 회원 등급 : " + customerGrade +"||"+"보너스 포인트 : " + bonusPoint + "점" + "||";
	}
	
	// get, set 메소드를 불러온다! 소스소스소스소스
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
