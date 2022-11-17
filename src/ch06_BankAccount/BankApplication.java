package ch06_BankAccount;

import java.util.Scanner;

public class BankApplication {
	private static Scanner scanner = new Scanner(System.in); //스캐너 객체 생성
	private static Account[] accountArray = new Account[100];  //계좌 객체를 담을 배열. int 나 String이 아니라 Account자체를 객체로 만들어 데이터를 담는다!?
	// 객체는 미 지정시 초기값이 null로 되어있다!?
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
		// 다섯가지 기능 1. 계좌생성 2. 계좌목록 3. 예금 4. 출금 5. 종료
		System.out.println("-----------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("-----------------------------------------");
		System.out.println("선택>");
		int selectNo = scanner.nextInt(); //nextInt : 숫자형으로 받는다.
		
		if(selectNo == 1) createAccount();
		else if (selectNo == 2) accountList();
		else if (selectNo == 3) diposit();
		else if (selectNo == 4) withdraw();
		else if (selectNo == 5) run = false; 
		}
		System.out.println("프로그램 종료");
	}
	
	//1.계좌생성
	public static void createAccount() {
		System.out.println("-------------");
		System.out.println("계좌생성");
		System.out.println("-------------");
		System.out.println("계좌번호");
		String ano = scanner.next(); // nextInt 와는 다르게 문자형으로도 받는다.
		
		System.out.println("계좌주");
		String owner = scanner.next();
		
		System.out.println("초기입금액");
		int balance = scanner.nextInt();
		
		Account newAccount = new Account(ano, owner, balance); // 계좌를 만든다.
		
		for (int i=0; i<accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break; // for반복문이 끝까지 실행되지 않도록 완성 후 멈춰준다.
			}
//			System.out.println(accountArray[i]);
		}
	}	
	
	
	//2.계좌목록
	public static void accountList() {
		for (int i=0; i<accountArray.length; i++) {
			
		}
	}
	
	//3.예금
	public static void diposit() {}
	
	//4.출금
	public static void withdraw() {}
	
	//5. Account 배열에서 ano가 동일한 Account객체를 찾는 역할을 해주는 함수를 하나 만들수 있다.
	private static Account findAccount(String ano) {
		
	}
}

