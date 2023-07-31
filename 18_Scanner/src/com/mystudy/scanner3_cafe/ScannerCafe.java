package com.mystudy.scanner3_cafe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerCafe {
	private Scanner scan = new Scanner(System.in);
	static final int AMERICANO = 3000;
	static final int CAFE_LATTE = 3500;
	static final int CAFE_MOCA = 3500;
	static final int JUICE = 3500;
	int income = 0; //총 매출액
	
	public void openCafe() {
		while (true) {
			showMenu();
//			System.out.println("1.아메리카노 2.카페라떼 3.카페모카 4.과일주스 0.종료");
//			//입력
//			System.out.print("> 메뉴선택(1~4) : ");
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
			int totMoney = computeMoney(select, count); //판매액 = 메뉴단가 * 수량
			

			//잔액 계산
			int change = inMoney - totMoney;
			income =+ totMoney; //총매출액 구하기

			//계산결과 출력
			displayResult(inMoney, totMoney, change);
		}
	}

	private void displayResult(int inMoney, int totMoney, int change) {
		System.out.println("=============");
		System.out.println("입금액 : " + inMoney);
		System.out.println("판매액 : " + totMoney);
		System.out.println("잔액(거스름돈) : " + change);
		System.out.println();

	}

	private int computeMoney(int select, int count) { // 여기저기서 쓰면 필드에 저장하고 씀
		int result = 0;
		switch (select) {
		case 1 : result = AMERICANO * count; break;
		case 2 : result = CAFE_LATTE * count; break;
		case 3 : result = CAFE_MOCA * count; break;
		case 4 : result = JUICE * count; break;
		}
		return result;
		
	
	}

	private void showMenu() {
		System.out.println("1.아메리카노 2.카페라떼 3.카페모카 4.과일주스 0.종료");
		System.out.print("> 메뉴선택(1~4) : ");
		
	}
	
	
	
	
	
	//내 풀이
//	private int num;
//	private int cnt;
//	private int in;
//	private int price;
//	private int out;
//	
//	
//	public ScannerCafe() {}
//	
//	public void start() {
//		Scanner scan = new Scanner(System.in);
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(3000);
//		list.add(3500);
//		list.add(4000);
//		list.add(5000);
//		
//		while (true) {
//			input(scan); // 입력 
//			process(num, list); // 처리
//			output();//결과 출력
//			
//			if ((num + 1) == 0) {
//				System.out.println(">> 주문종료");
//				break;
//			}
//		}
//		
//	}
//
//	/* 입력(input)
//	> 메뉴를 선택하세요(1~4) : (번호입력)
//	> 주문수량 : (갯수입력)
//	> 입금액 : 10000
//	*/
//	private void input(Scanner scan) {
//		System.out.println("메뉴를 선택하세요 : ");
//		num = scan.nextInt() - 1;
//		if ((num + 1) == 0) {
//			System.out.println(">> 주문종료");
//		}
//		
//		System.out.println("주문수량 : ");
//		int cnt = scan.nextInt();
//		
//		System.out.println("입금액 : ");
//		int in = scan.nextInt();
//	}
//	
//	//처리
//	private void process(int num, ArrayList<Integer> list) {
//		if (num == list.get(num)) {
//			list.get(num);
//		}
//		int price = cnt * list.get(num);
//		int out = in - price;
//	}
//	
//	//결과
//	private void output() {
//		System.out.println("==== 결과 ====");
//		System.out.println("입금액 : " + in);
//		System.out.println("판매액 : " + price);
//		System.out.println("잔액 : " + out);
//		System.out.println("============");
//	}
//	
}
