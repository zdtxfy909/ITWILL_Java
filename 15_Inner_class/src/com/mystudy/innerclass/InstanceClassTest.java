package com.mystudy.innerclass;

public class InstanceClassTest {
	//(인스턴스)변수
	int a = 100;
	private int b = 10;
	static int c = 200;
	int sum = 0;
	
	//(인스턴스)메소드
	void sum() {
		sum = a + b;
	}
	
	//내부 클래스 : 인스턴스 클래스 (static 안 붙음 > 인스턴스 생성되어야 됨)
	class Inner {
		int in = 100;
		void printData() {
			System.out.println("외부 int a : " + a);
			System.out.println("외부 private int b : " + b);
			//외부 private도 쓸 수 있다
			System.out.println("외부 static int c : " + c);
			sum(); //외부메소드 호출
			System.out.println("sum : " + sum);
			
			System.out.println("내부클래스 필드 in : " + in);
		}
	}
	
	public static void main(String[] args) {
		//객체생성 > 위에 있는 거 다 쓸 수 있음
		InstanceClassTest out = new InstanceClassTest();
		System.out.println("필드변수 a : " + out.a);
		
		System.out.println("--- 내부 인스턴스 클래스 사용 ---");
		
		//내부클래스 타입 : 외부클래스명.내부클래스명
		//인스턴스 클래스의 객체(인스턴스) 생성하기 위해서는 외부클래스 객체를 통해서 생성할 수 있다
		//1. 외부, 내부클래스 객체 동시생성
		InstanceClassTest.Inner inner = new InstanceClassTest().new Inner();
		//2. 이미 갖고 있는 객체 있으면
		//InstanceClassTest.Inner inner = out.new Inner();
		inner.printData();
		
		String str = new String("홍길동");
	}

}
