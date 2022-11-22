package CH08.interface2;

public class ExtendsEX {

	public static void main(String[] args) {
		InterFaceCImpl impl = new InterFaceCImpl(); 
		InterfaceA ia = impl; //자동 형변환이 된다.
		ia.methodA();
		
		InterfaceB ib = impl;
		ib.methodB();
		
		InterfaceC ic = impl; // A와 B로부터 상속받았기 때문에 A와 B도 쓸수 있다.
		ia.methodA();
		ib.methodB();
		ic.methodC();
	}

}
