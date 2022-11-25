package CH11.Math;

public class MathEX {

	public static void main(String[] args) {
		double v1 = Math.ceil(5.3);		//올림
		double v2 = Math.floor(5.3);	//반올림
		
		System.out.println(v1 + "," + v2);

		System.out.println("------------------------");
		
		long v3 = Math.max(3, 7);		//최대값
		long v4 = Math.min(3, 7);		//최소값
		
		System.out.println(v3 + "," + v4);
		
		System.out.println("------------------------");
		
		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1);		//round : 반올림  1. temp1에서 value에 100을 곱해준다 : 1234.56 | 2. round 에서 반올림을 해준다. : 1235.0
		
		System.out.println(temp2);
		
		double v5 = temp2 / 100.0;
		System.out.println(v5);  			// 소수점 이하 2자리 얻음.
		System.out.println("------------------------");
		
		
	}

}
