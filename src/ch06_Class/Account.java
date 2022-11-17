package ch06_Class;

public class Account { // 22번
	private int balance; // 잔고가 저장되는 필드
	private static final int MIN_BALANCE = 0;
	private static final int MAX_BALANCE = 1000000;
	

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		//1. 0 <= balance <= 1,000,000 범위일때 this.balance = balance; 
		this.balance = balance;
		
		//2. 정상범위가 아닐 경우 현재 balance값을 유지하게 하는 코드?
		
		if (balance < MIN_BALANCE || balance > MAX_BALANCE) {
			
		}
	}

}