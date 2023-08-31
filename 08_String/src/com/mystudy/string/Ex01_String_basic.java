package com.mystudy.string;

public class Ex01_String_basic {

	public static void main(String[] args) {
		// String 클래스 : 문자열을 저장하고 처리하기 위한 클래스
		// String 클래스 : 참조형 데이터 타입
		// String 데이터는 불변임(immutable)
		//----------------------
		// 사용형식 2가지
		// String str = "홍길동"; // 기본 데이터 타입처럼 사용 가능하다
		// String str = new String("홍길동"); //객체(인스턴스) 생성, 일반적으로 사용
		//----------------------
		String str1 = "홍길동";
		String str2 = "홍길동";	
		//주소값이 같다. 저장되어있는 문자열도 같다. 동일객체다. 
		System.out.println("str1 : " + str1); //주소값이 나오지 않음
		System.out.println("str2 : " + str2);
		// == : 객체(인스턴스, 주소값) 비교(동일 객체 여부 확인)
		System.out.println("str1 == str2 : " + (str1 == str2));
		//주소값 같다
		System.out.println("str1 == str2 : " + str1.equals(str2));
		System.out.println("-------------");
		
		String strObj1 = new String("홍길동");
		String strObj2 = new String("홍길동");
		System.out.println("strObj1 : " + strObj1);
		System.out.println("strObj2 : " + strObj2);
		System.out.println("str1 == strObj1 : " + (str1 == strObj1));
		// 똑같은 문자열을 가지고 있지만 false. 동일객체 아니다.
		System.out.println("str1.equals(strObj1) : " + str1.equals(strObj1));
		// true. 똑같이 "홍길동"이라는 문자를 저장하고 있다.
		System.out.println("strObj1 == strObj2 : " + (strObj1 == strObj2));
		System.out.println("str1.equals(strObj2) : " + str1.equals(strObj2));
		
		System.out.println("==== 문자열 값 비교 equals() 사용 ===");
		// equals() : 문자열 값을 비교할 때는 반드시 equals() 사용할 것(반드시)
		System.out.println("str1 == str2 : " + str1.equals(str2));
		System.out.println("str1 == str2 : " + str1.equals(str2));
		System.out.println("str1.equals(strObj2) : " + str1.equals(strObj2));
	}

}
