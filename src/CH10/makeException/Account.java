package CH10.makeException;

public class Account {
	//필드 선언
	private long balance; //잔고에 관련된 필드
	
	//생성자
	public Account() {
		
	}
	
	//메소드
	public long getBalance() {
		return balance;
	}
	
	//저축관련 메소드
	public void deposit(int money) { // 저축하려는 돈을 받아올것.
		balance += money; 	// 잔고에 돈을 누적 합산한다.
	}
	
	//출금
	public void withdraw (int money) throws InsuffException { // 출금하려는 돈을 받아올것.
		// 잔고보다 출금하려는 금액이 더 클 경우, 예외를 발생시킨다.
		if (balance < money) {
			throw new InsuffException("잔고 부족 : " + (money - balance) + " 원이 모자랍니다.");
		}
		
		balance -= money;	// 잔고에서 출금하려는 돈을 빼준다.
	}
}
