package com.mystudy.ex03_sungjuk;

public class SungjukTest {

	public static void main(String[] args) {
		System.out.println("--- main() 시작 ----");
		SungjukVO stu = new SungjukVO("홍길동", 100, 90, 80, 0, 0);
		stu.setKor(999);
		
		System.out.println("--- setEng() 처리 ----");
		try {
			stu.setEng(959);
		} catch (JumsuOutOfValueException e) {
			e.printStackTrace();
			System.out.println(e.getMessage() 
					+ " 0~100 범위의 값으로 다시 입력하세요.");
		} catch (SungjukProcessException e) {
			System.out.println("[예외발생] 성적처리중 예외발생");
		}
		
		System.out.println("stu : " + stu);
		//stu : SungjukVO [name=홍길동, kor=100, eng=90, math=80, tot=0, avg=0.0]
		//SungjukVO에서 toString 구현 안 해두면 주소만 뜬다
		//구현 안 했는데 위처럼 출력하고 싶으면 stu.toString();
		
		System.out.println("--- main() 끝 ------");
	}

}
