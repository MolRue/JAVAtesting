package CH08.Dice;

import java.util.Random;
import java.util.Scanner;
import ch07MartRemind.Customer;
import java.util.ArrayList;

public class DiceBoardEx {
	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<DiceBoardEx> list = new ArrayList<DiceBoardEx>();

	// 특정 버튼을 입력시(예:Enter) 주사위를 던진다 > 숫자가 누적된다 > 특정 숫자마다 특정한 메시지 출력 (예: 무인도에 도착했다) >
	// 일부 특정 숫자는 게임오버 유발(예:다쳐서 병원에 살려갔다) >> 최종 숫자(200정도?) 도달 시 클리어 메시지 출력
	public static void main(String[] args) {
		boolean run = true;
		int Prograss = 0;
		System.out.println("여러분의 EZEN 생존기");
		while (run) {
		
		System.out.println("-------------------------");
		System.out.println("1. 주사위 던지기 | 2. 종료하기 ");
		System.out.println("-------------------------");
		System.out.println("선택>");

		int selectNo = scanner.nextInt();
		if (selectNo == 1) {
			Prograss += playGame();
			System.err.println(Prograss);
			
		} else if (selectNo == 2) {
			System.out.println("Game Over");
			System.out.println("종료합니다.");
			run = false;
		}	
		
		if (2 <= Prograss && Prograss <= 12) {
			System.out.println("으어어어... 일어날 시간입니다 학생이시여....");
		}				
		if (Prograss == 4) {
			System.err.println("알람을 듣지 못하고 말았습니다.......지각 확정이네요");
			System.err.println("Game Over");
			run = false;
		}
		if (13 <= Prograss && Prograss <= 20) {
			System.out.println("당신은 씻기위해 물을 틀었죠. 물이 아주 차갑군요... 하지만 지각을 할순 없죠.");
		}
		if (21 <= Prograss && Prograss <= 30) {
			System.out.println("바쁘다 바빠.. 당신은 서둘러 나갈 채비를 합니다.");
		}
		if (31 <= Prograss && Prograss <= 41) {
			System.out.println("양말...양말은 어딧지???");
		}
		if (42 <= Prograss && Prograss <= 44) {
			System.err.println("저런.. 레고를 밟으셨군요. 병원에 가셔야겠습니다.");
			System.err.println("Game Over");
			run = false;
		}
		if (45 <= Prograss && Prograss <= 50) {
			System.out.println("버스정류장! 어... 근데 줄이 좀 길군요??");
		}
		if (51 <= Prograss && Prograss <= 60) {
			System.out.println("");
		}
		if (61 <= Prograss && Prograss <= 70) {
			System.out.println("");
		}
		if (71 <= Prograss && Prograss <= 80) {
			System.out.println("");
		}
		if (81 <= Prograss && Prograss <= 90) {
			System.out.println("");
		}
		if (91 <= Prograss && Prograss <= 100) {
			System.out.println("");
		}
		if (101 <= Prograss && Prograss <= 110) {
			System.out.println("");
		}
		if (111 <= Prograss && Prograss <= 120) {
			System.out.println("");
		}
		if (121 <= Prograss && Prograss <= 132) {
			System.out.println("");
		}
		if (133 <= Prograss && Prograss <= 135) {
			System.out.println("코딩을 하다 그만 정신을 놓아버리고 말았습니다..");
			System.err.println("Game Over");
			run = false;
		}
		if (136 <= Prograss && Prograss <= 140) {
			System.out.println("");
		if (141 <= Prograss && Prograss <= 150) {
			System.out.println("");
		}
		if (151 <= Prograss && Prograss <= 160) {
			System.out.println("");
		}
		if (161 <= Prograss && Prograss <= 170) {
			System.out.println("");
		}
		if (171 <= Prograss && Prograss <= 180) {
			System.out.println("");
		}
		if (181 <= Prograss && Prograss <= 190) {
			System.out.println("");
		}
		if (191 <= Prograss && Prograss <= 199) {
			System.out.println("");
		}
		if (Prograss > 200) {
			System.out.println("Congratulations");
			System.out.println("드디어 퇴근하실수 있습니다!");
			System.out.println("내일 다시 만나요!!");
			return;
		}
	}
}}

//1. 1번을 골랐을때 
	public static int playGame() {
		Dice dice01 = new DiceNO1();
		Dice dice02 = new DiceNO2();

		int result = (dice01.diceNum() + dice02.diceNum());
		System.out.println(result + "가 나왔습니다.");
		return result;
	}

}
