package com.mystudy.array;

public class Ex04_array_swap {

	public static void main(String[] args) {
		// 변수값 서로 교환하기
		int a = 333;
		int b = 777;
		System.out.println("a : " + a); 
		System.out.println("b : " + b);
		System.out.println("---- 바꾼 후 결과 -----");
		int temp;
		temp = a;
		a = b;
		a = temp;
		//-------
//		int c = a;
//		a = b;
//		b = c;
		System.out.println("a : " + a); //200출력
		System.out.println("b : " + b); //100출력
		System.out.println("===============");
		
		//			   0    1    2    3    4    5
		int[] nums = {100, 200, 300, 400, 500, 600, 700};
		System.out.println("배열의 크기 : " + nums.length);
		
		//배열 전체 데이터 화면출력
		printArray(nums);
		
		System.out.println("----배열데이터 뒤집기");
		/* 배열 데이터를 뒤집기
		nums = {600, 500, 400, 300, 200, 100};
		*/
		//첫번째 0 <--> 마지막 5 (인덱스)
		temp = nums[0];
		nums[0] = nums[5];
		nums[5] = temp;
		
		//두번째 1 <--> 마지막 이전 테이터 4 (인덱스)
		temp = nums[1];
		nums[1] = nums[4];
		nums[4] = temp;
		
		//세번째 2 <--> 마지막 전전 데이터 3 (인덱스)
		temp = nums[2];
		nums[2] = nums[3];
		nums[3] = temp;
		
//
//		for (int i = 0; i < nums.length / 2; i++) {
//			temp= nums[i];
//			nums[i] = nums[nums.length - (i + 1)];
//			nums[nums.length - (i + 1)] = temp;
//		}
		
		
		
		//위치 변경된 배열 전체 데이터 화면출력
		reverse(nums);
		
		}
		
		static void printArray(int[] arr) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
		
		static void reverse (int[] nums) {
			int lastIdx = nums.length - 1;
			int count = nums.length / 2;
			for (int i = 0; i < count; i++) {
				int temp = nums[i];
				nums[i] = nums[lastIdx];
				nums[lastIdx] = temp;
				
				lastIdx--;
			}
		}
	

}
