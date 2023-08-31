package com.mystudy.array4_2dim;

import java.util.Arrays;

public class ArrayExam {

	public static void main(String[] args) {
		/* 문제 : 2차원 배열을 사용하여 
		int[][] num2dim = { {10, 20}, {30, 40}, {50, 60} };
		1. 2차원 배열 num2dim 값을 화면 출력 : 10 20 30 40 50 60
		2. num2dim의 세번째 값인 30을 100으로 변경하고 화면출력 
		3. num2dim의 크기만큼 num2Copy 배열을 선언하고
		   num2dim ----> num2Copy 데이터 복사 후 
		   num2Copy 데이터 화면 출력
		*** 데이터 복사 형태도 확인 : 얕은복사(주소값 복사), 깊은복사(물리적 복제)
		 */
		
		int[][] num2dim = { {10, 20}, {30, 40}, {50, 60} };
		// 1. 2차원 배열 num2dim 값을 화면 출력 : 10 20 30 40 50 60
		System.out.println(Arrays.toString(num2dim)); //배열의 주소값
		System.out.println(Arrays.deepToString(num2dim)); //배열데이터
		
		System.out.println("--- 1. 2차원 배열 출력 ---");
		for (int i = 0; i < num2dim.length; i++) {
			System.out.println(Arrays.toString(num2dim[i]));
		}
		System.out.println("----");
		
		System.out.println("--- 이중 for문 사용 데이터 출력 ----");
		printData("num2dim", num2dim);
		
		System.out.println("=== 2. 세번째 30 --> 100 출력");
		// 2. num2dim의 세번째 값인 30을 100으로 변경하고 화면출력 
		System.out.println("num2dim[1][0] = " + num2dim[1][0]);
		num2dim[1][0] = 100;
		System.out.println(">>> num2dim[1][0] = 100 실행 후");
		printData("num2dim", num2dim);
		
		System.out.println("=== 2차원 배열 복사 ========");
//			3. num2dim의 크기만큼 num2Copy 배열을 선언하고
//			num2dim ----> num2Copy 데이터 복사 후 
//		  	num2Copy 데이터 화면 출력
		int[][] num2Copy = new int[num2dim.length][]; // [null, null, null]
//		num2Copy[0] = new int[num2dim[0].length];
//		num2Copy[1] = new int[num2dim[1].length];
//		num2Copy[2] = new int[num2dim[2].length];
		
		//printData("num2Copy", num2Copy);

		for (int i = 0; i < num2dim.length; i++) {
			num2Copy[i] = new int[num2dim[i].length];
		}
		System.out.println("num2Copy : " + Arrays.toString(num2Copy));
		//num2Copy 데이터들의 주소값
		printData(num2Copy); // 저장된 데이터 0 0 0 0 0 0
		
		System.out.println("---- 데이터 직접 복사 ----");
		for (int i = 0; i < num2dim.length; i++) {
			for (int j = 0; j < num2dim[i].length; j++) {
				num2Copy[i][j] = num2dim[i][j];
			}
		}
		
		// num2Copy = num2dim; // 주소값 복사
		// 넣으면 같이 999로 바뀜. 주석처리하면 num2dim은 999로 안 바뀜.
		printData("num2dim", num2dim); // num2dim : 10 20 100 40 50 60
		printData("num2Copy", num2Copy); // num2Copy : 10 20 100 40 50 60 
		num2Copy[0][0] = 999;
		System.out.println(":: num2Copy[0][0] = 999; 변경 후");
		printData("num2Copy", num2Copy); // num2Copy : 999 20 100 40 50 60 
		printData("num2dim", num2dim); // num2dim : 10 20 100 40 50 60 
		System.out.println("----------");
		System.out.println("num2dim == num2Copy : " 
					+ (num2dim == num2Copy));
		//false, 분리되어있다
		System.out.println("num2dim[0] == num2Copy[0] : "
					+ (num2dim[0] == num2Copy[0]));
		System.out.println("num2dim[1] == num2Copy[1] : "
					+ (num2dim[1] == num2Copy[1]));
		System.out.println("num2dim[2] == num2Copy[2] : " 
					+ (num2dim[2] == num2Copy[2]));
		
		
	}
	static void printData(int[][] num2dim) {
		for (int i = 0; i <num2dim.length; i++) {
			for (int j = 0; j < num2dim[i].length; j++) {
				System.out.print(num2dim[i][j] + " ");
			}
		}
		System.out.println();
	}
	
	static void printData(String name, int[][] num2dim) {
		System.out.print(name + " : ");
		for (int i = 0; i <num2dim.length; i++) {
			for (int j = 0; j < num2dim[i].length; j++) {
				System.out.print(num2dim[i][j] + " ");
			}
		}
		System.out.println();
	}

	
}
