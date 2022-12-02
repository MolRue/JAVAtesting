package CH14HashBrown;

import java.util.HashMap;
import java.util.Map;

public class HashMapEX {

	public static void main(String[] args) {
//		Map<> map = new HashMap<>();
	//	HashMap<key값, 객체> //generic // int 타입으로 주려면 Integer로 
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("고길동", 85);	//map.put("String형태로 된 Key값", int(Integer)값으로 된 value값);
		map.put("고희동", 90);
		map.put("둘리", 80);	
		map.put("마이콜", 95);
		
		System.out.println("총 Entry 수 : " + map.size());
		
		// 키(key) 로 값 얻기
		String key = "마이콜";
		int value = map.get(key);
		System.out.println(value);
		
		String key1 = "둘리";
		int value1 = map.get(key1);
		System.out.println(value1);
	}

}
