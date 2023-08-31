package com.mystudy.array3_Copy;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// 배열 복사
		int[] num1 = new int[5];
		int[] num2 = new int[5];
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		// 참조형데이터 비교 : == (주소값 비교, 동일객체 여부 비교)
		System.out.println("num1 == num2 : " + (num1 == num2)); 

		num1[0] = 1;
		num1[1] = 2;
		num1[2] = 3;
		num1[3] = 4;
		num1[4] = 5;
		
		System.out.println("=== 배열 복사(주소값 복사, 얕은 복사) ===");
		num2 = num1; //주소값 복사
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2); // 주소값 같다
		
		
		printData("num1", num1);	// num1: 1 2 3 4 5 
		printData("num2", num2);	// num2: 1 2 3 4 5 
		
		System.out.println("=== 배열값 복사 - 물리적 복사, 깊은 복사(deep copy) ===");
		int[] num3 = new int[num1.length]; // num1 배열과 같은 크기로 복사
		printData("num3",num3);	// num3: 0 0 0 0 0 
		
		//num3 <---- num1 배열 값 복사
		for (int i = 0; i < num3.length; i++) {
			num3[i] = num1[i];
		}
		printData("num1", num1);		// num1: 1 2 3 4 5 
		printData("num3", num3);		// num3: 1 2 3 4 5 
		System.out.println("num1 == num3 : " + (num1 == num3)); 
		//false, 데이터만 복사한 것임
		
		num1[0] = 888;
		System.out.println(">>> num1[0] = 888 변경 후");
		printData("num1", num1);	 // num1: 888 2 3 4 5 
		printData("num3", num3);	 // num3: 1 2 3 4 5  
		System.out.println("==================");

		System.out.println("=======");
		int[] num4 = new int[num1.length];	// 크기만 복사한다
		printData("num1", num1);	// num1: 888 2 3 4 5
		printData("num4", num4);	// num4: 0 0 0 0 0 
		
		System.arraycopy(num1, 0, num4, 0, num1.length);
		// 원본, 시작인덱스, 복사본, 시작인덱스, 개수
		System.out.println(">> System.arraycopy() 복사 후");
		printData("num1", num1);	// num1: 888 2 3 4 5 
		printData("num4", num4);	// num4: 888 2 3 4 5 
		System.out.println("num1 == num4 : " + (num1 == num4)); 
		//false, 데이터만 복사
		
		System.out.println("=== 배열객체.clone() 복사 ====");
		int[] num5 = num4.clone();
		printData("num4", num4);	// num4: 888 2 3 4 5 
		printData("num5", num5);	// num5: 888 2 3 4 5 
		System.out.println("num4 == num5 : " + (num4 == num5)); //false
		
		System.out.println("=== Array.copyOf() 사용 복사 ====");
		Arrays.copyOf(num4, num4.length);
		//Array.copyOf(원본데이터, 복사할 개수)
		int[] num6 = Arrays.copyOf(num4, num1.length);
		printData("num4", num4);	
		printData("num6", num6);
		System.out.println("num4 == num6 : " + (num4 == num6));
		
		System.out.println("=== Arrays.copyOfRange(원본, from, to); : from부터 to 이전까지 ");
		//Arrays.copyOfRange(원본, from, to); : from부터 to 이전까지
		num6 = Arrays.copyOfRange(num4, 0, 3);
		printData("num4", num4);	
		printData("num6", num6);
		System.out.println("num4 == num6 : " + (num4 == num6));
		num6 = Arrays.copyOfRange(num4, 1, 4); //4-1개
		printData("num4", num4);	
		printData("num6", num6);
		System.out.println("num4 == num6 : " + (num4 == num6));
	}
	
	static void printData(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
	
	//메소드 오버로딩(method overloading) 
	//하나의 클래스 내에서 동일한 메소드명으로 정의 가능
	//호출명은 같아도 전달해주는 변수 개수와 종류에 따라 구분이 되어 호출 가능하다
	static void printData(String name, int[] num) { //전달 받는 값 name, num
		System.out.print(name + ": ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
	
}
