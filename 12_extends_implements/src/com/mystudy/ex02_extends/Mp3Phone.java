package com.mystudy.ex02_extends;

// Phone 클래스를 상속받아(extends: 확장해서) Mp3Phone 만들기
// Phone에서 허용된 속성, 기능을 사용 + Mp3Phone 속성, 기능 추가해서 사용
class Mp3Phone extends Phone {
	
	public Mp3Phone(String phoneNo) {
		//super(phoneNo); 
		//부모클래스 생성자 호출, 위처럼하면 타입은 "phone타입"이라고 들어감
		super("Mp3Phone 타입", phoneNo); // 타입은 따로 넣어줌
	}
	
	public Mp3Phone(String type, String phoneNo) {
		super(type, phoneNo); //부모클래스 생성자 호출
	}

	/*
	mp3ph.view();
	mp3ph.call();
	mp3ph.receiveCall();
	메소드 정의 안 했지만 부모한테 상속 받아서 phoneTest에서 구현됨
	 */
	
	//메소드(기능) -----------
	//Phone클래스에 없는 기능
	public void playMusic() {
		System.out.println(">> Mp3Phone - 음악플레이");
	}
	
}
