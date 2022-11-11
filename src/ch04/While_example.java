package test.ch04;

public class While_example {

	public static void main(String[] args) {
		int a = 1;
		
		while (a <= 10) {
			System.out.println(a);
			a++;
		}

System.out.println("------------------");

		int b = 1;
		int sum = 0; 
		while (b <= 100) {
			sum += b; 
			System.out.println(b);
			b++;	
			
System.out.println("------------------");
		
		int c = 1;
		do{
			c++;
			System.out.println(c);
		} while(c<=10);
		
		
		}
		
	}

}

