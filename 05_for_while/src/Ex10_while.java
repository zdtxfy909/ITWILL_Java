

public class Ex10_while {

	public static void main(String[] args) {
		// 반복문 : while, do ~ while
		/* while 반복문 사용 형태
		
		반복인자의 선언 및 초기값 설정;
		while (실행조건식) {
			반복인자값 증감설정(선택적);
			실행문(들);
			반복인자값 증감설정(선택적);
		}
		--------------------*/
		
		// 1~10까지 화면출력
		for (int i = 1; i <= 10; i++) { //변수선언 , 사용해서 여러개 선언 가능
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("--------------");
		
		// while문으로 작성
		int i = 1; // 변수선언 해주기
		while (i <= 10) { // 조건식
			System.out.print(i + " "); //실행문
			i++; // 증감 안 하면 무한루프. 실행문 이후 증감처리
		}
		System.out.println();
		System.out.println("--------------");
		
		i = 0; // 변수 가져다 쓰기
		while (i < 10) {
			i++; //증감식 자리 이동 - > i는 0인데 증감부터해서 1부터 시작함
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("--------------");
		
		
		System.out.println("====== break, continue ======");
		// break : 현재 실행중인 반복문을 종료하고 빠져나감.
		// while 무한반복
		int num = 1;
		while (true) {
			System.out.println(num); // num++일 경우 계속 실행된다. (무한반복)
			if (num >= 10) break; // 같아지면 반복중단. 
			num++; // 증감식 안 들어가면 무한반복됨
		}	
		
		System.out.println("------- continue 문 -------");
		// 위치 잘못 쓰면 무한반복됨
		
		num = 0;
		while (num < 10) {
			num++;
			if (num == 5) continue; //증감식 위치에 따라 무한루프 걸림
			System.out.print(num);
			System.out.print(" ");
		}
		System.out.println();
		
		System.out.println("------- for continue -------");
		for (int m = 1; m <= 10; m++) {
			if (m == 5) continue; 
			System.out.print(m); //  1 2 3 4 6 7 8 9 10
			System.out.print(" ");
		} 
		System.out.println();
		System.out.println("--------------");
		
		for (int m = 1; m <= 10; m++) {
			if (m % 2 == 0) continue; 
			System.out.print(m); // 짝수는 지나가고 홀수만 나옴
			System.out.print(" ");
		} 
		System.out.println();
		
		System.out.println("==== do ~ while =========");
		/* do ~ while 반복문 사용 형태
		반복인자의 선언 및 초기값 설정;
		do {
			반복인자값 증감설정(선택적);
			실행문(들);
			반복인자값 증감설정(선택적);
		} while (실행조건식); //문장의 끝을 알려주는 ; 붙음
		--------------------*/
		//1 ~ 10까지 출력
		num = 1;
		do {
			System.out.println("do ~ while : " + num);
			num++;
		} while (num <= 10); // num에 1000 넣어도 조건문 먼저 만나서 무조건 1번은 실행됨
		
		
		System.out.println("=========================");

		System.out.println("--- 내부 반복문에서 break 처리시 ----");
		for (int out = 1; out <= 3; out++) { //외부는 3번 반복
			System.out.println(":: out : " + out);

			for (int in = 1; in <= 5; in++) { //내부는 5번 반복
				System.out.println("out : " + out + ", in : " + in);
				if (out == 2) break; // 실행문 뒤에라 한줄은 뜬다. 내부 반복문만 종료됨
			}

			System.out.println("-----------");
		}
		System.out.println("==========================");
		
		System.out.println("==== 중첩 반복문 모두 중단하기 ====");
		//중첩 반복문을 모두 종료해야 하는 경우(위치지정 break문 사용)
		//라벨지정
		outFor: 
			for (int out = 1; out <= 3; out++) { 
				System.out.println(":: out : " + out);

				for (int in = 1; in <= 5; in++) { 
					System.out.println("out : " + out + ", in : " + in);
					if (out == 2) break outFor; //외부반복문 중단처리
				}

				System.out.println("-----------");
			}

		System.out.println(">>>> 프로그램 끝");
		
		
	}

}
