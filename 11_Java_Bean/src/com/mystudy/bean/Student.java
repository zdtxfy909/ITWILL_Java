package com.mystudy.bean;

import javax.management.loading.PrivateClassLoader;

/*
■ 자바빈(Java Bean)
  - 멤버변수(property, 필드에 선언된 변수)의 접근제어자는 private
  - 멤버변수(property) 마다 get/set 메소드 제공(선택적으로 get만 제공)
  - get/set 메소드는 public
  - get 메소드는 파라미터 없고, set 메소드는 하나 이상의 파라미터 존재
  - 멤버변수(property)가 boolean 타입이면 get 메소드 대신 is 메소드 사용가능
  - 외부에서 멤버변수(property) 접근시에는 get/set 메소드를 통해 접근
 */

//public class Student extends Object {
class Student { // extends Object 생략하면 컴파일러가 자동 삽입, public 없으면 defualt
	private	String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	//=== 생성자 ===================
	public Student() {
		// super : 부모클래스 객체(인스턴스)
		// super() : 부모클래스 객체(인스턴스)의 기본 생성자 호출
		super(); //생략시 컴파일러가 자동 삽입해서 처리함
	}
	
	public Student(String name) {
		super(); //생략시 컴파일러가 자동 삽입해서 처리함
		this.name = name;
	}
	public Student (String name, int kor, int eng, int math) {
		// 현재 객체(인스턴스)의 생성자 호출
		//생성자의 재사용
		//this.name = name;
		this(name);  //생성자 코드 중 맨 처음 작성해야 한다.
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computeTotAvg();
	}
	
	

	//==== 메소드 작성 영역 =======
	// 외부에서 사용할 수 있도록 메소드를 제공한다. (public)
	// 외부에서 데이터를 전달받아 필드(멤버변수)에 데이터를 저장하기 위한 set 메소드
	// 명칭(호칭) set메소드, setter, set property(속성값 설정 - 쓰기) 
	void setName(String name) { 
		this.name = name;
	}
	
	// 외부에서 데이터를 읽어 가기 위한 get 메소드
	// 명칭(호칭) : get메소드, getter, get property(메소드)
	String getName() { 
		return name;
	}

	// kor : setter, getter
	public void setKor(int kor) {
		// 적절한 데이터인지 확인
		if (kor >= 0 && kor <= 100) {
			this.kor = kor;
		} else {
			System.out.println("[예외발생] 국어 0 ~ 100 값이 아님 : " + kor);
		}
	}
	
	public int getKor() {
		return kor;
	}
	
	// eng, math : setters, getters 작성
	public void setEng(int eng) {
		if (eng >= 0 && eng <= 100) {
			this.eng = eng;
		} else {
			System.out.println("[예외발생] 영어 0 ~ 100 값이 아님 : " + eng);
		}
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setMath(int math) {
		if (math >= 0 && math <= 100) {
			this.math = math;
		} else {
			System.out.println("[예외발생] 수학 0 ~ 100 값이 아님 : " + math);
		}
	}
	
	public int getMath() {
		return math;
	}
	
	public int getTot() {
		return tot;
	}
	
	public void setTot(int tot) {
		this.tot = tot;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public void setAvg(double avg) {
		this.avg = avg;
	}
	// printData() 메소드 작성 : 저장된 데이터 화면출력
	
	public void printData() { //외부로부터 전달받을 거 없다. 가지고 있는 데이터 출력해달라. 
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math 
					+ "\t" + tot + "\t" + avg);
	}
	
	private void computeTotAvg() {
		tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
	}
	
}
