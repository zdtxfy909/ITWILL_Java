package com.mystudy.poly4_interface;

public class Cat extends AbstractAnimal {

	public Cat () {
		super("고양이");
	}
	
	@Override
	public void sound() {
		//System.out.println(getName() + ">> 야용~");
		//cat에 getName이라는 메소드가 있으면 이렇게 쓰고 없으면 super 붙임
		System.out.println(super.getName() + ">> 야용~");
	}
	
	//기능 추가
	public void test() {
		System.out.println(">> 테스트용 메소드 실행~");
	}

}
