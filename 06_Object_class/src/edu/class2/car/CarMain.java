package edu.class2.car;

public class CarMain {

	public static void main(String[] args) {
		// Car 클래스를 이용해서 Car 타입의 객체(인스턴스)를 생성해서 사용
		Car car1 = new Car(); // 기본 생성자 호출 
		// Car.java에 기본생성자(Car() { }) 있어야 가능함.
		// 컴파일러가 기본 생성자 만들어주는데 왜 (Car() { }) 있어야 할까?
//		Car(String n, String m, String c) {
//			name = n;
//			model = m;
//			color = c;
//		}
		// 개발자가 필요에 따라 위 생성자를 만들었으니 컴파일러가 무조건 기본생성자 만들어주면 
		// 개발자의 의도에 맞지 않을 수 있음
		car1.color = "검정";
		// car1.CAR_LENGTH = 400; > (컴파일 오류)상수화된 변수라 변경 불가능
		// car1.CAR_WIDTH = 400; > final 변수값 변경 불가
		
		System.out.println("자동차명 : " + car1.name);
		System.out.println("모델명 : " + car1.model);
		System.out.println("색상명 : " + car1.color);
		System.out.println("차량길이 : " + car1.CAR_LENGTH);
		System.out.println("차량폭 : " + car1.CAR_WIDTH);
		System.out.println("에어백유무 : " + car1.hasAirbag);
		System.out.println("------------");
		
		car1.name = "처음 가져본 차";
		System.out.println("자동차명 : " + car1.name);
		car1.hasAirbag = true;
		System.out.println("에어백유무 : " + car1.hasAirbag);
		
		System.out.println("==== 기능 테스트 ====");
		car1.run();
		car1.stop();
		car1.back();
		// 작성된 메소드를 호출하는 코드
		//car1.speedup(); > 작성된 코드 아니기 때문에 호출 안됨
		
		System.out.println("===================");
		
		System.out.println("==== car2 생성 사용 ========");
		//Car car2 = new Car(); //기본생성자
		Car car2 = new Car("패밀리카", "제네시스", "검정"); //새로운 데이터 넣어서 출력값 다르게 하기
		
		car2.dispData(); // 메소드 호출(실행)
		
		car2.run();
		car2.stop();
		car2.back();
		
		
	}

}
