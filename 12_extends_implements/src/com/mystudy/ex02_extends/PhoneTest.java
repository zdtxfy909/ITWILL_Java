package com.mystudy.ex02_extends;

public class PhoneTest {

	public static void main(String[] args) {
		// Phone 객체(인스턴스) 생성 후 기능 테스트
		System.out.println("=== Phone ===");
		Phone ph1 = new Phone();
		ph1.view(); // 타입 : null, 전화번호 : null
		ph1.call(); // >> 전화걸기 (기능은 동작을 한다)
		ph1.receiveCall(); // >> 전화받기~~ (기능은 동작을 한다)
		// 하지만 전화번호 세팅할 수가 없음
		// 전화번호 세팅 > Phone ph1 = new Phone("010-1111-1111");
		System.out.println("---------------");
		Phone ph2 = new Phone("삼성갤럭시폰", "010-2222-2222"); 
		//초기값 세팅
		ph2.view(); // 타입 : 삼성갤럭시폰, 전화번호 : 010-2222-2222
		ph2.call();
		ph2.receiveCall();
		
		System.out.println("==== Mp3Phone =======");
		Mp3Phone mp3ph = new Mp3Phone("010-3333-3333"); 
		mp3ph.view(); //타입 : Mp3Phone 타입, 전화번호 : 010-3333-3333
		mp3ph.call();
		mp3ph.receiveCall();
		mp3ph.playMusic();
		
		System.out.println("==== WebPhone =======");
		WebPhone webph = new WebPhone("010-4444-4444");
		webph.view(); //타입 : Webphone 타입, 전화번호 : 010-4444-4444
		webph.call();
		webph.receiveCall();
		webph.webSearch();
		
		System.out.println("==== Web_Mp3Phone =======");
		Web_Mp3Phone webMp3ph = new Web_Mp3Phone("아이폰12","010-5555-5555");
		webMp3ph.view(); //타입 : Web_Mp3Phone 타입, 전화번호 : 010-5555-5555
		webMp3ph.call();
		webMp3ph.receiveCall();
		webMp3ph.playMusic();
		webMp3ph.webSearch();
	}

}
