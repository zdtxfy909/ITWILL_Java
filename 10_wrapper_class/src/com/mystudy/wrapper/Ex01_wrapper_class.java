package com.mystudy.wrapper;

public class Ex01_wrapper_class {

	public static void main(String[] args) {
		// wrapper class : 기본 데이터 타입의 기능확장한 클래스(들)의 총칭이다.
		// 기본 데이터 타입 : 전체소문자 
		// 	boolean, char, byte, short, int, long, float, double
		// wrapper class : 기본 데이터 타입의 첫글자를 대문자로 
		// 	예외 : char -> Character, int -> Integer
		// 	Boolean, Character, Byte, Short, Integer, Long, Float, Double
		//-----------------
		int num = 100;
		System.out.println("num : " + num);
		
		//Integer intNum = new Integer(100); 
		Integer intNum = new Integer("100"); // 문자열을 자동으로 정수로 형변환해줌
		// Integer intNum = new Integer(num); // 이렇게 쓸 수는 있지만 쓸 필요는 없다.
		System.out.println("Integer intNum : " + intNum);
		
		String strNum = intNum.toString();
		System.out.println("String strNum : " + strNum);
		
		intNum = 900; // Integer <--- int : 자동형변환
		num = intNum; // int <--- Integer : 자동형변환
		
		Integer.parseInt("999"); // int <--- String 형변환
		intNum = Integer.valueOf("999"); // Integer <--- String
		
		String str = String.valueOf(9999); // String <--- int
		//전달받은 데이터를 해당 데이터타입으로 바꾼다.
		
		System.out.println("int 최대값 : " + Integer.MAX_VALUE);
		System.out.println("int 최소값 : " + Integer.MIN_VALUE);
		
		System.out.println("--- Boolean ---");
		Boolean bool = true;
		bool = new Boolean(true);
		bool = new Boolean("true"); // 문자열 주는 것도 가능
		bool = new Boolean("TRUE"); // 대문자도 가능, 철자만 맞으면 true임
		
		System.out.println("Boolean true : " + bool);
		
		bool = new Boolean("false");
		bool = new Boolean("FALSE");
		bool = new Boolean("true1"); // 예외가 발생하진 않지만 false
		// true가 아닌 문자열은 false다
		System.out.println("Boolean false : " + bool);
		
		System.out.println("--- String ---> Boolean ----");
		Boolean bool2 = Boolean.valueOf("true"); // Boolean <--- String
		boolean bool3 = Boolean.parseBoolean("true"); // 문자열을 기본데이터타입 boolean으로 
		
		System.out.println("=== Float, Double ====");
 		Float f = 10.5f; // Float <--- float
 		f = new Float(12.5f);
 		f = new Float("12.5f");
 		f = new Float("12.5");
 		
 		
 		System.out.println("Float f : " + f);
		
 		// f = "12.5"; // string을 float에 담기 > 오류
 		String str2 = String.valueOf(f); // String <--- Float
 		System.out.println("String str2 : " + str2);
 		
 		f = Float.valueOf("12.5f"); //Float <--- String // valueOf 쓰기
 		System.out.println("Float f : " + f);
 		System.out.println("----------------");
 		
 		Double d = 10.5; // Double <--- double
 		d = new Double(12.5d);
 		d = new Double("12.5d");
 		System.out.println("Double d : " + d);
 		
 		d = Double.valueOf("12.5d");
 		d = Double.valueOf("12.5");
 		d = Double.valueOf("10.5f");
 		System.out.println("Double d : " + d);
 		

	}

}
