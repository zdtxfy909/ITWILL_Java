package com.mystudy.poly2_overriding;

class Animal {
	String name; // 이름, 명칭
	int legCnt; // 다리 갯수
	
	void eat() {
		System.out.println(">> 먹는다");
	}
	
	void sleep() {
		System.out.println(">> 잠을 잔다");
	}
	
	// 자녀(하위)클래스에 공통으로 있는 메소드를 정의한다.
	// 자녀(하위)클래스에서 필요에 따라 재정의해서 사용하도록 한다.
	void sound() {
		System.out.println(">> Animal 소리없음");
	}
	
}
