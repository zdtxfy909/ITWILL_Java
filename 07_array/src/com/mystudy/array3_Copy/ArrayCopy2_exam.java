package com.mystudy.array3_Copy;

import java.util.Arrays;

public class ArrayCopy2_exam {

	public static void main(String[] args) {
		/* 문제1 : int 타입의 데이터 4개를 저장할 수 있는 배열을 만들어라(num1)
		1. 10, 20, 30, 40 숫자를 입력하고 화면 출력(반복문 사용)
		2. 세번째 데이터를 100으로 변경하고 화면 출력
		3. 숫자 20을 찾아서 99로 변경 (if)
		-----------------------------------*/
		//1. 10, 20, 30, 40 숫자를 입력하고 화면 출력(반복문 사용)
		System.out.println("==== 문제1 ===");
		int[] num1 = new int[4];
		
		for (int i = 0; i < 4; i++) {
			num1[i] = (10 * (i + 1));
		}
		
		printData("num1", num1);
		
		//2. 세번째 데이터를 100으로 변경하고 화면 출력
		num1[2] = 100;
		
		printData("num1", num1);
		
		//3. 숫자 20을 찾아서 99로 변경 (if)
			// num1[3] = 20; // break 넣어줘야 앞에 하나만 바꾸고 반복문 탈출
		for (int i = 0; i < num1.length; i++) {
			if(num1[i] == 20) {
				num1[i] = 99;
				break;
			} 
		}
		printData("num1", num1);
		
		/* 문제2 : num1과 크기가 같은 배열을 만들어라(num1Copy)
		num1Copy에 num1 데이터를 복사하고 화면 출력
		주소값 복사인지 깊은복사(물리적 복사) 여부 확인해보기
		-----------------------------------*/
		System.out.println("==== 문제2 ===");
		int[] num1Copy = new int[num1.length];
		printData("num1Copy", num1Copy);
		
		for (int i = 0; i < num1Copy.length; i++) {
			num1Copy[i] = num1[i];
		}
		printData("num1Copy", num1Copy);
		
		// 주소값이 동일하냐? 동일객체인가?
		if (num1 == num1Copy) {
			System.out.println(":: num1, num1Copy : 동일주소, 동일객체");
		}
		if (num1 != num1Copy) {
			System.out.println(":: num1, num1Copy : 다른주소, 별개의 다른 객체");
		}
		
		System.out.println("=== 1차원배열 clone() 처리 ===");
		num1Copy = num1.clone();
		printData("num1Copy", num1Copy);
		System.out.println("num1 == num1Copy : " + (num1 == num1Copy));
		//주소값 다르다
		
		System.out.println("=== 1차원배열 Arrays.copyOf() 처리 ===");
		num1Copy = Arrays.copyOf(num1, num1.length);
		printData("num1Copy", num1Copy);
		System.out.println("num1 == num1Copy : " + (num1 == num1Copy));
		//주소값 다르다
		
		
	}
	
	static void printData(int[] num1) {
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " ");
		}
		System.out.println();
	}

	static void printData(String name, int[] num1) { 
		System.out.print(name + ": ");
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " ");
		}
		System.out.println();
	}
	
}
