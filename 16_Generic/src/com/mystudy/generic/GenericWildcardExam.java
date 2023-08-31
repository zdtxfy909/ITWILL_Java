package com.mystudy.generic;

class BoxT<T> {
	T obj;
	T getObj() {
		return obj; // = 리턴타입 T다
	}
	void setObj(T obj) {
		this.obj = obj;
	}
}

public class GenericWildcardExam {

	public static void main(String[] args) {
		/*
		제네릭(Generic)의 대표문자(wildcard)
    	1. <?> : 모든 타입(객체) 자료형에 대한 대표문자를 의미
    	2. <? extends 자료형> : 자료형을 상속받은 자녀(sub) 클래스 타입 사용
    	3. <? super 자료형> : 자료형의 부모(super) 타입 사용 
		-------------------------*/
		BoxT<String> box1 = new BoxT<String>();
		box1.setObj("문자열");
		
		BoxT<Integer> box2 = new BoxT<>(); //타입생략가능. 앞에 string이면 뒤에도 string이니까
		//참조형 데이터타입만 올 수 있다
		//box2.setObj("문자열"); > 오류
		//box2.setObj(100.0); > 오류
		
		box2.setObj(1000); //Integer 타입 저장
		
		System.out.println("---------------------");
		// <?> 모든 것을 담을 수 있는 형태
		BoxT<?> box3 = new BoxT<String>(); //스트링을 저장할 박스를 만들겠다
		box3 = new BoxT<Integer>();
		box3 = new BoxT<StringBuilder>();
		
		// <? extends 자료형> : 자료형을 상속받은 자녀(sub) 클래스 타입 사용
		BoxT<? extends Number> box4 = null;
		box4 = new BoxT<Number>(); // 자기자신 가능
		box4 = new BoxT<Integer>();
		box4 = new BoxT<Double>(); // Number를 상속확장한 Double 가능
		
		// [컴파일오류] Character가 Number 타입을 상속받지 않음
		//box4 = new BoxT<Character>(); // Number의 자녀타입이 아님
		
		// <? super 자료형> : 자료형의 부모(super) 타입 사용 
		BoxT<? super Number> box5 = null;
		box5 = new BoxT<Number>();
		box5 = new BoxT<Object>();
		
		// [컴파일오류] Integer가 Number 타입을 슈퍼/상위 타입 아님
		//box5 = new BoxT<Integer>(); // 자녀타입은 안됨
		
		
		
	}

}
