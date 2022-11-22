package ch06_BankAccount;

public class Account {
	// 필드 : 객체의 데이터를 저장
	private String ano; // 계좌번호
	private String owner; // 계좌의 소유주
	private int balance; // 잔고
	
	// 생성자 : 객체를 초기화 시켜주는 역할
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//메소드 : 객체의 기능
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	
}
