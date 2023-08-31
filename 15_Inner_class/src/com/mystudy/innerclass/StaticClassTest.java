package com.mystudy.innerclass;

public class StaticClassTest {
	int a = 100;
	private int b = 100;
	static int c = 200;
	
	static int sum = 0;
	static int sNum1 = 20;
	static int sNum2 = 10;
	
	static void sum() {
		//필드변수에서 static 붙어있는 변수만 사용 가능함
		//sum = a + b; ---> 못 쓴다. 스태틱은 스태틱끼리만 사용 가능
		//sum = sNum1 + sNum2; // 30
		sum = Inner.d + sNum2; //같은 스태틱이라 변수 사용 가능 
		//1000 + 30
	}
	
	//스태틱(static) 내부 클래스
	// class Inner > 인스턴스 클래스
	static class Inner {
		static int d = 1000;
		int e = 2000; //non-static
		
		void printData() {	//non-static
			//System.out.println("외부 int a : " + a);
			//Cannot make a static reference to the non-static field a
			System.out.println("외부 static int c : " + c);
			System.out.println("내부 static int d : " + d);
			System.out.println("내부 static int e : " + e);
			sum(); //sum 메소드 호출. 안해주면 0으로 출력됨
			System.out.println("외부 static int sum : " + sum);
			//static sum이니까 사용 가능
		}
	}
	

	public static void main(String[] args) {
		int num = StaticClassTest.c;
		
		//static 내부클래스의 static 필드변수 사용
		int innerNum = StaticClassTest.Inner.d;
		System.out.println(innerNum);
		
		//static 내부클래스의 객체(인스턴스) 생성 후 printData() 호출(실행)
		StaticClassTest.Inner inner = new StaticClassTest.Inner();
		inner.printData();
		/* (화면출력)
		외부 static int c : 200
		내부 static int d : 1000
		내부 static int e : 2000
		외부 static int sum : 30
		*/
		
	}

}











