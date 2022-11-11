package test.ch03;

public class Operatior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int x = -100;
		x = -x;
		System.out.println(x);
		*/
		
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		
		System.out.println("x= " + x);
		System.out.println("------------------");
		
		y--;
		--y;
		System.out.println("y= " + y);
		
		System.out.println("------------------");
		z = x++; // 후위 연산자는 선대입 후증가.
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		System.out.println("------------------");
		z = ++x; // 전위 연산자는 선증가 후대입.
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		System.out.println("------------------");
		z = ++x + y++;
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		System.out.println("z= " + z);
	}
}
