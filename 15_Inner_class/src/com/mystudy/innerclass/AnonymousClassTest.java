package com.mystudy.innerclass;

interface TestInter {
	int DATA = 100; 	//공통으로 사용하는 데이터
	void printData(); 	//추상메소드(구현부가 없음)
	
}

// 인터페이스를 구현한 클래스 
class TestInterImpl implements TestInter {
	
	@Override
	public void printData() {
		System.out.println(">>> 구현한 메소드");
		
	}	
}

public class AnonymousClassTest {

	public static void main(String[] args) {
		//클래스의 이름이 있으니 이렇게 사용
		TestInterImpl imp = new TestInterImpl();
		imp.printData();
		
		TestInterImpl imp2 = new TestInterImpl();
		imp2.printData();
		
		System.out.println("--- 익명클래스 작성 ----");
		//익명클래스 : 클래스에 이름이 없는 클래스
		TestInter test = new TestInter() {
			
			@Override
			public void printData() {
				System.out.println("DATA : " + DATA);
			}
		};
		test.printData();
		//new TestInter가 이름인 건 아니다.
		//위에 new TestInterImpl은 이름이여서 재사용이 가능하지만 
		//new TestInter는 한번 쓰고 버려진다
		//(재사용할거면 위처럼 변수 test에 담음)
		
		System.out.println("--- 일회성 객체 생성 사용 ----");
		//단 한번 사용하고 버려지는 객체
		(new TestInter() {

			@Override
			public void printData() {
				System.out.println("DATA : " + DATA);
			}
		}).printData();
		
		
	}
		



}
