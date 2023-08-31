package edu.class1.basic;

// 클래스 선언부
// 클래스 내부에 작성하는 내용 : 변수 선언, 생성자, 메소드 선언
public class Ex02_class {
	//=========== 변수 선언 영역 ============
	//필드변수(인스턴스변수, 속성-property, 전역변수)
	int num = 111;
	
	//클래스변수, static변수, 인스턴스(객체) 공통변수(의미상) 
	static int staticNum = 222;	

	//========== 생성자 선언 영역 ============
	Ex02_class() {} 
	//기본생성자(default constructor) 생략 가능하다. 
	//(안 써도 자바에서 만들어서 컴파일해줌)
	//메소드와 유사한데 차이는 클래스 이름을 쓴다.
		
	//========== 메소드 선언 영역 ============	
	//main 메소드
	public static void main(String[] args) {
		// 지역변수(local variable)
		int num1 = 300;
		//System.out.println("num : " + num); // non-static 접근못함
		System.out.println("staticNum : " + staticNum);
			
		Ex02_class ex02 = new Ex02_class(); // 객체 생성
		System.out.println("ex02 : " + ex02);
		System.out.println("ex02 : " + ex02.num);
		System.out.println("ex02 : " + ex02.staticNum);
		System.out.println("------------");
		
		int result = add(100, 200); // 아래 a,b에 파라미터값 전달
		System.out.println("add(100,200) 결과 : " + result);
		System.out.println("add(300,500) 결과 : " + add(300,500));
	}
	
	static int add(int a, int b) { //a에 100, b에 200 들어감
		return a + b; // 300이라는 값이 add로 리턴됨
	}
	
	
}
