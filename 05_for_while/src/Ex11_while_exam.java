
public class Ex11_while_exam {

	public static void main(String[] args) {
		// while문 사용해서 처리
		// (실습) 문제1 : 1~10까지의 합을 구하고 화면에 출력
		System.out.println("----문제1(while)-----");
		int i = 1;
		int sum = 0;
		while (i <= 10) {	
			sum += i;
			//System.out.println("i : " + i + ", sum : " + sum);
			i++;
		}	
			System.out.println("sum : " + sum);
			
		System.out.println("----문제1(for)-----");
		sum = 0;
		for (int j = 1; j <= 10; j++) {
			sum += j;
		}
		System.out.println("sum : " + sum);
		
		/* (실습) 문제2 ---------
		*****
		*****
		*****
		---------------------- */
		System.out.println("----문제2(while)-----");
		i = 1;
		int line = 1;
		while (line <= 3) {
			i = 1; // 초기화 안 해주면 while (6 <= 5)가 돼서 실행안됨
			while (i <= 5) {
				System.out.print("*");
				i++;
			}
			System.out.println();
			line++;
		}
		
		System.out.println("----문제3-----");
		
		/* (실습) 문제3 ----------
		*
		**
		***
		****	
		---------------------- */
		
		int Cnt = 1;
		line = 1;
		
		while (line <= 4) {
			i = 1;
			while (i <= Cnt) {
				System.out.print("*");
				i++;
			} 
			System.out.println();
			Cnt++;
			line++;
		}
	}

}
