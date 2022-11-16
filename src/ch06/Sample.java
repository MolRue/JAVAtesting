package ch06;
//// static method 샘플이라네. 
//class Counter  {
//    static int count = 0;
//    Counter() {
//        count++;
//        System.out.println(count + "count???");
//    }
//
//    static int getCount() {
//        return count;
//    }
//}
//
//public class Sample {
//    public static void main(String[] args) {
//        Counter c1 = new Counter();
//        Counter c2 = new Counter();
//        Counter c3 = new Counter();
//
//        System.out.println(Counter.getCount());  // 스태틱 메서드는 클래스를 이용하여 호출
//        
//    }
//}

 class Sample {
	 int count = 5;
	 static int cnt = 10;
 
	 
public static void main(String[] args) {	
	// 1) static 이 없을 경우, 생성자를 생성하고 
	Sample count = new Sample();
	
	System.out.println(cnt);
	// 1. cnt의 경우 static을 붙여놔서 동일한 pakage안에서도 사용할 수 있다! 
	// 2. 다만 다른 class파일 에서 사용하려면 호출 명령어를 더 써줘야 한다.
	System.out.println(count.count);
	// 2) 호출도 따로 해줘야 한다. 
}
}