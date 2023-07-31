package com.mystudy.scanner5_gesss;

import java.net.ConnectException;
import java.util.Scanner;

/* 숫자 추측 게임
컴퓨터가 1~100 사이의 숫자를 정하면 사람이 맞추는 게임
선택 기회 5회
---------------------
Math.random() : 0 <= random값 < 1 범위의 실수값 
컴숫자 : 70 인 경우 
  사람이 선택한 숫자(80)가 크면 : 생각한 숫자보다 작다는 메시지 출력
  사람이 선택한 숫자(50)가 작으면 : 생각한 숫자보다 크다는 메시지 출력
5번 이내에 맞추면 : 성공!!! n번 만에 맞췄습니다.(화면출력)
5번을 넘기면 : 실패~~ 내가 생각한 숫자는 70입니다.(화면출력)
-----
다시 도전하시겠습니까?(y,n) 
---------------------------
*/
public class GuessNumberGame {

	Scanner scan = new Scanner(System.in);
	final int chance = 3;
	int cnt = 1;
	String yes = "Y";
	String no = "N";

	public void startGame() {

		int comNumber = (int)(Math.random() * 100 + 1);
System.out.println(comNumber);
		while (chance >= cnt) {
			System.out.print("숫자를 입력하세요 : ");
			int select = scan.nextInt();
			System.out.println("입력 숫자 : " + select);
			
			compareNumber(comNumber, select);
			
			
			if (chance == cnt) {
				System.out.println("실패! 내가 생각한 숫자는 " + comNumber + "입니다.");
				System.out.println("-----");
				System.out.print("다시 도전하시겠습니까? (" + yes + "/" + no +") : ");
				scan.nextLine();
				String replay = scan.nextLine();
				if (replay.equalsIgnoreCase(yes)) {
					startGame();
				} else if (replay.equalsIgnoreCase(no)) {
					System.out.println(">> 게임 종료");
				}
				break;
			}
			cnt++;
		}
		
		
//		int comNumber = (int)(Math.random() * 100 + 1);
//		for (int i = 1; i <= chance; i++) {
//			System.out.print("숫자를 입력하세요 : ");
//			int select = scan.nextInt();
//			scan.nextLine();
//			System.out.println("입력 숫자 : " + select);
//			
//			//비교 처리
//			if (comNumber < select) {
//				System.out.println("입력한 숫자보다 작습니다.");
//			}
//			if (comNumber > select) {
//				System.out.println("입력한 숫자보다 큽니다.");
//			}
//			if (comNumber == select) {
//				System.out.println("성공!!! " + i + "번 만에 맞췄습니다.");
//				break;
//			}
//			if (i == chance) {
//				System.out.println("실패~~ 내가 생각한 숫자는 " + comNumber + "입니다.");
//				System.out.println("-----");
//				System.out.print("다시 도전하시겠습니까? (" + yes + "/" + no +") : ");
//				String replay = scan.nextLine();
//				if (replay.equalsIgnoreCase(yes)) {
//					startGame();
//				} else if (replay.equalsIgnoreCase(no)) {
//					System.out.println(">> 게임 종료");
//				}
//				
//			}
//		}
//		
		
	}

	private void compareNumber(int comNumber, int select) {
		if (comNumber < select) {
			System.out.println(select + "보다 작습니다.");
		}
		if (comNumber > select) {
			System.out.println(select + "보다 큽니다.");
		}
		if (comNumber == select) {
			System.out.println("성공!!! " + cnt + "번 만에 맞췄습니다.");
		}
	}

	
	

}
