package com.mystudy.scanner3_cafe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Scanner_Exam_Cafe {

	public static void main(String[] args) {
		//(실습) 카페 음료 주문 처리
		//음료의 종류 : 
		//1.아메리카노(3000)  2.카페라떼(3500)  3.카페모카(4000)  4.과일주스(5000)
		//-------------------------------------
		// 입력값 : 메뉴번호, 주문수량, 입금액(고객이 낸 돈)
		// 출력값 : 입금액, 판매액(단가 * 수량), 잔돈(입금액 - 판매액)
		//----------------------------------------
		/*
		while (true) { //메뉴 0번 선택시 종료
		> 메뉴를 띄운다
		1.아메리카노(3000)  2.카페라떼(3500)  3.카페모카(4000)  4.과일주스(5000) 0.종료
		> 메뉴를 선택하세요(1~4) : (번호입력)
		> 주문수량 : (갯수입력)
		> 입금액 : 10000
		====== 결과 =======
		입금액 : 10000 원
		판매액 : 단가*수량
		잔액 : 입금액 - 판매액
		}
		====================*/
		
		Scanner scan = new Scanner(System.in);
		final int AMERICANO = 3000; //상수화된 변수값. 중간에 값 수정 못함
		//가격이 바껴도 여기서만 바꾸면 다 적용됨
		final int CAFE_LATTE = 3500;
		final int CAFE_MOCA = 3500;
		final int JUICE = 3500;
		int income = 0; 
		
		while (true) {
			System.out.println("1.아메리카노 2.카페라떼 3.카페모카 4.과일주스 0.종료");
			//입력
			System.out.print("> 메뉴선택(1~4) : ");
			int select = scan.nextInt();
			//System.out.println("select : " + select);
			
			if (select == 0) {
				System.out.println(">>>> 영업종료합니다.");
				System.out.println("오늘 매출 총액 : " + income + "원 입니다.");
				break;
			}
			
			System.out.print("> 수량입력 : ");
			int count = scan.nextInt();
			//System.out.println("count : " + count);

			System.out.print("> 입금액 : ");
			int inMoney = scan.nextInt();
			//System.out.println("입금액 : " + inMoney);

			//계산처리
			int totMoney = 0; //판매액 = 메뉴단가 * 수량
			/*if (select == 1) {
			totMoney = AMERICANO * count;
		} else if (select == 2) {
			totMoney = CAFE_LATTE * count;
		} else if (select == 3) {
			totMoney = CAFE_MOCA * count;
		} else if (select == 4) {
			totMoney = CAFE_LATTE * count;
		}
			 */
			switch (select) {
			case 1 : totMoney = AMERICANO * count; break;
			case 2 : totMoney = CAFE_LATTE * count; break;
			case 3 : totMoney = CAFE_MOCA * count; break;
			case 4 : totMoney = JUICE * count; break;
			}
			//System.out.println("판매액 : " + totMoney);

			//잔액 계산
			int change = inMoney - totMoney;
			income =+ totMoney; //총매출액 구하기

			//계산결과 출력
			System.out.println("=============");
			System.out.println("입금액 : " + inMoney);
			System.out.println("판매액 : " + totMoney);
			System.out.println("잔액(거스름돈) : " + change);
			System.out.println();
		}
	}
}


		
		
		//내 풀이
//		while (true) {
//			
//		System.out.println("1.아메리카노 2.카페라떼 3.카페모카 4.과일주스 0.종료");
//		
//		List<Integer> list = new ArrayList<>();
//		list.add(3000);
//		list.add(3500);
//		list.add(4000);
//		list.add(5000);
//		
//		System.out.print("메뉴를 선택하세요 : ");
//		int num = scan.nextInt() - 1;
//		
//		if ((num + 1) == 0) {
//			System.out.println(">> 주문종료");
//			break;
//		}
//		
//		System.out.print("주문수량 : ");
//		int cnt = scan.nextInt();
//		
//		System.out.print("입금액 : ");
//		int in = scan.nextInt();
//		
//		//처리
//		if (num == list.get(num)) {
//			list.get(num);
//		}
//		int price = cnt * list.get(num);
//		
//		int out = in - price;
//		
//		System.out.println("==== 결과 ====");
//		System.out.println("입금액 : " + in);
//		System.out.println("판매액 : " + price);
//		System.out.println("잔액 : " + out);
//		System.out.println("============");
//		
//		}
		


