package CH11.Module;

public class HashCodeEX {

	public static void main(String[] args) {
		Student s1 = new Student(1, "고길동");
		Student s2 = new Student(1, "고길동");
		
		
		// 해시코드 : 객체를 식별하는 정수(객체의 메모리 번지를 이용해서 만들어진다.)
//		System.out.println(s1.hashCode() + "," + s2.hashCode());
		
		if (s1.hashCode() == s2.hashCode()) {
			if(s1.equals(s2)) {
				System.out.println("논리적 동등입니다.");
			} else {
				System.out.println("no 하고 name 데이터가 다르므로 논리적 동등이 아닙니다.");
			}
		}

	}

}
