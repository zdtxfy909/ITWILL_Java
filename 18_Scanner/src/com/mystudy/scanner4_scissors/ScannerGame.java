package com.mystudy.scanner4_scissors;

import java.util.Scanner;

/* Scanner를 이용한 가위, 바위 , 보 게임 *******
// scissors, rock, paper
// draw : 무승부, person_win, computer_win
컴퓨터와 함께하는 가위,바위,보 게임
0. 컴퓨터가 가위(1),바위(2),보(3) 선택(Math.random())
1. 1.가위   2.바위   3.보   0.종료   선택 메뉴 출력 
2. 선택값 입력
3. 결과 비교 후 승자, 패자 결정
(반복) 게임 반복 진행 - 0 선택시 종료 처리
=============================== */
public class ScannerGame {
	private Scanner scan = new Scanner(System.in);
	private static final String PAPER = "보자기";
	//외부에서 접근할 수 없고 여기서만 문자열 수정할 수 있음
	private static final String MENU = "1.가위   2.바위   3.보   0.종료";
	private static final String COMPUTERWIN = "컴퓨터 승"; 
	// 메소드 반복할 때마다 변수 만들 필요 없으니까 필드로 빼준다
	
	public void gameStart() {
		System.out.println("::: 가위,바위,보 게임 시작~~~");
		while (true) {
			boolean isContinue  = isContinueGame();
			if (! isContinue) break;
		}
		System.out.println("::: 가위,바위,보 게임 끝~~~");
	}	
	
	private boolean isContinueGame() {
		boolean isContinue = true; //게임 계속
		
		//0. 컴퓨터가 가위(1),바위(2),보(3) 선택(Math.random())
		int comSelect = (int)(Math.random() * 3 + 1);
		System.out.println("컴퓨터는 가위,바위,보 중에 하나를 선택했습니다");
		
		//1. 1.가위   2.바위   3.보   0.종료   선택 메뉴 출력
		System.out.println("1.가위   2.바위   3." + PAPER +"   0.종료");
		System.out.print("선택(1~3)> ");
		
		//2. 사람이 선택
		int select = selectPerson();
		
		if (select == 0) {
			return false;
		}
		
		//3. 선택숫자 ---> 가위, 바위, 보 문자열로 변경
		String strComputer = changeNumberToString(comSelect);
		String strPerson = changeNumberToString(select);
		//문자열로 바꾸는 기능
		
		//4. 결과 비교 후 승자, 패자 결정
		String result = getWinnerMessage(strComputer, strPerson);
		
		//5. 승패 결과 출력
		System.out.println(">>> " + result + " - 컴퓨터: " + strComputer);
		System.out.println();
		
		return isContinue;
	}
	
	private int selectPerson() {
		int select = -1; //초기값으로 사용 안되는 값 넣어줌
		while (true) {
			try {
				System.out.println(">> 당신의 선택은(1~3)? ");
				select = Integer.parseInt(scan.nextLine());
				//그냥 scan.nextLine()만 하면 뒤에 문제 발생하니까 Integer.parseInt 처리
				if (select >= 0 && select <= 3) {
					break;
				} else {
					System.out.println("::: 잘못된 선택 0~3 중에 선택하세요!");
				}
				break;
			} catch (Exception e) {
				System.out.println("::: 잘못된 엽럭, 숫자 0~3 입력하세요");
			}
		}
		return select;
	}

	private String getWinnerMessage(String strComputer, String strPerson) {
		String result = "판정안됨";
		
		if (strComputer.equals(strPerson)) {
			result = "비겼다";
		}
		
		if (strComputer.equals("가위")) {
			if (strPerson.equals("바위")) {
				result = "사람 승";
			}
			if (strPerson.equals(PAPER)) {
				result = COMPUTERWIN;
			}
		}
		
		if (strComputer.equals("바위")) {
			if (strPerson.equals("가위")) {
				result = COMPUTERWIN;
			}
			if (strPerson.equals(PAPER)) {
				result = "사람 승";
			}
		}
		
		if (strComputer.equals(PAPER)) {
			if (strPerson.equals("가위")) {
				result = "사람 승";
			}
			if (strPerson.equals("바위")) {
				result = COMPUTERWIN;
			}
		}
		return result;
	}


	private String changeNumberToString(int select) {
		String str = "변환안됨";
		switch (select) {
			case 1 : str = "가위"; break;
			case 2 : str = "바위"; break;
			case 3 : str = PAPER; break;
		}
		return str;
	}
	


}
