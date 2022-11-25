package CH11.APIDocument;

public class Random {

	public static void main(String[] args) {
		// random 사용법1. 함수!
		System.out.println(Math.random());
		// 0.0 ~ 1.0 사이의 숫자를 double 타입의 소수로 출력해준다.
		
		int n = 9;
		int start = 1;	
		// 시작하는 숫자. int random 이 double타입의 소수를 출력하니깐! int 타입의 정수로 형변환
		int num = (int) (Math.random() * n) + start;

		System.out.println(num);
	}

}
