package CH12.InterfaceGeneric;

public interface Rentable<P> {
	P rent(); // 메소드의 타입을 아직 알수 없으므로 P라고 타입을 준다.
}
