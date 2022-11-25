package CH11.Module;

public class Member extends Object /*가 숨어있다!*/{
	// 필드
	public String id;  
	// 생성자
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		// obj가 Member 객체를 가지고 있나?
		if (obj instanceof Member) {	// 강제 형변환을 하기 위해 검사하는것.
			Member target = (Member)obj; //강제 형변환! >> 자식 객체에 있는 필드를 가져오기 위함임.
			
			if (id.equals(target.id)) {	// 여기서 equals는 String 의 equals (순수하게 문자값 비교)
				return true;
			}
		}
		return false;
	}
	
	
/**
	public static void main(String[] args) {

 		Object obj1 = new Object();

		Object obj2 = obj1;
		
		
		System.out.println(obj1.equals(obj2)); 	//번지수를 비교(heap영역에서)
		System.out.println(obj1 == obj2);		//번지수를 비교(역시 heap영역에서)
		
		//논리적 동등 : 같은 객체던, 다른객체던 객체 저장 데이터가 동일하다.
		
		String a = "1";
		String b = "2";
**/		
		/*String 끼리 비교 할땐, if(a == b) 는 사용하면 안된다! String은 주소를 비교하는것.*/
		/*if(a.equals(b)) 이렇게 해줘야 저장 값을 비교한다.*/
		
		
//	}
}
