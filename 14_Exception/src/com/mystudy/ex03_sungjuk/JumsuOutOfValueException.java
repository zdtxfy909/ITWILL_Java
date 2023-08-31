package com.mystudy.ex03_sungjuk;

// 내가 만든 성적처리익셉션을 상속확장하는 점수아웃오브익셉션
public class JumsuOutOfValueException extends SungjukProcessException {

	public JumsuOutOfValueException() {
		super("점수범위(0~100)를 벗어난 값입니다.");
	}
	
	public JumsuOutOfValueException(String msg) {
		super(msg);
	}
	
	
}
