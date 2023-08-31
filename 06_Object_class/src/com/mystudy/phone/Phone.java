package com.mystudy.phone;

public class Phone {
	
	//속성(필드변수, 인스턴스변수, 멤버변수)-------------
	String name; //모델명
	String type; //타입
	int hsize; //가로크기
	int vsize; //세로크기
	boolean hasLCD; //LCD유무

	String sendSms;
	String receiveSms;
	
	//생성자 선언-----------------------------------
	Phone() {} //기본생성자
	
	Phone(String name, String type) {
		this.name = name; // this 현재객체(인스턴스)
		this.type = type;
	} 
	
	Phone(String name, String type, boolean hasLCD) {
		this.name = name; // this 현재객체(인스턴스)
		this.type = type;
		this.hasLCD = hasLCD;
	}
	
	//메소드(기능, 동작)------------------
	
	//가
	void call () { // 파라미터 없고, 리턴값 없다. 실행만 하고 끝.
		System.out.println(">> 전화걸기~~");
	}
	//나
	void recieveCall () {
		System.out.println(">> 전화받기~~");
	}
	//다. 메세지 보내기
	void sendSms(String msg) {
		System.out.println("[메세지전송] " + msg);
	}
	//라. 메세지 받기
	String recieveSms(String msg) {
		System.out.println("[메세지수신] " + msg); //화면출력
		return msg;
	}
	
	//마. 전화기 정보 확인
	void view () {	//파라미터 없고 리턴 없다. 실행만 하고 끝!
		System.out.println("--- 전화기 정보 ---");
		System.out.println("모델명 : " + name);
		System.out.println("타입 : " + type);
		System.out.println("가로크기" + hsize);
		System.out.println("세로크기" + vsize);
		System.out.println("LCD유무" + hasLCD);
		
		
		
	}

	
	
	
}
