

public class Ex04_break_continue {

	public static void main(String[] args) {
//		 반복 제어문 : break, continue
//		 break : 중단 (반복을 중단하고 현재 실행중인 반복문 빠져나감)
//		 continue : 이어서 다음 반복을 처리한다.
//		--------------------------------------------
		
		// 1부터 10까지 출력하되 8은 출력하지 말 것
		for (int i = 1; i <= 10; i++) {
			if(i != 8) {
				System.out.print(i + " ");
				}
			}
		System.out.println("\n----- continue 사용 -----");
		// 1 부터 10까지 출력하되 8은 출력하지 말고 다음 반복 처리
		for (int i = 1; i <= 10; i++) {
			if (i == 8) continue;
			System.out.print(i + " ");
		}
		System.out.println(); //줄바꿈
		
		// \n : 줄바꿈(new line)
		System.out.println("\n======= break 문 ======");
		//1~10 출력중 8을 만나면 처리 중단
		for (int i = 1; i <= 10; i++) {
			if (i == 8) break;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(">> 반복문 종료 후~~");
	}
}
