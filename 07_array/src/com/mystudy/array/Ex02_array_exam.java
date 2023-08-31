package com.mystudy.array;

public class Ex02_array_exam {

	public static void main(String[] args) {
		/* (실습)배열에 저장된 숫자의 합계 구하기(변수명 nums)
		저장할 숫자 : 3, 5, 7, 1, 2, 4, 6, 8, 9, 10
		0. 위 숫자가 저장된 배열 만들기 //{값}에 붙여넣기
		1. 배열에 저장된 데이터를 화면 출력(반복문 사용)
		2. 배열에 저장된 데이터의 합계 구하기
		3. 합계 결과 55 출력
		 --------------------------*/
		//문제1 ---------------------------
		System.out.println("==== 문제1 ====");
		int[] nums = {3, 5, 7, 1, 2, 4, 6, 8, 9, 10};
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			System.out.print(" ");
		}
		System.out.println();
		
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		System.out.println("배열의 합계 결과 : " + sum);
		
		//문제2 ---------------------------
		//(실습) 배열값 중 홀수합, 짝수합 구하기
				//배열에 있는 값 중 짝수는 짝수끼리 합산(evenSum)
				//배열에 있는 값 중 홀수는 홀수끼지 합산(oddSum)
				//짝수합계, 홀수합계 출력
		
		System.out.println("==== 문제2 ====");
		int evenSum = 0; // 짝수끼리 합산해주기
		int oddSum = 0; // 홀수끼리
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]%2 == 0) {		//짝수끼리
				evenSum = evenSum + nums[i];
			} else {					//홀수끼리, else말고 if 두개 넣어도됨
				oddSum = oddSum + nums[i];
			} 
		}
		System.out.println("짝수합계 : " + evenSum);
		System.out.println("홀수합계 : " + oddSum);
		
	}

}
