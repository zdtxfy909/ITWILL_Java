
public class Ex08_for_gugudan {

	public static void main(String[] args) {
		/* 구구단 중 2단 출력
		2 * 1 = 2
		2 * 2 = 4
		2 * 3 = 6
		...
		2 * 9 = 18
		=============*/
//		System.out.println("2 * 1 = 2");
		System.out.println("2 * " + 1 + " = " + (2*1));
		System.out.println("2 * " + 2 + " = " + (2*2));
		System.out.println("2 * " + 3 + " = " + (2*3));
		System.out.println("2 * " + 4 + " = " + (2*4));
		System.out.println("2 * " + 5 + " = " + (2*5));
		System.out.println("-----------");

		int dan = 2; //단만 수정해주면 됨
		
		System.out.println("---" + dan + "단 출력---");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i)); 
			//중복되는 거 변수처리
		}
		dan++;
		
		System.out.println("---" + dan + "단 출력---");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i)); 
			//중복되는 거 변수처리
		}
		dan++;
		
		System.out.println("---" + dan + "단 출력---");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i)); 
			//중복되는 거 변수처리
		}
		dan++;
		
		System.out.println("====== 2 ~ 9단 출력 =======");

		dan = 2;
		for (int m =1; m <= 8; m++) {
			System.out.println("---" + dan + "단 출력---");
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + "*" + i + "=" + (dan * i)); 
				//중복되는 거 변수처리
			}
			dan++;
		}

		System.out.println("****** 2 ~ 9단 출력 ******");
		for (dan = 2; dan <= 9; dan++) {
			System.out.println("---" + dan + "단 출력---");
			for (int gop = 1; gop <= 9; gop++) {
				System.out.println(dan + "*" + gop + "=" + (dan * gop)); 

				}
				
		}
	}
}


