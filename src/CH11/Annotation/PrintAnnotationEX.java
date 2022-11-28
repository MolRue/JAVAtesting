package CH11.Annotation;

import java.lang.reflect.*;

public class PrintAnnotationEX {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method: declaredMethods) {
			PrintAnnotation printAno = method.getAnnotation(PrintAnnotation.class);
			
			printLine(printAno);
			
			method.invoke(new Service()); // invoke : method를 실행시키는 함수, 메소드 실행
		
		}
	}
	
	public static void printLine (PrintAnnotation printAno) {
		if (printAno != null) {
			// number 속성 값 얻기
			int number = printAno.number();
			String value = printAno.value();
			
		System.out.println(number);
		System.out.println(value);
		}
		
	}

}
