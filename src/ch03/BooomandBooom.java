package test.ch03;

public class BooomandBooom {

	public static void main(String[] args) {
		System.out.println("1------------------");
		
		int a = 10;
		int b = 20;
		int c = (++a) + (b--);
		System.out.println(c);
		
		System.out.println("2------------------");
		
		int score1 = 85;
		String result1 = (!(score1>90))? "가" : "나";
		System.out.println(result1);
		
		System.out.println("3------------------");
		
		int pencils = 534;
		int students = 30;
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft);

		System.out.println("4------------------");
		
		int value = 356;
		System.out.println(value - (value % 300));
		
		System.out.println("5------------------");
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((double)(lengthTop+lengthBottom)*height/2);
		System.out.println(area);
		
		System.out.println("6------------------");
		
		int d = 10;
		int e = 5;
		System.out.println((d>7) && (e<=5));
		System.out.println((d%3 == 2) || (e % 2 !=1));
		
		System.out.println("7------------------");
		
		double f = 5.0;
		double g = 0.0;
		double h = 5 % g;
		
		if (f % g != 0.0) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = h + 10;
			System.out.println("결과: " + result);
		}
		
		System.out.println("8------------------");
		
		int numOfApples = 123;
		int sizeOfBucket = 10;
		
		int numOfBucket = (numOfApples / sizeOfBucket);
		System.out.println("필요한 바구니 수: " + numOfBucket);
		
		System.out.println("9------------------");
		
//		int num2 = (i);
//		 i >= 1 ? "양수" : "음수"  
// 
//		System.out.println("10------------------");
//		
//		int num1 = 333; 
//		System.out.println(num1);
//		
//		System.out.println("11------------------");
//		
//		int fahrenheit = 100;
//		float celcious = (fahrenheit);
//		
//		System.out.println("Fahrenheit: " + fahrenheit);
//		System.out.println("celcious: " + celcious);
//		
//System.out.println("12------------------");
//		
//		// byte k → int k , add (char)
//	       byte i = 10;
//	       byte j = 20;
//	       int k = i + j;
//
//	       char ch = 'A';
//	       ch = (char) (ch + 2);
//
//	       float l = 3 / 2;
//	       long m = 3000 * 3000 * 3000;
//	       float l2 = 0.1f;
//
//	       double o = 0.1;
//	       boolean result = d==l2;
//
//	       System.out.println("c="+k);
//	       System.out.println("ch="+ch);
//	       System.out.println("f="+k);
//	       System.out.println("l="+m);
//	       System.out.println("result="+result);
//
//	System.out.println("13------------------");
//	      
//	       char ch1 = 'z';
//	       boolean y = ();
//	       System.out.println(y);
//	       
//	   System.out.println("14------------------");
//	       
//	       char ch = 'A';
//	       char lowerCase = (    );
//	       System.out.println("ch:"+ch);
//	       System.out.println("ch to lowerCase:"+lowerCase);

	       
	}

}
