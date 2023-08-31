
public class Ex04_plusEqual {

	public static void main(String[] args) {
		// 대입연산자 : =, +=, -=, *=, /=, %=
		// 예) num += 2; ---> num = num + 2;
		int result = 0;
		System.out.println("result : " + result);
		
		result += 15; // result = result + 15;
		System.out.println("result += 15 : " + result);
		
		// 변수 선언하면 빈공간이 생김
		// result 저장공간에 0이 먼저 들어감
		// 기존의 값이 15로 바뀐다.
		
		result += 15; // result = result + 15;
		System.out.println("result += 15 : " + result);
		System.out.println(); //줄바꿈
		
		System.out.println("---- -= 연산 -----");
		System.out.println("result : " + result);
		result -= 10; // result = result - 10;
		System.out.println("result -= 10 : " + result);
		System.out.println(); //줄바꿈
		
		System.out.println("---- *= 연산 -----");
		result *= 10; // result = result * 10;
		System.out.println("result *= 10 : " + result);
		System.out.println(); //줄바꿈
		
		System.out.println("---- /= 연산 -----");
		result /= 10; // result = result / 10; 몫만 나옴
		System.out.println("result /= 10 : " + result);
		System.out.println(); //줄바꿈
		
		System.out.println("---- %= 연산 -----");
		result %= 3; // result = result % 3; 나머지값 구하기
		System.out.println("result %= 3 : " + result);
		System.out.println(); //줄바꿈
		
	}

}
