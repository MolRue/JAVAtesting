package CH11.System;

import java.util.Properties;
import java.util.Set;

public class GetPropertyEX {

	public static void main(String[] args) {
		
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		
		Properties props = System.getProperties();
		Set keys = props.keySet();
		// keys 에는 사용되는 key에 대한 정보들이 들어오게 된다.
		
		for (Object objkey: keys) {
			String key = (String) objkey; // String으로 강제 형변환
			System.out.println(key);
			System.out.println(System.getProperty(key));
		}

	}

}
