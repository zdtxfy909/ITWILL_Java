package com.mystudy.scanner6_bank;

import java.util.Scanner;

// 은행의 ATM기
// 1.입금 2.출금 3.통장확인 0.종료
class BankATM2 {
	private int money; //통장계좌 금액
	Scanner scan = new Scanner(System.in);
	int price;
	int select;

	public boolean startBank() {
		System.out.println(">> ATM기 시작~~~");
		
		while (true) {
			//메뉴선택
			Menu();
			
			//처리
			processATM();

			if (select == 0) {
				System.out.println(">> ATM기 사용을 종료합니다.");
				return false;
			}

			System.out.println(">> ATM기 종료~~~");
		}
	}

	private boolean processATM() {
		if (select == 1) {
			System.out.print("> 입금액 : ");
			price = Integer.parseInt(scan.nextLine());
			money = money + price;
			System.out.println("::통장금액 : " + money);
		}
		if (select == 2) {
			System.out.print("> 출금액 : ");
			price = Integer.parseInt(scan.nextLine());
			money = money - price;
			if (money > 0) {
				System.out.println("::통장금액 : " + money);
			} else {
				System.out.println("비정상처리, 다시 선택하세요.");
			}
		}
		if (select == 3) {
			System.out.println("::통장금액 : " + money);
		}
		return false;
	}

	private void Menu() {
		System.out.println("---------------------------------");
		System.out.println("1.입금 	2.출금	3.통장확인   0.종료");
		System.out.println("---------------------------------");
		
		selectPerson();
		String strSelect = changeNumberToString(select);
		System.out.println(strSelect + "을 선택했습니다.");
	}
	
	private int selectPerson() {
		select = -1; //초기값으로 사용 안되는 값 넣어줌
		while (true) {
			try {
				System.out.print("> 작업선택 : ");
				select = Integer.parseInt(scan.nextLine());
				if (select >= 0 && select <= 3) { 
					break; //정상범위면 멈추고 나간다.
				} else {
					System.out.println("::: 잘못된 선택 0~3 중에 선택하세요!");
				}
				break;
			} catch (Exception e) {
				System.out.println("::: 잘못된 입력, 숫자 0~3 입력하세요");
			}
		}
		return select;
	}

	private String changeNumberToString(int select) {
		String str = "변환안됨";
		switch (select) {
		case 0 : str = "종료"; break;
		case 1 : str = "입금"; break;
		case 2 : str = "출금"; break;
		case 3 : str = "통장확인"; break;
		}
		return str;
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