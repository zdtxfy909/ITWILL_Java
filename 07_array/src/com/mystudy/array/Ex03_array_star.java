package com.mystudy.array;

public class Ex03_array_star {

	public static void main(String[] args) {
		/* 별찍기
		*
		**
		***
		****
		*****
		 "*"이면 String '*'이면 char
		--------------*/
		// char 타입의 데이터를 5개 저장할 수 있는 배열을 만들고 별(*)입력
		
		//char[] ch = {'*','*','*','*','*'};
		char [] ch = {'0', '1', '2', '3', '4'};
		for (int line = 1; line <= 5; line++) {
			for (int i = 0; i < line; i++) {
				System.out.print(ch[i]);
			}
			System.out.println();
		}

		System.out.println("----");	
		//for_star 클래스에서 가져옴. 배열을 사용하지 않은 별찍기
		int cnt = 1;
		for (int line = 1; line <= 5; line++) {
		for(int i =1; i <= cnt; i++) {
			System.out.print("*");
			}
		System.out.println(); 
		cnt++;
		}
		System.out.println("----");
		//{'0', '1', '2', '3', '4'}
		System.out.print(ch[0]);
		System.out.println(); 
		
		System.out.print(ch[0]);
		System.out.print(ch[1]);
		System.out.println(); 
		//[0], [1] 데이터 출력
		
		System.out.print(ch[0]);
		System.out.print(ch[1]);
		System.out.print(ch[2]);
		System.out.println(); 
		//[0], [1], [2] 데이터 출력
		
		System.out.print(ch[0]);
		System.out.print(ch[1]);
		System.out.print(ch[2]);
		System.out.print(ch[3]);
		System.out.println(); 
		//[0], [1], [2], [3] 데이터 출력
		
		System.out.println("========="); 
		//첫번째줄
		for (int i = 0; i <= 0; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		//두번째줄
		for (int i = 0; i <= 1; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		//세번째줄
		for (int i = 0; i <= 2; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		//네번째줄
		for (int i = 0; i <= 3; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		System.out.println("==== 이중(중첩) 반복문 처리 ====="); 
		
		for (int m = 1; m <= 5; m++) { //실행횟수, 5번반복
			for (int i = 0; i < m; i++) {
				System.out.print(ch[i]);
			}
			System.out.println();
		}
	}

}
