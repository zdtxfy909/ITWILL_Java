package edu.class2.car;

/* 자동차 클래스
	속성 : 차량명, 모델명, 차량색상
	기능 : 가고, 서고, 뒤로가고, 차량정보 확인
 */
public class Car {
	//필드변수(속성) ---------------------
	String name = "마이카"; //차량명, "마이카"라고 값을 설정
	String model; //모델명, null 값 뜸
	String color; //차량색상, null 값 뜸
	
	// final 제한자 : 마지막의 의미, 변수에서는 마지막 값(데이터), 변경할 수 없다.
	// final 변수 : 상수화된 변수(상수, 항상 동일하다)
	final int CAR_LENGTH = 350; //차량길이
	final int CAR_WIDTH = 200; //차량폭(너비)
	
	boolean hasAirbag; //에어백 존재여부
	
	//생성자 ----------------------------
	// 클래스명() {} - 기본생성자
	// 클래스명(매개변수, ...) {}
	/* 주의 : 명시적으로 (파라미터값이 있는)생성자를 선언시 컴파일러가 기본생성자를
			자동생성 하지 않는다 
			> 필요시 직접 작성할 것 
	 */
	
	//Car() { } // 아무작업도 안할때의 상태 - 기본생성자
	
	Car() { 
		model = "드림카";
		color = "빨강";
	} // null > 드림카, null > 빨강 
	
	Car(String n, String m, String c) {
		name = n;
		model = m;
		color = c;
	//두개 생성자를 정의함
	}
	
	//메소드(기능, 동작, 함수) --------------
	void run() {
		System.out.println(">> 앞으로 이동");
	} 
	
	void stop() {
		System.out.println(">> 멈추기");
	}
	
	void back() {
		System.out.println(">> 뒤로가기");
	}
	
	//자동차 속성값 확인(자동차 정보 확인)
	void dispData() {
		System.out.println("--- 자동차 정보 ---");
		System.out.println("자동차명 : " + name);
		System.out.println("모델명 : " + model);
		System.out.println("색상명 : " + color);
		System.out.println("차량길이 : " + CAR_LENGTH);
		System.out.println("차량폭 : " + CAR_WIDTH);
		System.out.println("에어백유무 : " + hasAirbag);
		
		
		
		
	}
	
}
