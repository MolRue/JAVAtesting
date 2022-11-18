package ch07poly;

public class AbstractiveEX {

	public static void main(String[] args) {
		Dog dog = new Dog();
//		dog.sound();
		
		Cat cat = new Cat();
//		cat.sound();

		//매개변수의 다형성
		animalSound(cat);
		animalSound(dog);
	}
		//메소드 선언
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
