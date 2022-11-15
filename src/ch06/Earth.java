package ch06;

public class Earth {
	//java에서 상수 : 불변의 값(final), 공유해서 사용 가능(static)
	// 상수 (상수 선언시,변수 명은 대문자에 스네이크 타입으로 선언해야한다.)
	// final : 절대 변경X // static : 전역변수
	static final double EARTH_RADIOUS = 6400; 	// 지구 반지름
	static final double EARTH_SURFACE_AREA;		// 표면적
	
	//static블록 : static필드를 초기화
	static { // 잘보면 PI도 대문자다 > 얘도 상수다.
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIOUS * EARTH_RADIOUS;
	}
	
}
