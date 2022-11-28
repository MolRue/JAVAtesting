package CH11.Reflection;

public class GetResourceEX {

	public static void main(String[] args) {
		Class clazz = Car.class;

		String photo1Path = clazz.getResource("ㅇㄱㄴㄴ.gif").getPath();
		String photo2Path = clazz.getResource("Images/ㅇㄱㄴㄴ.gif").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}

}
