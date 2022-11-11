package test_1108;

public class Hello {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		System.out.println("Hello! java!");
		int a = 10; // 자료형 변수명 = 리터럴(번지수)
		int b = 12;
		int result = a + b;
		int num = 9;
		
		System.out.println(result);
		System.out.println(a + num);
		
		int var1 = 0b1011;  //2진수
		int var2 = 0206;  	//8진수 
		int var3 = 365; 	//10진수
		int var4 = 0xb3;	//16진수
		long var5 = 10000000000L;
		char c1 = 'A';
		char c2 = 65;
		
		// double 이 float보다 정밀도가 높다.(소수점이후 숫자가 더 길다)
		float var6 = 0.1234546785f;
		double var7 = 0.1234546785f;
		double var8 = 3e6;
		double var9 = 2e-3;
		float var10 = 3e6f;
		
		//10진수로 출력
		System.out.println( var1 + ":" + var2 + ":" + var3 + ":" + var4 );
		System.out.println(var5);
		System.out.println(c1 + "," + c2);
		System.out.println(var6 + "," + var7);
		System.out.println(var8);
		System.out.println(var9);
		System.out.println(var10);
		
		boolean stop = true;
		
		int x = 10;
		boolean result1 = (x == 20);
		
		System.out.println(result1);
		System.out.println(stop);
		if (stop) {
			System.out.println("정지합니다.");
			
		String name = "Gorden";
		String name1 = "my name is \'Jim Gorden\'";
		String one = "A";
		System.out.println(name);
		System.out.println(name1);
		}
	}
	

}
