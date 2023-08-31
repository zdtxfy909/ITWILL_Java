package com.mystudy.ex01_class;

public class PhoneTest {

	public static void main(String[] args) {
		// Phone 객체(인스턴스) 생성 후 기능 테스트
		System.out.println("=== Phone ===");
		Phone ph1 = new Phone();
		ph1.view(); // 타입 : null, 전화번호 : null
		ph1.call(); // >> 전화걸기 (기능은 동작을 한다)
		ph1.receiveCall(); // >> 전화받기~~ (기능은 동작을 한다)
		// 하지만 전화번호 세팅할 수가 없음
		//Phone ph1 = new Phone("010-1111-1111");
		System.out.println("---------------");
		Phone ph2 = new Phone("삼성갤럭시폰", "010-2222-2222"); //초기값 세팅
		ph2.view(); // 타입 : 삼성갤럭시폰, 전화번호 : 010-2222-2222
		ph2.call();
		ph2.receiveCall();
		
		System.out.println("==== Mp3Phone =======");
		Mp3Phone mp3ph = new Mp3Phone("010-3333-3333"); //타입 : Mp3Phone 타입, 전화번호 : 010-3333-3333
		mp3ph.view();
		mp3ph.call();
		mp3ph.receiveCall();
		mp3ph.playMusic();
		
	}

}
