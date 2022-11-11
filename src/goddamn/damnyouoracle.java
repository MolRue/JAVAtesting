package goddamn;

public class damnyouoracle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		
		// 안에서는 바깥 변수에 접근 가능, 바깥에서는 안의 변수에 접근 불가.
		if (v1 > 10) {
			int v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5;
	}

	}

}
