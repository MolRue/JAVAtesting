package CH11.Annotation;

import java.lang.annotation.*;

//어노테이션 정의
//@Target : @PrintAnnotation 을 메소드에서만 쓸수있게 지정한다! 그래서 미 지정된 다른곳(필드, 생성자, 클래스) 에 지정 시 오류발생.
//@Target({ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.TYPE})	
//@Retention : 유지정책, 어노테이션을 언제 시작해서 언제까지 유지 할것인지 지정.

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)	//Runtime 으로 지정시, 프로그램이 끝날때 까지 (실행되는 동안에는) 어노테이션이 계속 적용된다.
public @interface PrintAnnotation {
	String value()	default "-";
	int number()	default 15;
}
