package com.mystudy.phone;

public class PhoneMain {

	public static void main(String[] args) {
		Phone phone1 = new Phone(); // phone1의 주소값에 phone타입의 데이터가 있다.
		System.out.println("phone1 : " + phone1); 
		//폰타입의 데이터가 있다는걸 알 수 있음
		phone1.call();
		phone1.recieveCall();
		phone1.sendSms("안녕하세요");
		String receiveMsg = phone1.recieveSms("오랜만이네요");
		System.out.println("::받은 메세지 : " + receiveMsg);
		phone1.view(); // 아무값도 없음
		
		System.out.println("===== phone2 =====");
		Phone phone2 = new Phone("마이폰", "아이폰12");
		System.out.println("phone2 : " + phone2);
		phone2.view(); // 값 설정됨
		
		phone1.name = "아이폰";
		phone1.type = "아이폰";
		phone1.hsize = 222;
		phone1.vsize = 2222;
		phone1.hasLCD = true;
		
		System.out.println("모델명 : " + phone1.name);
		System.out.println("타입 : " + phone1.type);
		System.out.println("가로크기 : " + phone1.hsize);
		System.out.println("세로크기 : " + phone1.vsize);
		System.out.println("LCD유무 : " + phone1.hasLCD);

	
	}
}
