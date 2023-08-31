//클래스를 정의
public class Ex02 {
	//메소드
	public static void main(String[] args) {
		System.out.println("Hello World!!");
		//문장의 끝에는 세미콜론 꼭 붙이기
		// 한 줄 주석문 : 주석부호(//)부터 문장의 끝까지를 주석(설명문)처리
		
		/*
		여러줄 주석 처리시 사용
		*/
		
		// 문자열 string 좌우측 + 연산자는 문자열 붙이기 처리됨
		System.out.println("1234567" + 1);
		System.out.println(1234567 + 1);
		System.out.println(2+2); 
		
		System.out.println("============");
		
		/*
		 * 화면(콘솔창)에 삼각형 모양을 출력
		 * 
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * ==============
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * ==============
		 */
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		System.out.println("============");
		System.out.println("    *");
		System.out.println("   **");
		System.out.println("  ***");
		System.out.println(" ****");
		System.out.println("*****");
		System.out.println("============");
		
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		System.out.println("=============");
		System.out.println("    *");
		System.out.println("   **");
		System.out.println("  ***");
		System.out.println(" ****");
		System.out.println("*****");
		System.out.println("=============");
		//복붙 : 컨트롤 알트 방향키 
		
		/*화면에 구구단 출력하기 (2단)
		 2 * 1 = 2 // 2*1의 결과값
		 2 * 2 = 4
		 */
		
		System.out.println("구구단 2단");
		System.out.println("2 * 1 = 2");
		System.out.println("2 * 2 = 4");
		System.out.println("2 * 3 = " + 2 * 3);
		System.out.println("2 * 4 = " + (2 * 4));
		// 보기 좋게 띄어쓰기와 괄호 사용해주기
		System.out.println("...");
		System.out.println("2 * 9 = " + (2 * 9));
		System.out.println("=============");
		
		//97단 출력
		/* 
		 97 * 1 = 97
		 97 * 2 = ???
		 97 * 3 = ???
		 ...
		 97 * 9 = ???
		 */
		
		System.out.println("97 * 1 = " + (97 * 1));
		System.out.println("97 * 2 = " + (97 * 2));
		System.out.println("97 * 3 = " + (97 * 3));
		System.out.println("...");
		System.out.println("97 * 9 = " + (97 * 9));
		System.out.println("=============");
		
	}

}
