package ch_unknown_연습용패키지;

public class ChildEX {

	public static void main(String[] args) {
		Parent1 parent = new Child1();
		parent.fiedl1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 parent.field2 = "data2"; 	// 이건 불가능하다! 
		 parent.method3();			// 이것도 불가능하다!!
		 */

		Child1 child = (Child1)parent;
		child.field2 = "yyy"; 		// 이건 가능하다!
		child.method3(); 			// 이것도 가능하다!
	}

}
