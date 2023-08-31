package com.mystudy.array;

import java.util.Arrays;

public class Ex01_array1 {

	public static void main(String[] args) {
		// 배열(array) : 동일한 데이터 타입들의 연속된 저장공간이다.
		// 배열의 선언 : 데이터타입[] 변수명
		// 변수에 값을 저장 : 배열변수명[인덱스번호] = 값;
		/* 배열의 선언 및 생성
		1. 자료형[] 변수명 = new 자료형[갯수]; 
		   자료형 변수명[] = new 자료형[갯수];
		2. 자료형[] 변수명 = new 자료형[] {값1, 값2, 값3, ..., 값n};
		3. 자료형[] 변수명 = {값1, 값2, 값3, ..., 값n};
		 ----------------*/
		
		// 1. 자료형[] 변수명 = new 자료형[갯수]; 
		//  자료형 변수명[] = new 자료형[갯수];
		
		int[] arr = new int[5]; // int값 5개가 저장 가능한 저장 공간이 만들어진다.
		// arr 0 0 0 0 0
		System.out.println("arr : " + arr); // arr의 주소값 알려줌
		System.out.println("arr[0] : " + arr[0]); //0번 인덱스 값 확인. 결과 0
		System.out.println("arr[3] : " + arr[3]); //3번 인덱스 값 확인. 결과 0
		System.out.println("-----");

		for(int i = 0; i < 5; i++) { //0부터 4까지
			System.out.println(i + ":" + arr[i]);
		} // 다섯개의 저장공간에 0이 저장
		System.out.println("-----");

		arr[0] = 10; //배열의 첫번째 위치(인덱스번호 0번)에 10이라는 값 설정(저장)
		System.out.println("arr[0] : " + arr[0]);
		for(int i = 0; i < 5; i++) {
			System.out.println(i + ":" + arr[i]);
		}
		System.out.println("-----");

		arr[1] = 11;
		System.out.println("arr[1] : " + arr[1]);
		arr[2] = 12;
		arr[3] = 13;
		arr[4] = 14; //마지막 데이터(크기 - 1) 
		// arr[5] = 15; //ArrayIndexOutOfBoundsException
		System.out.println("-----");


		System.out.println("---- 배열 length 속성 -------");
		// 배열의 크기를 확인할 수 있는 속성값
		System.out.println("arr.length : " + arr.length);

		for(int i = 0; i < 5; i++) {
			System.out.println(i + ":" + arr[i]);
		}
		
		System.out.println("==== 배열선언 형태 2번 =======");
		//2. 자료형[] 변수명 = new 자료형[] {값1, 값2, 값3, ..., 값n};
		//     					0	 1   	2	 3 	4	: 인덱스번호		
		int[] arr2 = new int[] {100, 101, 102, 103, 104};
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("==== 배열선언 형태 3번 =======");
		// 3. 자료형[] 변수명 = {값1, 값2, 값3, ..., 값n};
		int[] arr3 = {10, 11, 12, 13, 14, 15};
		for (int idx = 0; idx < arr3.length; idx++) {
			System.out.println(arr3[idx]);
		}
		
		System.out.println("==================");
		int[] nums = new int[10];
		//초기값 설정 : 1~10까지 숫자를 저장
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1; // i에 1을 더할뿐, i의 값 자체를 바꿔주는 건 아니다.
		}
		//배열값 확인
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}	// 1 2 3 4 5 6 7 8 9 10
		System.out.println(); 
		System.out.println(Arrays.toString(nums));
		
		System.out.println("======================");
		System.out.println("=== 영어 알파벳 문자 저장/출력(A~Z) ====");
		char[] ch = new char[26];
		System.out.println(Arrays.toString(ch));
		System.out.println("-" + ch[0] + "-");		
		System.out.println("-" + '\u0000' + "-");	//유니코드 쓸모없는 값
		ch[0] = 'A'; // 65라는 숫자값을 저장하고 있다.
		ch[1] = 'B'; // 66 <--- 65(A) + 1
		ch[2] = 'C'; // 67 <--- 65(A) + 2
		System.out.println("-----------");
		
		ch[0] = 'A' + 0; //A
		ch[1] = 'A' + 1; //B
		ch[2] = 'A' + 2; //C
		ch[3] = 'A' + 3; //D
		
		System.out.println(Arrays.toString(ch));
		System.out.println("-----------");
		
		//(실습) 데이터 A~Z 일괄입력(반복문 사용)
		System.out.println("ch.length : " + ch.length);
		
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char)('A' + i);
			// int가 더 크기때문에 자동형변환 안됨
		}
	
		//(실습) 배열 데이터 화면 출력(반복문 사용)
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]); 
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("-----------");
		System.out.println(Arrays.toString(ch));
		
	}	
	

}
