package test.ch06.hyindai;

import test.ch06.hankook.SnowTire;
// 다른 패키지에 있는 클래스는 import 해줘야 사용가능하다.
import test.ch06.kumho.AllSeasonTire;

public class Car {
	SnowTire snowT = new SnowTire();
	Test test = new Test();
	AllSeasonTire allT = new AllSeasonTire();

	//↓ import 없이 class 불러오는방법. 코드가 많이 길어져서 잘안쓴다.
	test.ch06.hankook.Tire tire1 = new test.ch06.hankook.Tire();

}