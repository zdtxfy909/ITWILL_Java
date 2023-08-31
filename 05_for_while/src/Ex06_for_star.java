

public class Ex06_for_star {

	public static void main(String[] args) {
		// for문을 이용해서 별찍기
		// ***** 화면출력
		System.out.println("*****");
		System.out.println("-----------");
		
		System.out.print("*****"); //프린트는 줄바꿈 안됨
		System.out.println(); // 줄바꿈 역할만
		System.out.println("-----------");
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		System.out.println("---- 반복문 print *(별) 찍기 반복 ----");
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println(); //중괄호 안으로 들어가면 줄바꿈 반복됨.
		
		/* 문제 : 4개 행에 출력처리 ( 각 행별로 * 5개 출력)
		 *****
		 *****
		 *****
		 *****
		 ------------------------------*/
		System.out.println("---- for문 적용 ----");
		// 첫번째 줄
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		// 두번째 줄
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		// 세번째 줄
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		// 네번째 줄
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.println("==== 반복처리 ====");
		
		for (int line = 1; line <= 4; line++) {
			for (int i = 1; i <= 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------");
		
		for (int i = 1; i <= 3; i++) {
			System.out.print("*****");
			System.out.println();
		}
		
		System.out.println("-----------");
		
		for (int i = 1; i <= 3; i++) { //줄바꿈 3번 반복
			for (int star = 1; star <= 5; star++) { //*찍기를 한줄에 다섯번 반복
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==== 삼각형 * 찍기 ====");
		/* 화면(콘솔창)에 삼각형 모양을 출력
		 * 			1라인 : * 1개 + 줄바꿈
		 **			2라인 : * 2개 + 줄바꿈
		 ***		3라인 : * 3개 + 줄바꿈
		 ****		4라인 : * 4개 + 줄바꿈
		 *****		5라인 : * 5개 + 줄바꿈
		 ----------------------*/

		for(int i =1; i <= 1; i++) {
			System.out.print("*");
			}
			System.out.println();
		
		for(int i =1; i <= 2; i++) {
			System.out.print("*");
			}
			System.out.println();
		
			for(int i =1; i <= 3; i++) {
				System.out.print("*");
				}
				System.out.println();
		
				for(int i =1; i <= 4; i++) {
					System.out.print("*");
					}
					System.out.println();
		
					for(int i =1; i <= 5; i++) {
						System.out.print("*");
						}
						System.out.println();
		System.out.println("====================");
		
		int cnt = 1;
		for (int line = 1; line <= 5; line++) {
		for(int i =1; i <= cnt; i++) {
			System.out.print("*");
			}
		System.out.println(); 
		cnt++;
		}
	
		
		System.out.println("====================");
		for(int i =1; i <= cnt; i++) {
			System.out.print("*");
			}
		System.out.println();
		cnt++;
		
		for(int i =1; i <= cnt; i++) {
			System.out.print("*");
			}
		System.out.println();
		cnt++;
		
		for(int i =1; i <= cnt; i++) {
			System.out.print("*");
			}
		System.out.println();
		cnt++;
		
		for(int i =1; i <= cnt; i++) {
			System.out.print("*");
			}
		System.out.println();
		cnt++;
		System.out.println("====================");	
		
		
//		for(int i = 1; i <= 5; i++) { //줄바꿈 5번 반복
//			for (int j = 0; j < i; j++ ) { // i가 j보다 같지않을 때까지 *찍기
//			System.out.print("*");
//		}
//			System.out.println();
//		}
		
		int starCnt = 1;
		
		for (int line = 1; line <= 5; line++) {
			for (int star = 1; star <= starCnt; star++) {
				System.out.print("*");
			} 
			System.out.println();
			starCnt++;
		}
	}
}
