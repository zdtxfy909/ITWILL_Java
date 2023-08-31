package com.mystudy.array;

import java.util.Arrays;

public class Ex05_array_lotto {

	public static void main(String[] args) {
		// 로또 번호 생성기
		// 1. int 타입의 숫자 45개를 저장할 수 있는 배열을 선언하자(balls)
		// 2. 초기화 : 1~45까지의 숫자(번호)를 넣기
		// 3. 충분히 많이 섞고 
		//   3-1. 0~44 랜덤한 숫자를 만든다(Math.random() 사용)
		//   3-2. 첫번째 데이터와 랜덤숫자 인덱스 번호와 교환
		//   3-3. 위의 3-1, 3-2 작업을 계속 반복(충분히 많이)
		// 4. 6개 번호 추출(앞에서 부터 6개 사용)
		//-----------------------------------
		
		//랜덤한 값(숫자) 만들기 - Math.random(); : 0 <= double < 1
		// (int)(Math.random() * 45) : 0~44까지의 랜덤한 값을 생성한다
		
		// 1. int 타입의 숫자 45개를 저장할 수 있는 배열을 선언하자(balls)
		int[] balls = new int[45];
		// System.out.println(Arrays.toString(balls)); 
		// 저장된 데이터 확인. 초기값
		
		// 2. 초기화 : 1~45까지의 숫자(번호)를 넣기
		System.out.println("--- 설정된 초기값 확인 ---");
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}
		System.out.println(Arrays.toString(balls)); //저장된 데이터 확인
		
		// 3-1. 0~44 랜덤한 숫자를 만든다 - Math.random() 사용
		System.out.println("--- 랜덤한 숫자 ---");
		int random = (int)(Math.random() * 45); //난수(랜덤값 생성)
		// random = 5;
		System.out.println("랜덤값(0~44) : " + random);
		
		// balls[0] <-> balls[random]
		int temp;
		
//		//1번째 교환
//		random = (int)(Math.random() * 45);
//		System.out.println("랜덤값(0~44) : " + random);
//		temp = balls[0];
//		balls[0] = balls[random];
//		balls[random] = temp;
//		System.out.println(Arrays.toString(balls));
//		
//		//2번째 교환
//		System.out.println("> 변경 후");
//		random = (int)(Math.random() * 45);
//		System.out.println("랜덤값(0~44) : " + random);
//		temp = balls[0];
//		balls[0] = balls[random];
//		balls[random] = temp;
//		
//		for (int i = 0; i < balls.length; i++) {
//			System.out.print(balls[i] + " ");
//		}
		
		// => 이 패턴을 계속 반복하면 됨.
		System.out.println("--- 반복문으로 교환 처리 ---");
		for (int i = 0; i < 10_000_000; i++) {	// 천단위 구분자 언더바
			// 생성
			random = (int)(Math.random() * 45);
			// System.out.println("랜덤값(0~44) 인덱스 : " + random);
			// 교환
			temp = balls[0];					
			balls[0] = balls[random];
			balls[random] = temp;
			//System.out.println(Arrays.toString(balls));
		}
		System.out.println(">> 변경 후 ------");
		System.out.println(Arrays.toString(balls));
		
		// 4. 6개 번호 추출(앞에서 부터 6개 사용)
		System.out.println("=== 당첨번호 표시 ===");
		for (int i = 0; i < 6; i++) {
			System.out.print(balls[i] + " ");
		}
		System.out.println();
		
		//====================
		System.out.println("---- 당첨번호 별도 저장하기 ----");
		int[] lottoNums = new int[6];
		for (int i = 0; i < 6; i++) {
			lottoNums[i] = balls[i];
		} //데이터 복제한 것임
		System.out.println("balls : " + Arrays.toString(balls)); 
		System.out.println("lottoNums : " + Arrays.toString(lottoNums)); 

		System.out.println("==== Arrays.sort() 정렬 ======");
		//로또번호 오름차순 정렬
		Arrays.sort(lottoNums);
		System.out.println("lottoNums : " + Arrays.toString(lottoNums)); 
		
		
	}

}
