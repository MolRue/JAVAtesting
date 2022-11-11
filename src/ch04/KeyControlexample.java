package test.ch04;

import java.util.Scanner;

public class KeyControlexample {

	public static void main(String[] args) {
		//1,2를 입력했을때 속도를 증가, 감속 시키고 3 입력시 종료시키는것? while로
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0; 
		
		while(run) {
			System.out.println("------------------");
			System.out.println("1.증속 , 2.감속 , 3.중지");
			System.out.println("------------------");
			System.out.println("선택: ");
			
			String strNum = scanner.nextLine();
			
			if (strNum.equals("1")) {
				speed++;
				System.out.println("현재속도: " + speed);
			} else if (strNum.equals("2")){
				speed--;
				System.out.println("현재속도: " + speed);
			} else if (strNum.equals("3")) {
//				run = false;
//				System.out.println("프로그램 종료");
//				break;
				continue;
			}
			System.out.println("이건 실행안된다!");
			
		}
		
	}

}
