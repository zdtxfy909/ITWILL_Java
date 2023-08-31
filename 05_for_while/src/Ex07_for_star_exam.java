

public class Ex07_for_star_exam {

	public static void main(String[] args) {
		/* 문제1 -----------------
		  ***** : * 5번 + 줄바꿈
		  ****  : * 4번 + 줄바꿈
		  ***   : * 3번
		  **	: * 2번
		  *		: * 1번
		 ---------------------*/
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
		
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
		
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();


//		System.out.println("----------");
//		
//		for(int i = 1; i <= 1; i++) {
//			System.out.print("*");
//		} 
//		System.out.println();
//		
//		for(int i = 1; i <= 2; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		for(int i = 1; i <= 3; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		for(int i = 1; i <= 4; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//
//		for(int i = 1; i <= 5; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		System.out.println("----------");
		
//		int cnt = 1;
//		for (int i = 1; i <= cnt; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		cnt++;
//		
//		for (int i = 1; i <= cnt; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		cnt++;
//		
//		for (int i = 1; i <= cnt; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		cnt++;
//		
//		for (int i = 1; i <= cnt; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		cnt++;
//		
//		for (int i = 1; i <= cnt; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		cnt++;
//		
//		System.out.println("----------");
		
//		int cnt = 1;
//		for (int line = 1; line <= 5; line++) { // 중괄호 내에 있는 거 5번 반복해라
//			for (int i = 1; i <= cnt; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			cnt++;
//		}
		System.out.println("/문제1======================");
//		int cnt = 5;
//		for (int line = 1; line <= 5; line++) {
//			for (int i = 1; i <= cnt; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			cnt--;
//		}
		
		System.out.println("/문제2======================");
		
		/* 문제2 ----------------
		     *  : 빈칸 4 + * 1개 + 줄바꿈
		    **  : 빈칸 3 + * 2개 + 줄바꿈
		   ***
		  ****
		 *****
		 ---------------------*/
		int spaceCnt = 4;
		int starCnt = 1;
		
		for (int line = 1; line <= 5; line++) {
		for (int space = 1; space <= spaceCnt; space++) {
			System.out.print(" ");
		}
		for (int star = 1; star <= starCnt; star++) {
			System.out.print("*");
		}
		System.out.println();
		spaceCnt--;
		starCnt++;
		}
		
		System.out.println("/문제3======================");
		
		
		/* 문제3 ---------------
		***** : 빈칸0 + * 5개 + 줄바꿈
		 **** : 빈칸1 + * 4개 + 줄바꿈
		  *** : 빈칸2 + * 3개 + 줄바꿈
		   **
		    *
		 ----------------------*/
//		int spaceCnt2 = 0;
//		int starCnt2 = 5;
//		
//		for (int line = 1; line <= 5; line++) {
//		for (int space = 0; space < spaceCnt2; space++) {
//			System.out.print(" ");
//		}
//		for (int star = 1; star <= starCnt2; star++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		spaceCnt2++;
//		starCnt2--;
//		}
		
		
		spaceCnt = 0;
		starCnt = 5;
		for (int line = 1; line <= 5; line++) {
			// 빈칸 출력 반복문(0,1,2,3,4)
			for (int space = 1; space <= spaceCnt; space++) {
				System.out.print(" ");
			}
			// "*" 출력 반복문(5,4,3,2,1)
			for (int i = 1; i <= starCnt; i++) {
				System.out.print("*");
			}
			System.out.println();
			spaceCnt++;
			starCnt--;
		}
		
		System.out.println("/문제4======================");
		
		/* 문제4 ---------------
		1			: (1 + 빈칸1) + 줄바꿈 
		1 2			: (1 + 빈칸1) + (2 + 빈칸1) + 줄바꿈
		1 2 3		: (1 + 빈칸1) + (2 + 빈칸1) + (3 + 빈칸1) + 줄바꿈
		1 2 3 4		
		-----------------------*/
		int cnt = 1;
		
		for (int line = 1; line <= 4; line++) {
			int num = 1; // 반복이 끝나면 num은 1로 초기화
			for (int i = 1; i <= cnt; i++) {
				System.out.print(num + " ");
				num++; // i의 반복 수만큼 num의 수도 증가함
			}
		System.out.println();
		cnt++;
		}
		
		System.out.println("=============================");
		/* 문제5 ---------------
		 1 			: (1 + 빈칸1) + 줄바꿈
		 2 3		: (2 + 빈칸1) + (3 + 빈칸1) + 줄바꿈
		 4 5 6
		 7 8 9 10
		 -----------------------*/
		
		cnt = 1;
		int num = 1;
		
		for (int line = 1; line <= 4; line++) {
			for (int i = 1; i <= cnt; i++) {
				System.out.print(num++);
				System.out.print(" ");
			}
			System.out.println();
			cnt++;
		}
		
		
		//1
		
//		for (int line = 1; line <= 1; line++) {
//			for (int i = j; i <= j; i++) {
//				for (int j = 1; j <= num2 )
//			System.out.print(num2);
//			System.out.print(" ");
//			}
//			num2++;
//			}
//		System.out.println();
//		
//		for (int line = 1; line <= 2; line++) {
//		for (int i = j; i <= j; i++) {
//		System.out.print(num2);
//		System.out.print(" ");
//		}
//		num2++;
//		}
//		System.out.println();
//		
//		for (int line = 1; line <= 3; line++) {
//		for (int i = j; i <= j; i++) {
//		System.out.print(num2);
//		System.out.print(" ");
//		}
//		num2++;
//		}
//		System.out.println();
//		
//		for (int line = 1; line <= 4; line++) {
//		for (int i = j; i <= j; i++) {
//		System.out.print(num2);
//		System.out.print(" ");
//		}
//		num2++;
//		}
//		System.out.println();
//		
		System.out.println("=============================");
	}

}
