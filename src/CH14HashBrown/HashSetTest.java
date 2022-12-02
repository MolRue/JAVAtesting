package CH14HashBrown;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
//		Set<String> set = new HashSet<String>();	// 이렇게도 쓸수 있다.
		HashSet<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("vavo");
		set.add("jsp");
		set.add("java");	// set의 경우엔, 동일한 객체는 저장하지 않는다. 
		
		int size = set.size();
		System.out.println(size);
	}

}
