
public class Ex05_for_exam {
	
	public static void main(String[] args) {
		// 문제 : 1 ~ 10까지의 숫자중 짝수 출력

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("짝수(2의배수) : " + i);
			}
		}
		System.out.println("-----------------------");

		//(실습) 1~10까지의 숫자 중 3의 배수인 숫자를 출력
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.println("홀수(3의배수) : " + i);
			}
		}
		System.out.println("-----------------------");
		//(실습) 900 ~ 1000까지의 숫자 중 17의 배수를 출력
		for (int i = 900; i <= 1000; i++) {
			if (i % 17 == 0) {
				System.out.println("홀수(17의배수) : " + i);
			}
		}
		System.out.println("-----------------------");
		// 변수를 사용해서 일반화 하기
		int startNum = 50000;
		int endNum = 60000;
		int divNum = 199;
		//(실습) 2000 ~ 3000까지의 숫자 중 19의 배수를 출력
		for (int i = startNum; i <= endNum; i++) {
			if (i % divNum == 0) {
				System.out.println(divNum + "의배수 : " + i);
			}
		}
	}
}	
