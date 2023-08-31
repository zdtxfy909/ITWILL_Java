package com.mystudy.poly2_overriding;

public class TypeTest {

	public static void main(String[] args) {
		Animal an = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Pig pig = new Pig();
		
		cat.sound();
		dog.sound();
		pig.sound();
		
		System.out.println("--- 메소드 오버로딩(overloading) 방식");
		sound_overloading(cat);
		sound_overloading(dog);
		sound_overloading(pig);
	
		System.out.println("--- instanceof 타입체크 ------");
		sound_instanceof(cat);
		sound_instanceof(dog);
		sound_instanceof(pig); // 구현 안 했기 때문에 작동 안함
		
		System.out.println("==== 메소드 오버라이딩(overloading) 사용 =======");
		sound(an); 	// >> Animal 소리없음
		sound(cat); // >> 야옹~ 야옹~ // Animal <- Cat(실체)
		sound(dog); // >> 멍멍~~~~
		sound(pig); // >> 꿀꿀~
	}
	
	// 메소드 오버라이딩(overriding) 사용
	// 부모타입 코드상 소리없음이 나와야하는데 하위클래스 메소드 실행됨
	// 메소드 호출 => 마지막에 정의된(실체객체기준) 메소드 실행한다.
	// 다른 동물 추가되도 코드 수정 안해도 된다
	// 형태는 하난데 다양하게 동작한다 => 다형성 (cat>야옹, dog>멍멍, pig>꿀꿀)
	static void sound(Animal animal) {
		animal.sound();
	}
	
	// instanceof 사용해서 타입 확인하는 패턴
	// 다른 동물 추가되면 계속 코드 수정해야됨
	static void sound_instanceof(Animal animal) {
		if (animal instanceof Cat) {
			((Cat)animal).sound();
		} else if (animal instanceof Dog) {
			((Dog)animal).sound();
		}
	}
	
	// 메소드 오버로딩(overloading) 방식 ================
	// 같은 이름의 메소드명 사용. 파라미터를 다르게
	static void sound_overloading(Cat cat) {
		cat.sound();
	}
	
	static void sound_overloading(Dog dog) {
		dog.sound();
	}
	
	static void sound_overloading(Pig pig) {
		pig.sound();
	}
	
}
