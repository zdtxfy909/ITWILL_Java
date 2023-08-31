package com.mystudy.poly4_interface;

public class TypeTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Pig pig = new Pig();

		cat.eat();
		cat.sleep();
		cat.sound();
		cat.test();
		System.out.println("-----");
		
		dog.eat();
		dog.sleep();
		dog.sound();
		
		System.out.println("==== Animal 타입 사용(Cat 객체) =====");
		Animal animal = new Cat();
		animal.eat(); //정의된 곳은 인터페이스, 구현된 곳은 클래스
		animal.sleep();
		animal.sound();
		
		//타입 변경시 해당 데이터 타입에 정의된 기능(메소드)만 사용 가능하다
		//animal.test(); //Animal에 정의된 메소드가 아니기 때문에 못쓴다
		
		System.out.println("==== 메소드 파라미터 Animal 인터페이스 =====");
		soundPoly(cat);
		soundPoly(dog);
		soundPoly(pig);
		
	}
	// 인터페이스 Animal 타입으로 데이터를 받아서
	// 인터페이스 타입에 저장된 데이터에 있는 sound() 메소드 호출
	// (메소드 오버라이딩에 의해 저장된 객체의 메소드 호출된다)
	static void soundPoly(Animal animal) {
		animal.sound();
	}
	
	
}
