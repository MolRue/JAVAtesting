package ch07MartRemind;

public class GoldCustomer extends Customer{
// +:public -:private #:protected ~:default
	double saleRate;  // 할인율 필드 선언

//생성자
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		super.customerGrade = "GOLD";
		super.bonusRate = 0.2;
		this.saleRate = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRate);
		return price - (int)(price * saleRate);
	}
	
}
