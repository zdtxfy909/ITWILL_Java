
public class Ex02_char {

	public static void main(String[] args) {
		// 문자형(char) : 2byte 사용, 문자 1글자 저장(0 ~ 65535)
		// 자바 문자처리 방식은 유니코드(Unicode) 형태
		char char1 = 'A'; // "" 사용하면 안됨. "A"는 String
		System.out.println("char1 : " + char1);
		System.out.println("char1 다음문자 : " + char1 + 1);
		System.out.println("char1 다음문자 : " + (char1 + 1));
		// A는 내부적으로 저장하는 값이 65임을 알 수 있음.
		System.out.println("char1 다음문자 : " + (char)(char1 + 1));
		// 소괄호 안에 데이터타입 쓰면 형변환하는 거임. 65+1 -> char로 형변환.
		
		char char2 = '한';
		System.out.println("char2 : " + char2);
		
		char char3 = '\uAC00'; //유니코드 값으로 설정
		//16진수 AC 두개가 4바이트, 00 두개가 4바이트
		System.out.println("char3 : " + char3);
		
		System.out.println("-----------");
		System.out.println("char1 : " + char1); // A, 65
		
		char1 = (char)(char1 + 1); // char <- int 강제 형변환
		System.out.println("char1(다음값) : " + char1);
		
		System.out.println((int)'A');
		
	}

}
