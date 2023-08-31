package com.mystudy.poly3_abstract_class;

class TypeTest {

	public static void main(String[] args) {
		//AbstractAnimal animal = new AbstractAnimal();
		Cat cat = new Cat();
		cat.sound(); //cat타입에 있는 sound 직접 호출

		Dog dog = new Dog();
		dog.sound();
		
		System.out.println("------------");
		sound(cat); //cat객체가 넘어왔으니까 cat메소드호출?
		sound(dog);
		
		
	}
	
	//부모 클래스인 추상클래스 타입으로 받아서 처리
	static void sound(AbstractAnimal animal) {
		animal.sound();
	}
	
	
}
