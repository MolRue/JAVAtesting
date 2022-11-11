package test.ch04;

public class For_example {

	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("------------------");
		
		int k = 0;
		for (int j=1; j<=10 && k<=10 ; j++,k++) {
			System.out.println(j);
			System.out.println(k);
		}
		
		System.out.println("------------------");
		
		int sum = 0;
		for (int l=1; l<=100; l++) {
		 // sum = sum + l
			sum += l;
		}
		System.out.println("sum= " + sum);
		
		System.out.println("------------------");
		
		for(float m=0.1f; m <= 1.0f; m += 0.1f) {
			System.out.println(m);
		}
		
		System.out.println("------------------");

		for (int n=2; n<=9 ; n++) {
			System.out.println("***" + n + "단 ***");
			for (int o=1; o<=9 ; o++) {
				System.out.println(n + "X" + o + "=" + (n * o));
			}
		}
	}

}
