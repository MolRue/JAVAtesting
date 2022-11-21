package CH07_Mart;

public class VIPCustomerOther extends Customer{
	// 다형성의 최대 장점은 갈아끼우기!!
	//필드
	private int agentID; 	//상담원 ID , VIP에는 상담원 영역이 있어서.
	double saleRatio;		//vip용 할인율
	
	//생성자
	public VIPCustomerOther(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		super.customerGrade = "VIP";
		super.bonusRatio = 0.03;
		this.saleRatio = 0.2;
		this.agentID = agentID;
	}
	
	//메소드
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		return price - (int)(price * saleRatio);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + ", 담당 상담원 아이디 : " + agentID;
	}

	public int getAgentID() {
		return agentID;
	}
}