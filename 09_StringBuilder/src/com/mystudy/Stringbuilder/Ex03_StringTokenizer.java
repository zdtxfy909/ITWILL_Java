package com.mystudy.Stringbuilder;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex03_StringTokenizer {

	public static void main(String[] args) {
		// String 클래스의 split() vs StringTokenizer 클래스
		System.out.println("---- String split() -----");
		String str = "사과,배,복숭아,,포도"; //스페이스 없이
		System.out.println("str : " + str.toString());
		
		String[] strSplit = str.split(","); // ,구분자로 잘라라
		// 스트링배열로 리턴해줌
		System.out.println(strSplit.length); //length 속성값. 5
		System.out.println(Arrays.toString(strSplit));
		
		System.out.println("--- str.split(\",\") 실행결과 배열 ---");
		for (int i = 0; i < strSplit.length; i++) {
			System.out.print(strSplit[i]);
		}
		//스페이스 없는 빈문자열도 스플릿은 배열데이터로 가지고 있는다 => length값 5
		System.out.println();
		
		System.out.println("--- 개선된 for문으로(또는 forEach문) ---");
		for (String str2 : strSplit) {
			System.out.println(str2);
		}
		System.out.println("----");
		
		int idx = 0;
		for (String str2 : strSplit) {
			System.out.println(idx + ": " + str2);
			idx++;
		}
		
		System.out.println("\n===== StringTokenizer ========");
		str = "사과,배,복숭아,,포도";
		System.out.println("str : " + str);
		
		StringTokenizer strToken = new StringTokenizer(str, ",");
		System.out.println("strToken.countTokens() : " + strToken.countTokens());
		// 스페이스 안 넣으면 4, 스페이스 넣으면 5
		while (strToken.hasMoreTokens()) { // 사용할 다음 데이터가 남아있는가
			String token = strToken.nextToken(); // 가져다 사용(사용할 데이터가 없을 때까지)
			System.out.println("-" + token + "-");
		}
		// (주의) 토큰이 없을 때 nextToken() 사용하면 
		// NoSuchElementException 예외발생
		// 사용할 데이터가 있는지 확인하고 쓴다 (짝수실행, 홀수실행 주의)
		System.out.println("strToken.countTokens() : " + strToken.countTokens());
		// 0
		
		System.out.println("=======================");
		
		System.out.println("--- (실습) for문으로 화면 출력 ----");
		strToken = new StringTokenizer(str, ","); // 토큰 새로 만들기
		System.out.println("strToken.countTokens() : " + strToken.countTokens());
		int tokenCnt = strToken.countTokens();
		for (int i = 0; i < tokenCnt; i++) {
			String token = strToken.nextToken();
			System.out.println("-" + token + "-");
			System.out.println("토큰갯수 : " + strToken.countTokens());
		}
		
		System.out.println("--- main() 끝 ---"); 
		// 토큰 이미 다 꺼내 썼기 때문에 아무것도 안 뜸 > 토큰 새로 만들어줘야됨
		
		
		
		
		
		
		
	}

}
