
public class Ex06_long {

	public static void main(String[] args) {
		// 정수형 long : 8byte
		long num1 = 2000000000L; //20억, long을 의미하는 접미어 L 사용
		//long 타입값 명시적 표현 : 숫자 + L 또는 l (대소문자)
		long num2 = 20000000000L; //200억
		long num3 = 3000000000L;
		long sum = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println("================");
		
		byte numByte = 10;
		short numShort = 3000;
		int numInt = 3000000;
		long numLong = 5000000000000L;
		
		numByte = (byte) numShort; // 손실발생 가능성 있음 - 쓰레기값 발생
		System.out.println("numByte : " + numByte);
		
		numLong = numInt; //자동형변환 long 타입이 int 타입보다 크기때문에.
		System.out.println("numLong : " + numLong);
		
		System.out.println("long 최소값 : " + Long.MIN_VALUE);
		System.out.println("long 최대값 : " + Long.MAX_VALUE);
		
	}

}
