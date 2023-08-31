package edu.class1.basic;

public class Ex03_method {

	public static void main(String[] args) {
		int num1 = 500;
		int num2 = 200;
		int sum = 0;
		
		sum = add(num1, num2); 
		//메소드 실행(호출, add 메소드를 불렀다, 인자값은 두개로 일치해야)
		System.out.println("sum : " + sum);
		
		// static 영역에서 non-static 영역 접근시 객체(인스턴스)를 통해서 사용해야한다.
		// 인스턴스(객체)를 사용하면 static, non-static 변수, 메소드 모두 사용 가능
		Ex03_method ex03 = new Ex03_method();
		// 내가 만든 클래스 Ex03_method에 ex03변수 저장
		
		// sub(num1, num2); //이렇게는 사용못함
		// non-static 메소드 호출 > 접근할 수 없다 
		// 현재시점에는 사용할 수 없는 거라서?
		// > 인스턴스를 만들면 접근할 수 있음 
		
		ex03.sub(num1, num2);
		System.out.println("sub : " + ex03.sub(num1, num2));
		System.out.println("mul : " + ex03.mul(num1, num2));
		System.out.println("div : " + ex03.div(num1, num2));
	}
	
	//필드영역
	// 메소드 선언(static이 붙어있는 add 메소드)
	static int add(int a, int b) { 		
		return a + b; 
	}
	
	// 메소드 선언(non-static)
	int sub(int a, int b) {
		return a - b;
	}
	
	int mul(int a, int b) {
		return a * b;
	}
	
	int div(int a, int b) {
		return a / b;
	}
	
	//============================
	//메소드 형태 : 파라미터 값 유무, 리턴값 유무
	//1
	void method1() {
		System.out.println("파라미터값 X, return 값 X");
	}
	//2
	void method2(String param) {
		System.out.println("파라미터값 O, return 값 X");
	}
	//3
	String method3() { 			//리턴타입(String)은 있는데 파라미터가 없음
		System.out.println("파라미터값 X, return 값 O");
		return "파라미터값 X, return 값 O"; // 숫자로 받으면 안됨
	}
	//4
	String method4(String param) {
		System.out.println("파라미터값 O, return 값 O");
		return "파라미터값 O, return 값 O";
	}
	
}
