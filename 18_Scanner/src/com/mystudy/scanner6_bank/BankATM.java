package com.mystudy.scanner6_bank;

import java.util.InputMismatchException;
import java.util.Scanner;

// 은행의 ATM기
// 1.입금 2.출금 3.통장확인 0.종료
public class BankATM {
	private int money; //통장계좌 금액
	private Scanner scan = new Scanner(System.in);
	
	public void startBank() {
		System.out.println(">>어서오세요(ATM기 사용)");
		while (true) {
			int select = runningATM();
			if (select == 0) {
				break;
			}
		}
		System.out.println(">>ATM기 사용을 종료합니다");
	}
	
	private int runningATM() {
		//1. 메뉴표시
		showMenu();
		
		//2. 메뉴선택
		int select = -1; 
		//중괄호 내에서만 사용되니까 바깥으로 뺀다. 로컬변수는 초기화 안 하고 사용할 수 없다.
		
		try {
			select = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("[예외발생] 잘못된 값이 입력되었습니다. "
							+ "메뉴(0~3) 숫자만 입력하세요.");
		} finally {
			scan.nextLine();
		}
		
		if (select == 0) { 
			System.out.println("종료~~~");
			return select;
			//0이면 뒤에 비교 처리 안해도 되니까 위로 올려놓고 return select;
		}
		
		//3. 선택작업 처리
		if (select == 1) {
			inputMoney();
		}
		
		if (select == 2) {
			outputMoney();
		}
		
		if (select == 3) {
			showMoney();
		}
		
		return select;
	}

	private void outputMoney() {
		System.out.print(">출금액 : ");
		money -= Integer.parseInt(scan.nextLine());
	}

	private void showMoney() {
		System.out.println(":: 통장잔액 : " + money);
	}

	private void inputMoney() {
		while (true) {
			try {
				System.out.print(">입금액 : ");
				money += Integer.parseInt(scan.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("[예외발생] 잘못된 값이 입력되었습니다. "
						+ "숫자만 입력하세요.");
			}
		}
	}

	private void showMenu() {
		System.out.println("---------------------------------");
		System.out.println("1.입금 	2.출금	 3.통장확인	0.종료");
		System.out.println("---------------------------------");
		System.out.print("> 작업선택 : ");
	}

}	

/*
---------------------------------
1.입금 	2.출금	 3.통장확인	0.종료
---------------------------------
>작업선택 : 1
>입금액 : 10000

---------------------------------
1.입금 	2.출금	 3.통장확인	0.종료
---------------------------------
>작업선택 : 3
::통장금액 : 10000 

---------------------------------
1.입금 	2.출금	 3.통장확인	0.종료
---------------------------------
>작업선택 : 2
>출금액 : 5000

---------------------------------
1.입금 	2.출금	 3.통장확인	0.종료
---------------------------------
>작업선택 : 3
::통장금액 : 5000

---------------------------------
1.입금 	2.출금	 3.통장확인	0.종료
---------------------------------
>작업선택 : 0
>> ATM 사용을 종료합니다.

*/