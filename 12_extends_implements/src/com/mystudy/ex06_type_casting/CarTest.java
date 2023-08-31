package com.mystudy.ex06_type_casting;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("==== Car 클래스 ======");
		Car car = new Car(); //기본 생성자 호출
		car.type = "자동차";
		System.out.println("타입 : " + car.type);
		car.drive();
		car.stop();
		
		System.out.println("==== Ambulance 클래스 =====");
		Ambulance am = new Ambulance();
		am.type = "구급차";
		System.out.println("타입 : " + am.type);
		am.drive();
		am.stop();
		am.siren();
		
		System.out.println("==== FireEngine 클래스 =====");
		FireEngine fe = new FireEngine();
		fe.type = "소방차";
		System.out.println("타입 : " + fe.type);
		fe.drive();
		fe.stop();
		fe.siren();
		fe.water();
		
		System.out.println("===== 형변환 ========");
		// Car, Ambulance, FireEngine
		Car car2 = new Car(); // Car <--- Car
		car2.type = "자동차";
		System.out.println("car2 type : " + car2.type);
		car2.drive();
		car2.stop();
		
		//car2.siren(); //컴파일오류 undefined : Car타입에는 siren() 없음
		
		System.out.println("--- Car(부모) <-- Ambulance(자녀) 저장 ----");
		// 상위클래스에 하위클래스를 저장(자동형변환)
		car2 = am; // Car <-- Ambulance : 자동형변환
		System.out.println("car2 type : " + car2.type); // 구급차
		car2.drive();
		car2.stop();
		
		//Ambulance 고유기능 siren() 사용하려면 Ambulance 타입이 되어야 함
		((Ambulance)car2).siren();
		
		//============================
		System.out.println("--- Ambulance(자녀) <--- Car(부모) <--- Ambulance(실체) ----");
		System.out.println("car2 type : " + car2.type);
		Ambulance am2 = (Ambulance)car2; //강제형변환
		// Car 타입에 저장되었던 Ambulance
		am2.drive();
		am2.stop();
		am2.siren();
		
		// 자녀(하위)클래스에 부모(상위)클래스를 저장
		System.out.println("--- Ambulance(자녀) <--- Car(부모) ----");
		Car carTemp = new Car();
		carTemp.type = "일반자동차";
		System.out.println("am2 type : " + carTemp.type);
		//강제형변환, 문법적으로는 가능하나 실행시 오류방생
		//Ambulance am2 = (Ambulance) carTemp; 
		
		
		
	}

}
