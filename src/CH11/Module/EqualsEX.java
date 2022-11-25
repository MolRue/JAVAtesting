package CH11.Module;

public class EqualsEX extends Object {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if (obj1.equals(obj2)) {
			System.out.print("같습니다.");
		} else {
			System.out.print("다릅니다.");			
		}
		
		if (obj1.equals(obj3)){
			System.out.print("같습니다.");
		} else {
			System.out.print("다릅니다.");			
		}
		
	}

}
