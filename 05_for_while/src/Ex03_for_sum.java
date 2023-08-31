
public class Ex03_for_sum {

	public static void main(String[] args) {
		// 문제 : 1~10 까지의 합계를 구하시오 (for, 화면출력)
		// 1~10까지의 합계 : 55
//		int sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
//		System.out.println("1~10까지의 합계 : " + sum);
		System.out.println("------------");
		
		int sum = 0; //합계 저장할 변수(공간)
		
		for (int i = 1; i <= 10; i++ ) {
			sum = sum + i;
			// System.out.println(" i = " + i + ", sum : } " sum);
			
		}
		System.out.println("1~10까지의 합계 : " + sum);
//		for(sum = 1; sum <= 10 ; sum++ ) {
//			System.out.println(sum + 1);
//		}
		System.out.println("------------");
		
			//(실습) 1 ~ 10까지의 숫자중에 짝수 찾아서 출력 (2, 4, 6, 8, 10)
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("짝수 : " + i);
			}
		}
		System.out.println("------------");
		
			//(실습) 1 ~ 10까지의 숫자중에 홀수 찾아서 출력 (1, 3, 5, 7, 9)
		for (int i = 1; i <= 10; i += 2) {
		if (i % 2 != 0) {
			System.out.println("홀수 : " + i);	
			}
		} 
		System.out.println("------------");
		
	}

}
