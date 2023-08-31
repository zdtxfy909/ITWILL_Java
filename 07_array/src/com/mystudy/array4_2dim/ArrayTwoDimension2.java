package com.mystudy.array4_2dim;

public class ArrayTwoDimension2 {

	public static void main(String[] args) {
		// 2차원 배열 선언 및 객체 생성
		// 타입명[][] 변수명 = new 타입[크기값][크기값];
		// 타입명 변수명[][] = new 타입[크기값][크기값];
		// 타입명[][] 변수명 = { {..}, {..}, ..., {..}};
		//-----------------------
		int[][] nums = new int[3][]; //2차원 배열 크기값은 반드시 지정
		//방법1 : new int[2] - new 사용해서 1차원 배열 생성 선언
		nums[0] = new int[2]; //첫줄에 int타입 데이터 두개가 저장되는 곳 만들어짐
		nums[0][0] = 10;
		nums[0][1] = 20;
		
		//방법2 : new int[] {30, 40} - new 사용 1차원배열과 데이터 동시 입력
		nums[1] = new int[] {30, 40}; // 저장위치가 배열이 된다
		
		//방법3 : {30, 40} 중괄호만 사용 -> X
		//nums[3] = {30, 40} -> 불가능
		nums[2] = new int[] {50, 60, 70, 80};
		
		
		
		
		
	}

}
