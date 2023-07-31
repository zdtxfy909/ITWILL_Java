package com.mystudy.scanner4_scissors;

import java.util.Scanner;

public class ScannerScissors {
	Scanner scan = new Scanner(System.in);
	int random = (int)(Math.random() * 3) + 1;
	
	public void playGame() {
		while (true) {
			int random = (int)(Math.random() * 3) + 1;
			//System.out.println(random);
			
			showSelect();
			
			int select = scan.nextInt();
			//System.out.println(select);

			if (random == select) {
				System.out.println(">> draw");
			} else if (random == 1 && select == 3) {
				System.out.println(">> computer_win");
			} else if (random == 2 && select == 1) {
				System.out.println(">> computer_win");
			} else if (random == 3 && select == 2) {
				System.out.println(">> computer_win");
			} else if (random == 1 && select == 2) {
				System.out.println(">> person_win");
			} else if (random == 2 && select == 3) {
				System.out.println(">> person_win");
			} else if (random == 3 && select == 1) {
				System.out.println(">> person_win");
			}
			
			if (select == 0) {
				System.out.println(">> 게임을 종료합니다.");
				break;
			}
			System.out.println("====================");

		}
	}

	private void showSelect() {
		System.out.println("1.가위   2.바위   3.보   0.종료");
		System.out.print("선택값 입력 : ");
		
	}
	
	
	

}
