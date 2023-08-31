
public class Ex09_for_gugudan2 {

	public static void main(String[] args) {
		/* 구구단 2 ~ 9단 출력
		2*1=2	3*1=3	...	9*1=9	
		2*2=4	3*2=6	... 9*2=9
		2*3=6	3*3=9	... 9*3=17
		...		...
		2*9=18	3*9=27	... 9*9=81
		================== */
		
		System.out.println("*" + " " + "*" + " " + "*" + " ");
		System.out.println("*" + "\t" + "*" + "\t" + "*" + "\t"); //탭위치로 이동
		System.out.println("2*1=2" + "\t" + "3*1=3" + "\t" + "9*1=9" + "\t");
		System.out.println("2*2=2" + "\t" + "3*2=3" + "\t" + "9*2=9" + "\t");
		System.out.println("-----------------");
	
		
//		int num = 1;
//		for (int line = 1; line <= 9; line++) {
//			for (int dan = 2; dan <= 9; dan++) {
//				System.out.print(dan + "*" + num + "=" + (dan*num) + "\t");
//			}
//			System.out.println();
//			num++;
//		}
		
		// line과 num이 겹침. 하나로 정의
		
		for (int gop = 1; gop <= 9; gop++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "*" + gop + "=" + (dan*gop) + "\t");
			}
			System.out.println();

		}
		
		System.out.println("=================");

		for (int i = 1; i <= 9; i++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.print(dan +"*"+ i + "=" + (dan*i) + "\t");
			}
			System.out.println();
		
		}
	}

}
