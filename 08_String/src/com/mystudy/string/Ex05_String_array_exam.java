package com.mystudy.string;

import java.util.jar.Attributes.Name;

public class Ex05_String_array_exam {

	public static void main(String[] args) {
		/* String[]과 String 메소드 사용 실습
		문자열 : "홍길동","이순신","이순신","을지문덕","김유신","연개소문","Tom","TOM"
		1. 위의 문자열 값을 저장할 수 있는 문자열 배열(names) 변수를 선언하고 입력
		2. 배열에 있는 값을 구분자 콤마(,)로 구분하여 한 라인에 출력
		   출력 예) 홍길동,이순신,이순신,을지문덕....
		3. 배열에 있는 데이터의 첫 글자만 출력-구분자 콤마(,) 사용 한 라인에 출력
		   출력 예) 홍,이,이,을,김,연,T,T...
		4. 이름의 글자수가 4글자 이상인 이름을 검색해서 "인덱스번호:이름" 형태로 출력
		   예) 3:을지문덕
		5. 이름이 같은 데이터를 "인덱스번호:이름=인덱스번호:이름" 형태로 출력
		   예) 1:이순신=2:이순신
		(기타) 이름 비교시에는 대소문자 구분 없이 비교처리(Tom, TOM 은 같다)
		========================================================= */
		// 1. 위의 문자열 값을 저장할 수 있는 문자열 배열(names) 변수를 선언하고 입력
		String[] names = {"홍길동","이순신","이순신","을지문덕",
					"김유신","연개소문","Tom","TOM"};
		
		System.out.println("문제2 ================");
		// 2. 배열에 있는 값을 구분자 콤마(,)로 구분하여 한 라인에 출력
		// 패턴1 : 이름, / 이름(마지막)
		for (int i = 0; i < names.length; i++) {
			if (i == names.length - 1) {		// 마지막데이터냐?
				System.out.print(names[i]);
			} else {
				System.out.print(names[i] + ", ");
			}
		}
		System.out.println();
		System.out.println("----------");
		
		// (분리한 버전) 처음 ~ 마지막 이전까지 
		for (int i = 0; i < names.length - 1; i++) {
			System.out.print(names[i] + ", ");	// 홍길동, 
		}
		// 마지막 데이터 처리
		if (names.length > 0) { // 최소한 1개 이상 있으면
			System.out.println(names[names.length - 1]); // TOM
		}
		System.out.println("-------------");
		
		// 패턴2 : 이름(첫번째) / ,이름(나머지)
		for (int i = 0; i < names.length; i++) {
			if (i == 0) { // 첫번째냐?
				System.out.print(names[i]);
			} else {
			System.out.print(", " + names[i]);
			}
		}
		System.out.println();
		System.out.println("-----");
		
		// (분리한 버전)
		System.out.print(names[0]); // 홍길동
		
		for (int i = 1; i < names.length; i++) {
			System.out.print(", " + names[i]);	// ,이순신 ,이순신 ,을지문덕...
		}
		System.out.println();
		System.out.println("===================");
		
		// 개선된 for문에 boolean 사용해서 마지막에 콤마 안 넣기
		boolean isFirst = true;
		for (String name : names) {
			if (isFirst) {
				System.out.print(name);
				isFirst = false;
			} else {
				System.out.print("," + name);
			}
		}
		System.out.println();
		
		System.out.println("문제3 ================");
		// 3. 배열에 있는 데이터의 첫 글자만 출력-구분자 콤마(,) 사용 한 라인에 출력
		// 홍, 이, 이, 을, 김, 연, T, T
		for (int i = 0; i < names.length; i++) {
			if (i < names.length - 1) {
				System.out.print(names[i].charAt(0) + ", ");
			} else {
				System.out.print(names[i].charAt(0));
			}
		}
		System.out.println();
		
		System.out.println("문제4 ================");
		// 4. 이름의 글자수가 4글자 이상인 이름을 검색해서 "인덱스번호:이름" 형태로 출력
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() >= 4) {
				System.out.println(i + ":" + names[i]);
			}
		}
		
		System.out.println("문제5 ================");
		// 5. 이름이 같은 데이터를 "인덱스번호:이름=인덱스번호:이름" 형태로 출력
		
		int lastIndex = names.length - 1;
		for (int baseIdx = 0; baseIdx < names.length - 1; baseIdx++) {
			for (int i = baseIdx + 1; i < names.length; i++) {
				if (names[baseIdx].equalsIgnoreCase(names[i])) {
					System.out.println(baseIdx + ":" + names[baseIdx]
							+ "=" + i + ":" + names[i]);
				}
			}
		}
		System.out.println("========================");
		//0		1		2		3		4		5	 6     7
		//홍길동, 이순신, 이순신, 을지문덕, 김유신, 연개소문, Tom, TOM
		names = new String[] {"홍길동","이순신","이순신","을지문덕","김유신","연개소문","Tom","TOM"};
		if (names[0].equalsIgnoreCase(names[1])) {
			System.out.println(0 + ":" + names[0] + "=" + 1 + ":" + names[1]);
		}
		if (names[0].equalsIgnoreCase(names[2])) {
			System.out.println(0 + ":" + names[0] + "=" + 2 + ":" + names[2]);
		}
		if (names[0].equalsIgnoreCase(names[3])) {
			System.out.println(0 + ":" + names[0] + "=" + 3 + ":" + names[3]);
		}
		//...
		//마지막 데이터 비교
		//names.length = 8, 마지막데이터의 인덱스번호는 7이니까 names.length - 1 해줘야됨
		if (names[0].equalsIgnoreCase(names[names.length - 1])) {
			System.out.println(0 + ":" + names[0] + "=" 
					+ (names.length - 1) + ":" + names[names.length - 1]);
		}
		//-----------------------
		System.out.println("------");
		//기준인덱스가 0일 때
		for (int i = 1; i < names.length; i++) { // 비교대상은 1부터 시작
			if (names[0].equalsIgnoreCase(names[i])) {
				System.out.println(0 + ":" + names[0] + "=" + i + ":" + names[i]);
			}
		}
		//기준인덱스가 1일 때
		for (int i = 2; i < names.length; i++) { //비교대상은 2부터 시작
			if (names[1].equalsIgnoreCase(names[i])) {
				System.out.println(1 + ":" + names[1] + "=" + i + ":" + names[i]);
			}
		}
		//기준인덱스가 2일 때
		for (int i = 3; i < names.length; i++) { //비교대상은 3부터 시작
			if (names[2].equalsIgnoreCase(names[i])) {
				System.out.println(2 + ":" + names[2] + "=" + i + ":" + names[i]);
			}
		}
		//기준인덱스 3부터는 생략
		//기준인덱스(최종적용할 마지막 기준 인덱스) : 마지막 이전 데이터
		//Tom과 TOM을 비교해야하고, TOM은 자기자신과 비교할 필요 없으니까
		//마지막 데이터 = length -1 , 마지막 이전 데이터 = length - 2 
		for (int i = names.length - 1; i < names.length; i++) { 
			if (names[names.length-2].equalsIgnoreCase(names[i])) {
				System.out.println((names.length - 2) + ":" + names[names.length-2] + "=" + i + ":" + names[i]);
			}
		}
		
		System.out.println("=== 이중 for문 작성 ===== ");
		// 기준 인덱스 : 0 ~ 마지막 이전 인덱스
		lastIndex = names.length - 1; // 마지막 데이터의 인덱스 번호는 7이다
		for (int gijun = 0; gijun < lastIndex; gijun++) {
			for (int i = gijun + 1; i < names.length; i++) { // 비교대상은 1부터 시작
				if (names[gijun].equalsIgnoreCase(names[i])) {
					System.out.println(gijun + ":" + names[gijun] + "=" + i + ":" + names[i]);
				}
			} 	// 기준이 0부터 시작이면 i는 1부터 시작
		}		// 마지막 인덱스보다 하나 적을 때까지 진행한다 
	}			// = 마지막 데이터는 자기 자신만 비교하니까 할 필요가 없다
}
