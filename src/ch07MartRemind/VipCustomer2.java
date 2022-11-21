package ch07MartRemind;

public class VipCustomer2 extends Customer {
	// +:public -:private #:protected ~:default
	private int agentID;
	double saleRate;
	
	public VipCustomer2(int costomerID, String customerName, int agentID) {
		super(costomerID, customerName);
		super.customerGrade = "VIP";
		super.bonusRate = 0.03;
		this.saleRate = 0.2;
		this.agentID = agentID;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRate);
		return price - (int)(price * saleRate);
	}

	@Override
	public String showCustomerInfo() { // 오버라이드 되어 출력되는 메시지
		return super.showCustomerInfo() + "담당 상담원 아이디 :" + agentID;
	}
	
	public int getagentID() {
		return agentID;
	}
}