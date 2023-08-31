package com.mystudy.array2_sort;

public class ArraySortSelection {

	public static void main(String[] args) {
		// 배열의 숫자 데이터를 정렬한다 (Sort) - 오름차순(ASC), 내림차순(DESC)
		int[] num = {30, 20, 50, 40, 10};
		System.out.println("num : " + num); //num의 주소값
		
		// num 배열의 데이터 확인
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
//		System.out.println();
		
		//데이터 확인
		System.out.print("원본데이터 : ");
		printData(num); //간단하게 사용할 수 있음 위에 주석처리한 부분을
		
//		System.out.println("=== 정렬시작 ===");
//		// 첫번째값(기준인덱스 0) vs 두번째값(인덱스 1)
//		if (num[0] > num[1]) {	// 30 vs 20
//			int temp = num[0];
//			num[0] = num[1];
//			num[1] = temp;
//		}
//		printData(num);	// 20 30 50 40 10 으로 변경
//		
//		// 첫번째값(기준인덱스 0) vs 세번째값(인덱스 2)
//		if (num[0] > num[2]) {	// 20 vs 50
//			int temp = num[0];
//			num[0] = num[2];
//			num[2] = temp;
//		}
//		printData(num); // 변경없음
//		
//		// 첫번째값(기준인덱스 0) vs 네번째값(인덱스 3)
//		if (num[0] > num[3]) {	// 20 vs 40
//			int temp = num[0];
//			num[0] = num[3];
//			num[3] = temp;
//		}
//		printData(num);
//		
//		// 첫번째값(기준인덱스 0) vs 다섯번째값(인덱스 4)
//		if (num[0] > num[4]) {	// 20 vs 10
//			int temp = num[0];
//			num[0] = num[4];
//			num[4] = temp;
//		}
//		printData(num); // 10 30 50 40 20으로 변경
		
//		System.out.println("=== 반복문으로 변경 적용 ====");
//		System.out.print("원본데이터 : ");
//		printData(num);
//		//첫번째 값 기준 비교작업(인덱스 0 기준)
//		System.out.println("--- 기준인덱스 0인 경우 ----");
//		for (int i = 1; i < num.length; i++) {
//			if (num[0] > num[i]) {
//				int temp = num[0];
//				num[0] = num[i];
//				num[i] = temp;
//			}
//			printData(num);
//		}
//		System.out.println("--- 기준인덱스 1인 경우 ----");
//		System.out.print("배열데이터 : ");
//		printData(num);
//		//두번째 값 기준 비교작업(인덱스 1 기준)
//		for (int i = 2; i < num.length; i++) {
//			if (num[1] > num[i]) {
//				int temp = num[1];
//				num[1] = num[i];
//				num[i] = temp;
//			}
//			printData(num);
//		}
//		
//		System.out.println("--- 기준인덱스 2인 경우 ----");
//		System.out.print("배열데이터 : ");
//		printData(num);
//		//세번째 값 기준 비교작업(인덱스 2 기준)
//		for (int i = 3; i < num.length; i++) {
//			if (num[2] > num[i]) {
//				int temp = num[2];
//				num[2] = num[i];
//				num[i] = temp;
//			}
//			printData(num);
//		}
//		
//		System.out.println("--- 기준인덱스 3인 경우 ----");
//		System.out.print("배열데이터 : ");
//		printData(num);
//		//네번째 값 기준 비교작업(인덱스 3 기준)
//		for (int i = 4; i < num.length; i++) {
//			if (num[3] > num[i]) {
//				int temp = num[3];
//				num[3] = num[i];
//				num[i] = temp;
//			}
//			printData(num);
//		}
//		
		System.out.println("===== 이중(중첩) for문으로 작성 ====");
		
		int lastIdx = num.length - 1; 
		for (int gijun = 0; gijun < lastIdx; gijun++) {
			//System.out.print("배열데이터(num) : ");
			//printData(num);
		
		//기준인덱스 : 0번부터 마지막이전까지(마지막포함안함)
			for (int i = gijun + 1; i < num.length; i++) {
				if (num[gijun] > num[i]) { //비교 후 교환
					int temp = num[gijun];
					num[gijun] = num[i];
					num[i] = temp;
				}
				//printData(num);
			}
		}
		
		System.out.print("정렬 후 배열데이터(num) : ");
		printData(num);
	}

	// 메인메소드에서 메소드명 호출해서 사용하기 위해 만드는 거임
	static void printData(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
}
