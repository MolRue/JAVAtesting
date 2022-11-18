package ch07poly;

public class InstanceofEX {

	public static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk(); 
		//순서3. if 를 통과 못해서 이후 절차 생략.person1 출력
		
		//순서 5. 고희동의 person정보....? 하나가 더있네? 
		if (person instanceof Student) { // person 이 Student 타입을 참조하고 있냐??
		//순서 6. if instanceof 함수를 통과한 친구는 person 에서 Students 로 변환된 형태가 적용된다. if 는 거름망 이니깐...(true 인가 flase인가 를 준다.) 
			Student student = (Student)person;
			student.study();
			System.out.println(student.studentNo);
		// 순서 7. 고희동에는 매개변수가 하나 더 있으니 if문을 통과! 강제 형변환이 진행된다.
		}
		
	}
	
	public static void main(String[] args) {
		//순서 1.	메인 변수. 
		Person p1 = new Person("고길동");
		personInfo(p1);
		//순서 4. 메인에서 2번째 변수인 고희동!
		Person p2 = new Student("고희동", 10);
		personInfo(p2);
		// 순서 9. 순서 7에서 변환된 형태를 토대로 매개값이 추가된 최종적인 희동이.

	}

}
