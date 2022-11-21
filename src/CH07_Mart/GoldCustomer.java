package CH07_Mart;

public class GoldCustomer extends Customer{
	//필드
	double saleRatio; //할인율
	
	//생성자 //1. 생성자 실행 2. 부모클래스의 Customer가 super되서 돌아옴.  
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		super.customerGrade = "GOLD";
		super.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}
		//메소드
	
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		return price - (int)(price * saleRatio);
	}
				
}

	
	

