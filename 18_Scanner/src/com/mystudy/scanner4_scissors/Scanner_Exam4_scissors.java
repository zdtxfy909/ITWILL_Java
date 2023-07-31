package com.mystudy.scanner4_scissors;

import java.util.Scanner;

public class Scanner_Exam4_scissors {

	public static void main(String[] args) {
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
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("::: 가위,바위,보 게임 시작 ~~~");
		//0. 컴퓨터가 가위(1),바위(2),보(3) 선택(Math.random())
		int comSelect = (int)(Math.random() * 3 + 1);
		
		//comSelect = 2; //테스트용 고정값
		
		String strComputer = "선택없음";
		strComputer = changeNumberToString(comSelect); 
		//숫자값 전달, 문자값 리턴
		
		System.out.println("strComputer : " + strComputer);
		System.out.println("comSelect : " + comSelect);
		System.out.println("컴퓨터는 가위,바위,보 중에 하나를 선택했습니다.");
		
		//1. 1.가위   2.바위   3.보   0.종료   선택 메뉴 출력 
		System.out.println("1.가위   2.바위   3.보   0.종료");
		System.out.print("선택(1~3) > ");
		//2. 선택값 입력
		int select = scan.nextInt();

		if (select == 0) {
				System.out.println("게임중단~~~");
				//return 0;
			}
		
		String strPerson = "선택없음";
		switch (select) {
		case 1 : strPerson = "가위"; break;
		case 2 : strPerson = "바위"; break;
		case 3 : strPerson = "보"; break;
		}
		//System.out.println("당신의 선택값 : " + select);
		//System.out.println("strPerson : " + strPerson);
		
		//3. 결과 비교 후 승자, 패자 결정 ---> 숫자
//		if (comSelect == 1) { //가위 선택
//			if (select == 1) { //com : 가위 선택
//				System.out.println("비겼다");
//			}
//			if (select == 2) { //com : 바위 선택
//				System.out.println("person_win");
//			}
//			if (select == 3) { //com : 보 선택
//				System.out.println("computer_win");
//			}
//		}
		
		//3. 결과 비교 후 승자, 패자 결정 ---> 사람이 읽기 편한 코드
		// "비겼다" 중복 코드 삭제 ---> 밖으로 빼내기
		String result = "판정안됨";
		if (strComputer.equals(strPerson)) {
			result = "비겼다";
		}
		
		if (strComputer.equals("가위")) {
			if (strPerson.equals("바위")) {
				result = "사람 승";
			}
			if (strPerson.equals("보")) {
				result = "컴퓨터 승";
			}
		}
		if (strComputer.equals("바위")) {
			if (strPerson.equals("가위")) {
				result = "컴퓨터 승";
			}
			if (strPerson.equals("보")) {
				result = "사람 승";
			}
		}
		if (strComputer.equals("보")) {
			if (strPerson.equals("가위")) {
				result = "사람 승";
			}
			if (strPerson.equals("바위")) {
				result = "컴퓨터 승";
			}
		}
		
		//승/패 결과출력
		System.out.println("결과 : " + result + " >> com : " + strComputer);
		//return select;
		
		
		
		//내 풀이
//		Scanner scan = new Scanner(System.in);
//		
//		while (true) {
//			int random = (int)(Math.random() * 3) + 1;
//			//System.out.println(random);
//
//			System.out.println("1.가위   2.바위   3.보   0.종료");
//			System.out.print("선택값 입력 : ");
//			int select = scan.nextInt();
//			System.out.println(select);
//
//			if (select == 0) {
//				System.out.println(">> 게임을 종료합니다.");
//				break;
//			}
//			
//			if (random == select) {
//				System.out.println(">> draw");
//			} else if (random == 1 && select == 3) {
//				System.out.println(">> computer_win");
//			} else if (random == 2 && select == 1) {
//				System.out.println(">> computer_win");
//			} else if (random == 3 && select == 2) {
//				System.out.println(">> computer_win");
//			} else if (random == 1 && select == 2) {
//				System.out.println(">> person_win");
//			} else if (random == 2 && select == 3) {
//				System.out.println(">> person_win");
//			} else if (random == 3 && select == 1) {
//				System.out.println(">> person_win");
//			}
//			
//			System.out.println("====================");
//		}

//		method();
//	}
//	
//	void method() {//리턴값 없음 > static 아니니까 
//		System.out.println(">> 실행 ~~~");
	}

	private static String changeNumberToString(int comSelect) {
		String str = "변환안됨";
		switch (comSelect) {
		case 1 : str = "가위"; break;
		case 2 : str = "바위"; break;
		case 3 : str = "보"; break;
		}
		return str;
	}
	
}

