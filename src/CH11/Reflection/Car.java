package CH11.Reflection;

public class Car {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Class clazz = Car.class;			// 클래스 객체를 얻는 방법 1.
//		Class clazz = Car.forName("test.CH11.Reflection.Car");		// 클래스 객체를 얻는방법 2.
		
		
		System.out.println("패키지 이름: " + clazz.getPackage().getName());
		System.out.println("클래스의 간단한 이름: " + clazz.getSimpleName());
		}
	}

