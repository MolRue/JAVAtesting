package CH10.makeException;

public class AccountEX {

	public static void main(String[] args) {
		Account account = new Account();
		
		//저축
		account.deposit(10000); // 10000원 저축
		System.out.println("예금액: " + account.getBalance()+" 원"); // 잔고를 가져온다.
		
		//출금
		try {
			account.withdraw(30000);		// 30000출금 시도! 하지만 불가능.
		} catch (InsuffException e) {
			String message = e.getMessage(); // 에러 메시지 받기
			System.out.println(message);
		} 
		
	}

}
