
public class Ex03 {

	public static void main(String[] args) {
		// 십진수, 2진수, 8진수, 16진수
		
		int decimal = 10;
		// 10이라는 값을 변수 decimal에 저장, 치환한다.
		
		// int binary = 1010; => 10진수로 표현
		// 접두어에 0b, 0B 쓰면 2진수 표현방식으로 쓸 수 있음.
		int binary = 0b1010;
		
		int octal = 012;
		// 접두어에 숫자 0 사용하면 8진수로 표현.
		
		int hexaDecimal = 0Xa;
		// 접두어에 0x, 0X 사용하면 16진수로 표현.
		//						     10 11 12 13 14 15
		//16진수 : 0 1 2 3 4 5 6 7 8 9 a b c d e f
		//16진수 : 0 1 2 3 4 5 6 7 8 9 A B C D E F
		
		System.out.println("decimal : " + decimal);
		System.out.println("binary : " + binary);
		System.out.println("octal : " + octal);
		System.out.println("hexaDecimal : " + hexaDecimal);
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toHexString(10));
		
		
	}

}
