
public class Ex03_byte {

	public static void main(String[] args) {
		// 정수형 byte : 정수 숫자를 저장한다. 256개(-128 ~ 127)
		byte byte1 = 100;
		// 값 128부턴 오류남.
		byte byte2 = 28;
		
		
		System.out.println("byte1 : " + byte1);
		System.out.println("byte2 : " + byte2);

		// 연산결과 값이 표현범위를 벗어나면 예상치 못한 쓰레기값이 될 수 있음.
		byte byte3 = (byte)(byte1 + byte2); //문법적으론 맞음.
		System.out.println("byte1 + byte2 : " + byte3);
		
		//-------------
		System.out.println("---- byte 최소, 최대값 ----");
		System.out.println("byte 최소값 : " + Byte.MIN_VALUE);
		System.out.println("byte 최소값 : " + Byte.MAX_VALUE);
		
		
	}

}
