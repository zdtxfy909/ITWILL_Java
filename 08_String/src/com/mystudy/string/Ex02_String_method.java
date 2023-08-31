package com.mystudy.string;

import java.util.Arrays;

public class Ex02_String_method {

	public static void main(String[] args) {
		// String 클래스 메소드를 사용하여 문자열 처리(단, 원본문자열 불변)
		//			  0123456789
		String str = "Java World";
		System.out.println(str);

		System.out.println("---- charAt(인덱스번호) ---");
		char ch = str.charAt(0); //str의 0번인덱스 글자
		System.out.println("str.charAt(0) : " + ch);
		System.out.println("str.charAt(1) : " + str.charAt(1));
		
		char[] ch2 = new char[4];  // 문자 4개를 저장할 수 있는 공간 생성
//		ch2[0] = str.charAt(0);
//		ch2[1] = str.charAt(1);
//		ch2[2] = str.charAt(2);
//		ch2[3] = str.charAt(3);	
		
		for (int i = 0; i < ch2.length; i++) {
			ch2[i] = str.charAt(i);
		}
		System.out.println(Arrays.toString(ch2)); //[J, a, v, a]
		
		System.out.println("--- compareTo() : 문자열비교(결과 : 음수, 0, 양수)");
		System.out.println("\"java\".compareTo(\"java\") : " + "java".compareTo("java")); //0
		System.out.println("aaa vs aaa : " + "aaa".compareTo("aaa")); //0
		System.out.println("bbb vs aaa : " + "bbb".compareTo("aaa")); //1
		System.out.println("ccc vs aaa : " + "ccc".compareTo("aaa")); //2
		
		System.out.println("aaa vs bbb : " + "aaa".compareTo("bbb")); //-1
		// 	   0123456789
		str = "Java World";
		System.out.println("str : " + str);
		
		System.out.println("--- indexOf() : 문자(문자열) 위치값 확인 ----");
		System.out.println("str.indexOf('X') : " + str.indexOf('X')); 
		// -1 : 없다
		System.out.println("str.indexOf('J') : " + str.indexOf('J')); 
		// 0 : 첫번째. 대문자 J의 위치값
		System.out.println("str.indexOf(\"Java\") : " + str.indexOf('J'));
		
		System.out.println("str.indexOf('a') : " + str.indexOf('a')); 
		// 1 : 두번째 위치
		System.out.println("str.indexOf('a', 2) : " + str.indexOf('a', 2)); 
		
		System.out.println("--- lastIndexOf() : 문자(문자열) 찾기(뒤에서부터) ---");
		System.out.println("str.lastIndexOf('a') : " + str.lastIndexOf('a')); 
		//뒤에서 찾기 시작함
		
		System.out.println("---- startsWith(), endsWith() ------");
		System.out.println("str.startsWith(\"Java\") : " + str.startsWith("Java"));
		//자바로 시작하냐? true
		System.out.println("str.startsWith(\"World\") : " + str.startsWith("World"));
		//자바로 시작하냐? false
		System.out.println("str.endsWith(\"Java\") : " + str.endsWith("Java"));
		//자바로 끝나냐? false
		System.out.println("str.endsWith(\"World\") : " + str.endsWith("World"));
		//자바로 끝나냐? true
		
		System.out.println("--- isEmpth() ----");
		System.out.println("str : " + str);
		System.out.println("str.isEmpty() : " + str.isEmpty());
		//false. 데이터 있다
		str = ""; // 빈문자열
		System.out.println("str : " + str + "--");
		System.out.println("str.isEmpty() : " + str.isEmpty());
		//true. 데이터 없다
		System.out.println();
		
		System.out.println("str.length() : " + str.length());
		System.out.println();
		
		System.out.println("---- replace() : 문자, 문자열 변경된 문자열 받기 ----");
		//	   0123456789
		str = "Java World";
		System.out.println("str : " + str);
		System.out.println("str.replace(\"Java\", \"Hello\") : " + str.replace("Java", "Hello"));
		// Java를 Hello로 변경. Hello World
		System.out.println("str : " + str);
		// str의 값은 바뀌지 않았음. Java World
		// 원본데이터 불변
		System.out.println("str.replace(\"a\", \"m\") : " + str.replace("a", "m"));
		// Jmvm World
		System.out.println("str : " + str);
		// str : Java World
		System.out.println("------");
		
		str = "Java World";
		System.out.println("str : " + str);
		System.out.println("str.replace(\"Ja\", \"JA\") : " + str.replace("Ja", "JA"));
		// JAva World
		System.out.println("str.replaceAll(\"Java\", \"Hello\") : " + str.replace("Java", "Hello"));
		System.out.println("=================");
		
		System.out.println("---- substring() : 부분 문자열 추출 -------");
		//	   0123456789
		str = "Java World12312";		
		System.out.println("str : " + str);
		System.out.println(str.substring(5)); //5번 인덱스에서 끝까지
		// World12312
		System.out.println("str.length() : " + str.length());
		//	   0123456789
		str = "Java World";
		// beginIndex : 부터(포함)
		// endIndex : end 이전까지(불포함)
		System.out.println("str.substring(0, str.length()) : " 
					+ str.substring(0, str.length()));
		System.out.println("str.substring(5, str.length()) : " 
					+ str.substring(5, str.length()));
		
		// 뒤에서 5개 문자만 사용
		System.out.println("str.substring(str.length() - 5) : " 
					+ str.substring(str.length() - 5));
		// World
		System.out.println("------------");
		
		str = "   Java World     ";
		System.out.println("str : -" + str + "-");
		System.out.println("str.trim() : -" + str.trim() + "-");
		System.out.println("str.toUpperCase() : " + str.toUpperCase());
		System.out.println("str.toLowerCase() : " + str.toLowerCase());
		System.out.println("-------");
		
		System.out.println("----- string.valutOf() : 문자열로 변환 -----");
		int num = 100;
		str = 100 + " ";
		// String <=== int
		str = String.valueOf(100); // "100" 문자열로 형변환
		str = String.valueOf(num);
		
		System.out.println("------ toCharArray() 문자열을 char[]로 변환");
		str = "Java World";
		System.out.println("str : " + str);
		char[] charArray = str.toCharArray();
		System.out.println(Arrays.toString(charArray));
		System.out.println("charArray[0] : " + charArray[0]);
		
	}

}
